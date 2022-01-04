package com.example.christmascountdown;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {
    private TextView daysTXT, hoursTXT, minsTXT, secsTXT;
    private Handler handler;
    private Runnable runnable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        daysTXT = findViewById(R.id.txtTimerDay);
        hoursTXT = findViewById(R.id.txtTimerHour);
        minsTXT = findViewById(R.id.txtTimerMinute);
        secsTXT = findViewById(R.id.txtTimerSecond);

        countDownStart();
    }

    public void countDownStart() {
        handler = new Handler();
        runnable = new Runnable() {
            @Override
            public void run() {
                handler.postDelayed(this, 1000);
                try {
                    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                    Date futureDate = dateFormat.parse("2021-12-25");
                    Date currentDate = new Date();
                    long diff = futureDate.getTime() - currentDate.getTime();
                    long days = diff / (24*60*60*1000);
                    diff -= days * (24*60*60*1000);
                    long hours = diff / (60*60*1000);
                    diff -= hours * (60*60*1000);
                    long mins = diff / (60*1000);
                    diff -= mins * (60*1000);
                    long secs = diff / 1000;
                    daysTXT.setText("" + String.format("%02d", days));
                    hoursTXT.setText("" + String.format("%02d", hours));
                    minsTXT.setText("" + String.format("%02d", mins));
                    secsTXT.setText("" + String.format("%02d", secs));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };
        handler.postDelayed(runnable, 1000);
    }
}