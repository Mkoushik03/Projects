package com.example.dark_ninja.passwordmanager;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import mehdi.sakout.aboutpage.AboutPage;
import mehdi.sakout.aboutpage.Element;

public class About extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Element ele = new Element();
        ele.setTitle("About App");

        Element versionElement = new Element();
        versionElement.setTitle("Version 6.2");

        View aboutPage = new AboutPage(this)
                .isRTL(false)
                .setDescription(" ")
                .setImage(R.drawable.icon)
                .addItem(ele)
                .addItem(versionElement)
                .addEmail("koushik187@gmail.com")
                .addFacebook("MKoushik5.3.1998")
                .create();

        setContentView(aboutPage);



    }
}
