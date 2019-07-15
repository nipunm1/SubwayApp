package com.example.subwayapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class WelcomeActivity extends AppCompatActivity implements View .OnClickListener{
Toolbar toolbar;
ImageButton leanimgbtn,pourimagebtn,earnimgbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        toolbar = findViewById(R.id.toolbar);
        leanimgbtn = findViewById(R.id.btnlearn);
        pourimagebtn = findViewById(R.id.btnpour);
        earnimgbtn = findViewById(R.id.btnearn);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Welcome");
        toolbar.setSubtitle("User");
        leanimgbtn.setOnClickListener(this);
        pourimagebtn.setOnClickListener(this);
        earnimgbtn.setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {
        int id = view.getId();
        Intent intent = null;
        switch (id){
            case R.id.btnlearn :
                intent = new Intent(WelcomeActivity.this,LearnMoreActivity.class);
                break;
            case R.id.btnpour :
                intent = new Intent(WelcomeActivity.this,PourMoreActivity.class);
                break;
            case R.id.btnearn :
                intent = new Intent(WelcomeActivity.this,EarnMoreActivity.class);
                break;
        }
        if(intent!=null){
            startActivity(intent);
        }
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.home_manu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        switch (id){
            case R.id.search :
                Toast.makeText(WelcomeActivity.this, "Search", Toast.LENGTH_LONG).show();
                break;
            case R.id.feedback :
                Toast.makeText(WelcomeActivity.this, "feedback", Toast.LENGTH_LONG).show();
                break;
            case R.id.settings :
                Toast.makeText(WelcomeActivity.this, "settings", Toast.LENGTH_LONG).show();
                break;
            case R.id.contact :
                Toast.makeText(WelcomeActivity.this, "contact us", Toast.LENGTH_LONG).show();
                break;
            case R.id.follow :
                Toast.makeText(WelcomeActivity.this, "follow us", Toast.LENGTH_LONG).show();
                break;
            case R.id.location :
                Toast.makeText(WelcomeActivity.this, "locate us", Toast.LENGTH_LONG).show();
                break;
            case R.id.logout :
                Toast.makeText(WelcomeActivity.this, "You have Logged out", Toast.LENGTH_LONG).show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }


}
