package com.example.countblessingsandweeks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;
import android.widget.TextView;

public class splash_Screen extends AppCompatActivity {
    ImageView img_splash_screen;
    TextView txt_subtitle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        findViews();
        splashScreen();
    }
    public void findViews(){
        img_splash_screen = findViewById(R.id.img_splash_screen);
        txt_subtitle = findViewById(R.id.txt_subtitle);
    }
    public void splashScreen(){
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(splash_Screen.this,MainActivity.class));
                finish();
            }
        },4000);
    }
}