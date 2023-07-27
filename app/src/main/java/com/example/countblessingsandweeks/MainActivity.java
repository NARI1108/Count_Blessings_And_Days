package com.example.countblessingsandweeks;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btn_count_blessings, btn_count_days, btn_about_us, btn_exit;
    TextView txt_title;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();
        onClickDays();
        onClickBlessing();
        onClickAbout();
        onClickExit();
    }
    public void findViews(){
        txt_title = findViewById(R.id.txt_title);
        btn_count_blessings =findViewById(R.id.btn_count_blessings);
        btn_count_days = findViewById(R.id.btn_count_days);
        btn_about_us = findViewById(R.id.btn_about_us);
        btn_exit = findViewById(R.id.btn_exit);


    }
    public void onClickDays(){
        btn_count_days.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               startActivity(new Intent(MainActivity.this,count_Weeks_Activity.class));
            }
        });
    }
    public void onClickBlessing(){
        btn_count_blessings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,blessing_Activity.class));
            }
        });
    }
    public void onClickExit() {
        btn_exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
    public void onClickAbout(){
       btn_about_us.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               new AlertDialog.Builder(MainActivity.this).setIcon(R.drawable.icon).setTitle("درباره ما").setMessage(R.string.About_Us).show();
           }
       });
    }
}