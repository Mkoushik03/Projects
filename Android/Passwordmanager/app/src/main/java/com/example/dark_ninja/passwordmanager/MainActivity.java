package com.example.dark_ninja.passwordmanager;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public ImageButton add,show,update;
    public TextView txt1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        add = findViewById(R.id.add);
        show = findViewById(R.id.show);
        update = findViewById(R.id.update);
        txt1 = findViewById(R.id.txtusername);

        final String getuser = getIntent().getStringExtra("txusername");
        txt1.setText(getuser);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,AddPassword.class);
                i.putExtra("txtusername",txt1.getText().toString());
                startActivity(i);

            }
        });
        show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,ShowPassword.class);
                i.putExtra("txtusername",txt1.getText().toString());
                startActivity(i);
            }
        });
        update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,UpdatePassword.class);
                i.putExtra("txtusername",txt1.getText().toString());
                startActivity(i);
            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if(item.getItemId()==R.id.logut)
        {
            Intent i = new Intent(this, Login.class);
            startActivity(i);
            finish();
            return true;
        }
        else if(item.getItemId()==R.id.about)
        {
            Intent i = new Intent(this, About.class);
            startActivity(i);
            finish();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}
