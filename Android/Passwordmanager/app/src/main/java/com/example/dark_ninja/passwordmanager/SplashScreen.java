package com.example.dark_ninja.passwordmanager;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.WindowManager;
import android.widget.ProgressBar;

public class SplashScreen extends AppCompatActivity {

    private ProgressBar prog;
    private int value;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash_screen);


        prog = findViewById(R.id.progressBar2);

        Thread th = new Thread(new Runnable() {
            @Override
            public void run() {
                dowork();
                startapp();
            }
        });
        th.start();


    }
 
    public void dowork() {
        for (value = 0; value <= 100; value = value + 10) {
            try {
                Thread.sleep(250);
                prog.setProgress(value);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void startapp() {
        Intent i = new Intent(this, Login.class);
        startActivity(i);
        finish();
    }
}
