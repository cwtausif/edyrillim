package com.glowingsoft.milliryde;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;



public class LoginActivity extends AppCompatActivity implements View.OnClickListener{
    TextView signUpTV,signinTV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        signinTV = (TextView) findViewById(R.id.signinTV);
        signUpTV = (TextView) findViewById(R.id.signUpTV);

        signinTV.setOnClickListener(this);

        signUpTV.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.signinTV:
//
                break;
            case R.id.signUpTV:
                Intent i=new Intent(LoginActivity.this,SignUpActivity.class);
                startActivity(i);
                break;


        }


    }
}
