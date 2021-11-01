package com.example.pizzaplanet;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private RadioGroup sizeRG;
    private RadioButton smallRB, mediumRB, largeRB;
    private TextView output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sizeRG = findViewById(R.id.radioGroup);

        smallRB = findViewById(R.id.radioButton0);
        mediumRB = findViewById(R.id.radioButton1);
        largeRB = findViewById(R.id.radioButton2);

        output = findViewById(R.id.outputLBL);

        ancCB = findViewById(R.id.anchovies);
        bacCB = findViewById(R.id.bacon);
        jalCB = findViewById(R.id.jalapenos);

    }
}