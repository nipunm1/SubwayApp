package com.example.subwayapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class PourMoreActivity extends AppCompatActivity {
    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pour_more);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Pour More");
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
                Toast.makeText(PourMoreActivity.this, "Search", Toast.LENGTH_LONG).show();
                break;
            case R.id.feedback :
                Toast.makeText(PourMoreActivity.this, "feedback", Toast.LENGTH_LONG).show();
                break;
            case R.id.settings :
                Toast.makeText(PourMoreActivity.this, "settings", Toast.LENGTH_LONG).show();
                break;
            case R.id.contact :
                Toast.makeText(PourMoreActivity.this, "contact us", Toast.LENGTH_LONG).show();
                break;
            case R.id.follow :
                Toast.makeText(PourMoreActivity.this, "follow us", Toast.LENGTH_LONG).show();
                break;
            case R.id.location :
                Toast.makeText(PourMoreActivity.this, "locate us", Toast.LENGTH_LONG).show();
                break;
            case R.id.logout :
                Toast.makeText(PourMoreActivity.this, "You have Logged out", Toast.LENGTH_LONG).show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
