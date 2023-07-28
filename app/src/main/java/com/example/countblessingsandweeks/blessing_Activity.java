package com.example.countblessingsandweeks;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.TextView;

public class blessing_Activity extends AppCompatActivity {
    TextView txt_show;
    ImageButton image_button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blessing);
        findViews();
    }
    public void findViews(){
        txt_show = findViewById(R.id.txt_show);
        image_button = findViewById(R.id.image_button);
    }

}