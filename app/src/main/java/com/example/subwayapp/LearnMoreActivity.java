package com.example.subwayapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class LearnMoreActivity extends AppCompatActivity {
    Toolbar toolbar;
    ImageButton imageButtonnext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn_more);
        toolbar = findViewById(R.id.toolbar);
        imageButtonnext = findViewById(R.id.nextbtn1);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Learn More");
        imageButtonnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LearnMoreActivity.this,LearnMore2Activity.class);
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
                Toast.makeText(LearnMoreActivity.this, "Search", Toast.LENGTH_LONG).show();
                break;
            case R.id.feedback :
                Toast.makeText(LearnMoreActivity.this, "feedback", Toast.LENGTH_LONG).show();
                break;
            case R.id.settings :
                Toast.makeText(LearnMoreActivity.this, "settings", Toast.LENGTH_LONG).show();
                break;
            case R.id.contact :
                Toast.makeText(LearnMoreActivity.this, "contact us", Toast.LENGTH_LONG).show();
                break;
            case R.id.follow :
                Toast.makeText(LearnMoreActivity.this, "follow us", Toast.LENGTH_LONG).show();
                break;
            case R.id.location :
                Toast.makeText(LearnMoreActivity.this, "locate us", Toast.LENGTH_LONG).show();
                break;
            case R.id.logout :
                Toast.makeText(LearnMoreActivity.this, "You have Logged out", Toast.LENGTH_LONG).show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
