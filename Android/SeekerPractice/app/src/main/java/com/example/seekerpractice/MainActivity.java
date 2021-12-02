package com.example.seekerpractice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView message, value;
    private ConstraintLayout screen;
    private SeekBar seeker, Aseek, Rseek, Gseek, Bseek;
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        screen = findViewById(R.id.constraintLayout);
        value = findViewById(R.id.valTXT);
        message = findViewById(R.id.messageTXT);
        seeker = findViewById(R.id.seekBar);

        value.setText(seeker.getProgress() + "/" + seeker.getMax());




        // getting the progress of the seekbar
        seeker.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            int pVal = 0;
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                //whenever you are sliding it
                message.setTextSize(i+1);
                pVal = i;
//                value.setText(pVal + "/" + seeker.getMax());

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                //whenever you first click it
            }

            @SuppressLint("SetTextI18n")
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                //whenever you release the seekbar
                value.setText(pVal + "/" + seeker.getMax());
            }
        });
    }
}
