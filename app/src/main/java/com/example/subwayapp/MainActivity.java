package com.example.subwayapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClick(View view){
        Intent intent=null;
        int id = view.getId();
        switch (id){
            case R.id.btn: intent = new Intent(MainActivity.this,SignUpActivity.class);break;
            case R.id.btn2:intent = new Intent(MainActivity.this,LogInActivity.class);break;
        }
        if(intent!=null){
            startActivity(intent);
        }
    }
}
