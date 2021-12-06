package com.example.intentexample;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    private Button second;
    private TextView secondLBL;
    private EditText secondUI;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);

        second=findViewById(R.id.secondBTN);
        secondLBL=findViewById(R.id.secondLBL);
        secondUI=findViewById(R.id.secondUI);

        String valueOfIntent = getIntent().getStringExtra("user input");
        secondLBL.setText(valueOfIntent);




        second.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Intent objName = new Intent(Which activity are you in, where are you going?);
                Intent i = new Intent(getApplicationContext(),ThirdActivity.class);

                String ui = valueOfIntent+secondUI.getText();


                i.putExtra("user input",ui);
                startActivity(i);
            }
        });


    }
}
