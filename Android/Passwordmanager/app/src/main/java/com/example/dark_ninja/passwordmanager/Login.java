package com.example.dark_ninja.passwordmanager;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    private Button login, signup;
    private EditText user_name, pass_word;
    private TextView forgetpass;
    PMDatabase pmDatabase, pmdt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_login);

        pmDatabase = new PMDatabase(Login.this);

        login = findViewById(R.id.login);
        signup = findViewById(R.id.signup);

        forgetpass = findViewById(R.id.forgetpass);

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Login.this, SingUp.class);
                startActivity(i);
            }
        });

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View ve) {

                user_name = (TextInputEditText) findViewById(R.id.usernae);
                pass_word = (TextInputEditText) findViewById(R.id.passwor);
                String userers = user_name.getText().toString().trim();
                String passs = pass_word.getText().toString().trim();

                if ("".equals(user_name)) {
                    Toast.makeText(getApplicationContext(), "Username Empty", Toast.LENGTH_LONG).show();
                } else {
                    if ("".equals(pass_word)) {
                        Toast.makeText(getApplicationContext(), "Password Empty", Toast.LENGTH_LONG).show();
                    } else {
                        boolean result = pmDatabase.findpassword(userers, passs);

                        if (result == true) {
                            Intent j = new Intent(Login.this, MainActivity.class);
                            j.putExtra("txusername", userers);
                            startActivity(j);
                            finish();
                        } else {
                            Toast.makeText(getApplicationContext(), "Failed", Toast.LENGTH_LONG).show();
                        }
                    }
                }
            }
        });
    }


    public void forgotpss(View v) {
        Intent i = new Intent(this, ForgotPass.class);
        startActivity(i);
    }

    public void hidekeyboard(View view) {

        InputMethodManager inputMethodManager =
                (InputMethodManager) getSystemService(Activity.INPUT_METHOD_SERVICE);
        inputMethodManager.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), 0);
    }
}
