package com.example.dark_ninja.passwordmanager;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class ShowPassword extends AppCompatActivity {

    PMDatabase pmDatabase;

    private ListView showpasss;
    private Button showsearch;
    private EditText showusername;
    String t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_password);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        showpasss = findViewById(R.id.showpss);
        showsearch = findViewById(R.id.showsearch);
        showusername = findViewById(R.id.showusername);

         t = getIntent().getStringExtra("txtusername");

        pmDatabase = new PMDatabase(this);
        SQLiteDatabase sqLiteDatabase = pmDatabase.getWritableDatabase();

        showsearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loaddata();
            }
        });

    }

    public void loaddata() {

        ArrayList<String> passes = new ArrayList<>();
        String h = t;
        String l = showusername.getText().toString();
        Cursor cur = pmDatabase.showdata(h,l);

        if (cur.getCount() == 0) {
            Toast.makeText(getApplicationContext(),"No data ",Toast.LENGTH_LONG).show();
        } else {
            while (cur.moveToNext()) {
                passes.add("ID: "+cur.getString(0) + "\n" +"Account Title: "+cur.getString(4) + "\n" +"Username: " +cur.getString(1) + "\n" +"Password: "+cur.getString(2)+ "\n" +"Email: "+cur.getString(3));
            }
        }

        ArrayAdapter<String> ad = new ArrayAdapter<>(this, R.layout.passview, R.id.passsview, passes);
        showpasss.setAdapter(ad);

        showpasss.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long I) {
                 String value = parent.getItemAtPosition(i).toString();
                Toast.makeText(getApplicationContext(),"Selected value: "+value,Toast.LENGTH_LONG).show();
            }
        });

    }
}
