package com.example.madlib;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //Defining the widget vars
    private EditText firstNameTXT;
    private EditText lastNameTXT;
    private EditText cityTXT;
    private EditText schoolTXT;
    private EditText broTXT;
    private EditText sisTXT;
    private TextView output;
    private Button generateBTN;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstNameTXT = findViewById(R.id.firstWTXT);
        firstNameTXT.setText();
        lastNameTXT = findViewById(R.id.lastTXT);
        cityTXT = findViewById(R.id.cityTXT);
        schoolTXT = findViewById(R.id.schoolTXT);
        broTXT = findViewById(R.id.broTXT);
        sisTXT = findViewById(R.id.sisTXT);
        output = findViewById(R.id.output);
        generateBTN = findViewById(R.id.generator);

        generateBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                generate();
            }
        });

    }

    private void generate() {
        String first = String.valueOf(firstNameTXT.getText());
        String last = String.valueOf(lastNameTXT.getText());
        String city = String.valueOf(cityTXT.getText());
        String school = String.valueOf(schoolTXT.getText());
        String brother = String.valueOf(broTXT.getText());
        String sister = String.valueOf(sisTXT.getText());

        int rF = (int) (Math.random() * first.length());
        int rL = (int) (Math.random() * last.length());
        int rC = (int) (Math.random() * city.length());
        int rS = (int) (Math.random() * school.length());
        int rB = (int) (Math.random() * brother.length());
        int rSi = (int) (Math.random() * sister.length());

        String sciFiFirst = first.substring(rF) + last.substring(rL);

        String sciFiLast = city.substring(rC) + school.substring(rS);

        String sciFiHome = brother.substring(rB) + sister.substring(rSi);
        output.setText(
                String.format("Hello there %s %s from %s", sciFiFirst, sciFiLast, sciFiHome)
        );

    }



}