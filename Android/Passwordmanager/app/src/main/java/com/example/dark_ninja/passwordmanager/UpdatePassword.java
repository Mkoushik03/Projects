package com.example.dark_ninja.passwordmanager;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class UpdatePassword extends AppCompatActivity {

    private EditText olduser, updtuser, updtpass, updtemail, updid;
    private Button updtpasss, updtsearch;
    PMDatabase pmDatabase;

    String t1 = " ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_password);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        olduser = findViewById(R.id.srcusername);
        updtuser = findViewById(R.id.updtuser);
        updtpass = findViewById(R.id.updtpass);
        updtemail = findViewById(R.id.updtemail);
        updtpasss = findViewById(R.id.updtp);
        updtsearch = findViewById(R.id.upodtsearch);
        updid = findViewById(R.id.updtid);


        pmDatabase = new PMDatabase(this);
        SQLiteDatabase sqLiteDatabase = pmDatabase.getWritableDatabase();

        final String getsuser = getIntent().getStringExtra("txtusername");

        t1 = getsuser;

        updtsearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String h1 = t1;
                String q1 = olduser.getText().toString();
                String l1 = q1;
                Cursor cur = pmDatabase.showdata(h1, l1);

                if ("".equals(q1)) {
                    Toast.makeText(getApplicationContext(), "No data ", Toast.LENGTH_LONG).show();
                } else {
                    if (cur.getCount() == 0) {

                        updid.setText("");
                        updtuser.setText("");
                        updtpass.setText("");
                        updtemail.setText("");
                    } else {
                        while (cur.moveToNext()) {
                            updid.setText(cur.getString(0));
                            updtuser.setText(cur.getString(1));
                            updtpass.setText(cur.getString(2));
                            updtemail.setText(cur.getString(3));
                        }

                    }
                }
            }
        });

        updtpasss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String q = olduser.getText().toString();
                String w = updtuser.getText().toString();
                String e = updtpass.getText().toString();
                String r = updtemail.getText().toString();
                String y = updid.getText().toString();

                if ("".equals(w)) {

                } else {
                    boolean result = false;

                    result = pmDatabase.srcupdate(t1, w, e, r, y);

                    if (result == true) {
                        Toast.makeText(getApplicationContext(), "Updated successfully", Toast.LENGTH_LONG).show();
                    } else {
                        Toast.makeText(getApplicationContext(), "Update Falied", Toast.LENGTH_LONG).show();
                    }
                }
            }
        });

    }
}
