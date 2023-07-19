package com.example.countblessingsandweeks;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btn_count_blessings, btn_count_weeks, btn_exit;
    TextView txt_title;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();
    }
    public void findViews(){
        btn_count_blessings =findViewById(R.id.btn_count_blessings);
        btn_count_weeks = findViewById(R.id.btn_count_weeks);
        btn_exit = findViewById(R.id.btn_exit);
        txt_title = findViewById(R.id.txt_title);
    }
}