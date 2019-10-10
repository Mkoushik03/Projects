package com.example.dark_ninja.passwordmanager;

import android.app.Activity;
import android.app.AlertDialog;
import android.database.Cursor;
import android.os.Bundle;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ForgotPass extends AppCompatActivity {

    TextView ques;
    Button search, sub;
    EditText edt2,edt1;
    PMDatabase pmDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_pass);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        pmDatabase = new PMDatabase(ForgotPass.this);

        edt1 = findViewById(R.id.usr);
        edt2 = (TextInputEditText) findViewById(R.id.aser);
        ques = findViewById(R.id.ques);



        search = findViewById(R.id.search);
        sub = findViewById(R.id.submit);


        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String a = edt1.getText().toString();

                Cursor ct = pmDatabase.forgotp(a);

                if (ct.getCount() == 0) {
                    Toast.makeText(getApplicationContext(), "No data ", Toast.LENGTH_LONG).show();
                } else {
                    while (ct.moveToNext()) {
                        edt2.setText("");
                        ques.setText(ct.getString(3));
                    }
                }
            }


        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String a = edt1.getText().toString();
                String b = edt2.getText().toString();
                Cursor ce = pmDatabase.forgotp(a);

                if (ce.getCount() == 0) {
                    Toast.makeText(getApplicationContext(), "No data ", Toast.LENGTH_LONG).show();
                } else {

                    StringBuffer stringBuffer = new StringBuffer();
                    while (ce.moveToNext()) {

                        String s = ce.getString(4);

                        if (b.equals(s)) {
                            stringBuffer.append("Username: " + ce.getString(1)+"\n");
                            stringBuffer.append("Password: " + ce.getString(2)+"\n");
                        } else {
                            Toast.makeText(getApplicationContext(), "Wrong Answer", Toast.LENGTH_LONG).show();
                        }
                    }
                    showdata("Login Detail",stringBuffer.toString());
                }
            }
        });

    }

    public void showdata(String title, String hudai)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(title);
        builder.setMessage(hudai);
        builder.setCancelable(true);
        builder.show();
    }

    public void hidekeyboard(View view) {

        InputMethodManager inputMethodManager =
                (InputMethodManager) getSystemService(Activity.INPUT_METHOD_SERVICE);
        inputMethodManager.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), 0);
    }
}
