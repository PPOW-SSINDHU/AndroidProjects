package com.test.testapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

    EditText name;
    EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = (EditText) findViewById(R.id.editTextName);
        password = (EditText) findViewById(R.id.editTextPassword);
    }

    public void onButtonSignIn(View view){

        if(name.length() == 0){
            Toast.makeText(this, "Please enter username", Toast.LENGTH_SHORT).show();
        }else if(password.length() == 0){
            Toast.makeText(this, "Please enter password", Toast.LENGTH_SHORT).show();
        }else {
            if(name.equals("test") && password.equals("test")){
                finish();
                startActivity(new Intent(MainActivity.this, DashboardActivity.class));
            }else {
                Toast.makeText(this, "Username or password is incorrect. Please Try Again!!!", Toast.LENGTH_SHORT).show();
            }
        }
    }

    public void onButtonSignUp(View view){
        startActivity(new Intent(MainActivity.this, SignUpActivity.class));
    }
}