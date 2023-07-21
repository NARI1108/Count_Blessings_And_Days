package com.example.countblessingsandweeks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btn_count_blessings, btn_count_days, btn_exit;
    TextView txt_title;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();
        onClickDays();
        onClickBlessing();
        onClickExit();
    }
    public void findViews(){
        btn_count_blessings =findViewById(R.id.btn_count_blessings);
        btn_count_days = findViewById(R.id.btn_count_days);
        btn_exit = findViewById(R.id.btn_exit);
        txt_title = findViewById(R.id.txt_title);
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
    public void onClickExit(){
        btn_exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}