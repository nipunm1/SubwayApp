package com.example.subwayapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class LogInActivity extends AppCompatActivity {
TextInputEditText name,pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);
        name = findViewById(R.id.name);
        pass = findViewById(R.id.pass);
    }

    public void onclick2(View view){
        int id = view.getId();
        if(id==R.id.loginbtn){
            String u_email = name.getText().toString();
            String u_pass = pass.getText().toString();
            if(TextUtils.isEmpty(u_email)){
                Toast.makeText(LogInActivity.this, "Please enter username", Toast.LENGTH_LONG).show();
                return;
            }
            if(TextUtils.isEmpty(u_pass)){
                Toast.makeText(LogInActivity.this, "Please enter password", Toast.LENGTH_LONG).show();
                return;
            }
            else{
                Intent intent = new Intent(LogInActivity.this,WelcomeActivity.class);
                startActivity(intent);
            }
        }
    }
}
