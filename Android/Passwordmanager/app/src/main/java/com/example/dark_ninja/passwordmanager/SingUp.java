package com.example.dark_ninja.passwordmanager;

import android.app.Activity;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.Toast;

public class SingUp extends AppCompatActivity {

    PMDatabase pmDatabase;
    TextInputEditText sguusername, sgupass, sgucfrmpass, secques, secans;
    Button singup;

    Userdetails userdetails;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sig_up);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        pmDatabase = new PMDatabase(this);
        SQLiteDatabase sqLiteDatabase = pmDatabase.getWritableDatabase();

        sguusername = findViewById(R.id.sguuser);
        sgupass = findViewById(R.id.sgupass);
        sgucfrmpass = findViewById(R.id.sgucfrmpass);
        secques = findViewById(R.id.secques);
        secans = findViewById(R.id.secans);
        singup = findViewById(R.id.singup);

        singup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username1 = sguusername.getText().toString();
                String password1 = sgupass.getText().toString();
                String cnfrpass = sgucfrmpass.getText().toString();
                String sec_ques = secques.getText().toString();
                String sec_ans = secans.getText().toString();

                Userdetails userdetails = new Userdetails();

                userdetails.setUsername(username1);
                userdetails.setPass(password1);
                userdetails.setSecurityques(sec_ques);
                userdetails.setAnswer(sec_ans);

                if (password1.equals(cnfrpass)) {
                    if (!"".equals(username1)) {
                        if (!"".equals(sec_ques)) {
                            if (!"".equals(sec_ans)) {
                                long rowid = pmDatabase.insertdata(userdetails);
                                pmDatabase.createtab(username1);

                                if (rowid > 0) {
                                    Toast.makeText(getApplicationContext(), "inserted successfully", Toast.LENGTH_LONG).show();
                                } else {
                                    Toast.makeText(getApplicationContext(), "insert failed", Toast.LENGTH_LONG).show();
                                }
                            } else {
                                Toast.makeText(getApplicationContext(), "Answer empty", Toast.LENGTH_LONG).show();
                            }
                        } else {
                            Toast.makeText(getApplicationContext(), "Question empty", Toast.LENGTH_LONG).show();
                        }
                    } else {
                        Toast.makeText(getApplicationContext(), "Username empty", Toast.LENGTH_LONG).show();
                    }
                } else {
                    Toast.makeText(getApplicationContext(), "Password's doestn't match", Toast.LENGTH_LONG).show();
                }
            }

        });

    }

    public void hidekeyboard(View view) {

        InputMethodManager inputMethodManager =
                (InputMethodManager) getSystemService(Activity.INPUT_METHOD_SERVICE);
        inputMethodManager.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), 0);
    }

}

