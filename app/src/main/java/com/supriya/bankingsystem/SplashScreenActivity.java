package com.supriya.bankingsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.supriya.bankingsystem.activity.MainActivity;

public class SplashScreenActivity extends AppCompatActivity {

    ImageView logo;
    TextView appnm,authornm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);

        logo = findViewById(R.id.logo);
        appnm = findViewById(R.id.appnm);
        authornm = findViewById(R.id.authornm);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startEnterAnimation();
            }
        }, 2000);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {


                startActivity(new Intent(getApplicationContext(), MainActivity.class));
                finish();

            }
        }, 4200);
    }

    private void startEnterAnimation() {
        appnm.startAnimation(AnimationUtils.loadAnimation(SplashScreenActivity.this, R.anim.bottom));
        logo.startAnimation(AnimationUtils.loadAnimation(SplashScreenActivity.this, R.anim.p_in));

        logo.setVisibility(View.VISIBLE);
        appnm.setVisibility(View.VISIBLE);
        authornm.setVisibility(View.VISIBLE);

    }
}


