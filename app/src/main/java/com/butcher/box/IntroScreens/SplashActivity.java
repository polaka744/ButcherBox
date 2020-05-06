package com.butcher.box.IntroScreens;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;

import com.butcher.box.LoginActivity;
import com.butcher.box.MainActivity;
import com.butcher.box.R;

public class SplashActivity extends AppCompatActivity {

    private TextView _introText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        _introText = (TextView) findViewById(R.id.introText);


        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {

                if (isNetworkConnected()){

                    // This method will be executed once the timer is over
                    Intent i = new Intent(SplashActivity.this, LoginActivity.class);
                    startActivity(i);
                    finish();

                } else {

                    _introText.setText("No Internet");

                }

            }
        }, 2000);
    }


    private boolean isNetworkConnected() {
        ConnectivityManager cm = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);

        return cm.getActiveNetworkInfo() != null && cm.getActiveNetworkInfo().isConnected();
    }

}
