package com.example.eventup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splah_screen);
        openLogin();

        ImageView logoSplash = findViewById(R.id.logoSplash);
        TextView appNameSplash = findViewById(R.id.appNameSplash);

        Animation zoomAnimation = AnimationUtils.loadAnimation(this, R.anim.zoom);
        logoSplash.startAnimation(zoomAnimation);

        Animation fadeAnimation = AnimationUtils.loadAnimation(this, R.anim.fade_in);
        appNameSplash.startAnimation(fadeAnimation);

        Animation shakeAnimation = AnimationUtils.loadAnimation(this, R.anim.shake);
        appNameSplash.startAnimation(shakeAnimation);


    }

    public void openLogin(){
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashScreen.this, Login.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intent);
            }
        }, 3000);
    }
    }


