package com.example.dark_ninja.passwordmanager;

import android.os.Bundle;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class AddPassword extends AppCompatActivity {

    private TextInputEditText acctitle, accuser, accpass, accemail;
    private Button addpss;
    PMDatabase pmDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_password);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        final String getsuser = getIntent().getStringExtra("txtusername");

        pmDatabase = new PMDatabase(AddPassword.this);


        acctitle = findViewById(R.id.acctitle);
        accuser = findViewById(R.id.accuser);
        accpass = findViewById(R.id.accpass);
        accemail = findViewById(R.id.accemail);
        addpss = findViewById(R.id.addpss);

        addpss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {






                if(!" ".equals(acctitle.getText()))
                {
                    if(!" ".equals(accuser.getText()))
                    {
                        if(!" ".equals(accpass.getText()))
                        {
                            if(!" ".equals(accemail.getText()))
                            {
                                String a = acctitle.getText().toString();
                                String b = accuser.getText().toString();
                                String c = accpass.getText().toString();
                                String d = accemail.getText().toString();
                                String e = getsuser;

                                Addpass addpass = new Addpass();

                                addpass.setNewaccounttitle(a);
                                addpass.setNewuser(b);
                                addpass.setNewpassword(c);
                                addpass.setNewemail(d);
                                long rowid1 = pmDatabase.addnew(addpass,e);
                                if (rowid1 > 0) {
                                    Toast.makeText(getApplicationContext(), "inserted successfully", Toast.LENGTH_LONG).show();
                                } else {
                                    Toast.makeText(getApplicationContext(), "insert failed", Toast.LENGTH_LONG).show();
                                }
                            }
                            else
                            {
                                Toast.makeText(getApplicationContext(), "Email Empty", Toast.LENGTH_LONG).show();
                            }
                        }
                        else
                        {
                            Toast.makeText(getApplicationContext(), "Password Empty", Toast.LENGTH_LONG).show();
                        }
                    }
                    else
                    {
                        Toast.makeText(getApplicationContext(), "Username Empty", Toast.LENGTH_LONG).show();
                    }
                }
                else
                {
                    Toast.makeText(getApplicationContext(), "Title Empty", Toast.LENGTH_LONG).show();
                }


            }
        });


    }
}
