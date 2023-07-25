package com.example.countblessingsandweeks;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Calendar;

public class count_Weeks_Activity extends AppCompatActivity {
    ImageView img_show;
    Calendar calender = Calendar.getInstance();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_count_weeks);
        findViews();
        appointmentDays();

    }
    public void findViews(){
        img_show = findViewById(R.id.img_show);

    }
    public void appointmentDays(){
        int Days = calender.get(Calendar.DAY_OF_WEEK);
        String  day = "";
        switch(Days){
            case Calendar.SATURDAY:
                 day="شنبه";
                 img_show.setImageResource(R.drawable.saturday);
                break;
            case Calendar.SUNDAY:
                day="یکشنبه";
                img_show.setImageResource(R.drawable.sunday);
                break;
            case Calendar.MONDAY:
                day="دوشنبه";
                img_show.setImageResource(R.drawable.monday);
                break;
            case Calendar.TUESDAY:
                day="سه شنبه";
                img_show.setImageResource(R.drawable.tuesday);
                break;
            case Calendar.WEDNESDAY:
                day="چهارشنبه";
                img_show.setImageResource(R.drawable.wednesday);
                break;
            case Calendar.THURSDAY:
                day="پنجشنبه";
                img_show.setImageResource(R.drawable.thursday);
                break;
            case Calendar.FRIDAY:
                day="جمعه";
                img_show.setImageResource(R.drawable.friday);
                break;
        }
        Toast.makeText(count_Weeks_Activity.this,day,Toast.LENGTH_SHORT).show();
    }
}