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

public class LearnMore2Activity extends AppCompatActivity {
    Toolbar toolbar;
    ImageButton img,img2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn_more2);
        toolbar = findViewById(R.id.toolbar);
        img = findViewById(R.id.nextbtn2);
        img2 = findViewById(R.id.previousbtn2);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Learn More");
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LearnMore2Activity.this,LearnMore3Activity.class);
                startActivity(intent);
            }
        });
        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LearnMore2Activity.this,LearnMoreActivity.class);
                startActivity(intent);
            }
        });
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
                Toast.makeText(LearnMore2Activity.this, "Search", Toast.LENGTH_LONG).show();
                break;
            case R.id.feedback :
                Toast.makeText(LearnMore2Activity.this, "feedback", Toast.LENGTH_LONG).show();
                break;
            case R.id.settings :
                Toast.makeText(LearnMore2Activity.this, "settings", Toast.LENGTH_LONG).show();
                break;
            case R.id.contact :
                Toast.makeText(LearnMore2Activity.this, "contact us", Toast.LENGTH_LONG).show();
                break;
            case R.id.follow :
                Toast.makeText(LearnMore2Activity.this, "follow us", Toast.LENGTH_LONG).show();
                break;
            case R.id.location :
                Toast.makeText(LearnMore2Activity.this, "locate us", Toast.LENGTH_LONG).show();
                break;
            case R.id.logout :
                Toast.makeText(LearnMore2Activity.this, "You have Logged out", Toast.LENGTH_LONG).show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
