package com.example.countblessingsandweeks;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class blessing_Activity extends AppCompatActivity {
    TextView txt_show;
    ImageButton image_button;
    int count;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blessing);
        findViews();
        countBlessings();
        reset();
    }
    public void findViews(){
        txt_show = findViewById(R.id.txt_show);
        image_button = findViewById(R.id.image_button);
    }
    public void countBlessings(){
      image_button.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              count+=1;
              txt_show.setText(String.valueOf(count));
          }
      });
    }
    public void reset(){
        image_button.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                count=0;
                txt_show.setText(String.valueOf(count));
                return true;
            }
        });
    }
}