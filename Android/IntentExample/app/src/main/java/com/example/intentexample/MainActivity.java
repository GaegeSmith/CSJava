package com.example.intentexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button first;
    private EditText firstInfo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstInfo = findViewById(R.id.firstUI);

        first=findViewById(R.id.firstBTN);
        first.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Intent objName = new Intent(Which activity are you in, where are you going?);
                Intent i = new Intent(MainActivity.this,SecondActivity.class);
                startActivity(i);
            }
        });



    }
}