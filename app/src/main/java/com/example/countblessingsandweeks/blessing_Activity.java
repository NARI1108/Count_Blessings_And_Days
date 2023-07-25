package com.example.countblessingsandweeks;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class blessing_Activity extends AppCompatActivity {
    ImageButton image_button;
    TextView txt_show;
    int count=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blessing);
        findViews();
        onClickBlessing();
    }
    public void findViews(){
        image_button = findViewById(R.id.image_button);
        txt_show = findViewById(R.id.txt_show);
    }
    public void onClickBlessing(){
        image_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               result();
               txt_show.setText(count+"");
            }
        });
    }
    public void result() {
        count++;
    }
}