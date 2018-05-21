package com.glowingsoft.milliryde;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.Log;
import android.view.WindowManager;

import java.util.Timer;
import java.util.TimerTask;

public class SplashActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash);


        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                Log.d("timerSplash", "timerSplash");


                startActivity(new Intent(SplashActivity.this, LoginActivity.class));
                finish();


            }
        }, 3000);


    }

    @Override
    protected void onPause() {
        super.onPause();


    }

    @Override
    protected void onStop() {
        super.onStop();

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

    }
}
