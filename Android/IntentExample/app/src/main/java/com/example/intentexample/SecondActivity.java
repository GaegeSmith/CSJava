package com.example.intentexample;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    private Button second;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);

        second=findViewById(R.id.secondBTN);
        second.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                //Intent objName = new Intent(Which activity are you in, where are you going?);
                Intent i = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);
            }
        });


    }
}
