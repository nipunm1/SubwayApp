package com.example.subwayapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class SignUpActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
String sub_location[]={"Select","Pitampura","Shalimar Bagh","Punjabi Bagh","Prashant Vihar","Janakpuri","Vikaspuri","Dwarka","Rajouri Garden","Gurugram","Noida","Greater Kailash","Connaught Place","Saket","Uttam Nagar","Shakti Vihar"};
Spinner spinner;
TextInputEditText name,pass,conf_pass,email;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        spinner = findViewById(R.id.spin_sub_out);
        name = findViewById(R.id.name);
        pass = findViewById(R.id.pass);
        conf_pass = findViewById(R.id.c_pass);
        email = findViewById(R.id.email);
        spinner.setOnItemSelectedListener(this);
        spin();
    }
    public void onClick1(View view){
        int id = view.getId();
        String s_name = name.getText().toString();
        String s_pass = pass.getText().toString();
        String s_cf_pass = conf_pass.getText().toString();
        String s_email = email.getText().toString();
        if(id == R.id.signupbtn){
            if(TextUtils.isEmpty(s_name)){
                Toast.makeText(SignUpActivity.this, "Please enter username", Toast.LENGTH_LONG).show();
                return;
            }
            if(TextUtils.isEmpty(s_pass)){
                Toast.makeText(SignUpActivity.this, "Please enter password", Toast.LENGTH_LONG).show();
                return;
            }
            if(TextUtils.isEmpty(s_cf_pass)){
                Toast.makeText(SignUpActivity.this, "Please confirm password", Toast.LENGTH_LONG).show();
                return;
            }
            if(s_cf_pass.equals(s_pass));
            else{
                Toast.makeText(SignUpActivity.this, "Please enter correct password", Toast.LENGTH_LONG).show();
                return;
            }
            if(TextUtils.isEmpty(s_email)){
                Toast.makeText(SignUpActivity.this, "Please enter valid email", Toast.LENGTH_LONG).show();
                return;
            }
            else {
                Toast.makeText(SignUpActivity.this, "You have successfully Signed up Now LogIn", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(SignUpActivity.this, LogInActivity.class);
                startActivity(intent);
            }
        }
    }
    private void spin(){
        ArrayAdapter adapter =new ArrayAdapter(SignUpActivity.this, android.R.layout.simple_spinner_dropdown_item, sub_location);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
    }
    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
