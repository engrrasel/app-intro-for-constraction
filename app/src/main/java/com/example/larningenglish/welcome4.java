package com.example.larningenglish;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Calendar;
import java.util.Date;

public class welcome4 extends AppCompatActivity {
    TextView date_time;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome4);
        date_time = findViewById(R.id.TodayDateAndTime);
        Date full = Calendar.getInstance().getTime();
        date_time.setText(full.toString().substring(0, 10) + ", " + full.toString().substring(30, 34));

        PrefManager prefManager = new PrefManager(getApplicationContext());
        if (prefManager.isFirstTimeLaunch()) {
            prefManager.setFirstTimeLaunch(false);
            startActivity(new Intent(welcome4.this, Welcome.class));
            finish();
        }
    }
}
