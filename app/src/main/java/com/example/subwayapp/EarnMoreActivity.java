package com.example.subwayapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class EarnMoreActivity extends AppCompatActivity {
    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_earn_more);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Earn More");
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
                Toast.makeText(EarnMoreActivity.this, "Search", Toast.LENGTH_LONG).show();
                break;
            case R.id.feedback :
                Toast.makeText(EarnMoreActivity.this, "feedback", Toast.LENGTH_LONG).show();
                break;
            case R.id.settings :
                Toast.makeText(EarnMoreActivity.this, "settings", Toast.LENGTH_LONG).show();
                break;
            case R.id.contact :
                Toast.makeText(EarnMoreActivity.this, "contact us", Toast.LENGTH_LONG).show();
                break;
            case R.id.follow :
                Toast.makeText(EarnMoreActivity.this, "follow us", Toast.LENGTH_LONG).show();
                break;
            case R.id.location :
                Toast.makeText(EarnMoreActivity.this, "locate us", Toast.LENGTH_LONG).show();
                break;
            case R.id.logout :
                Toast.makeText(EarnMoreActivity.this, "You have Logged out", Toast.LENGTH_LONG).show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
