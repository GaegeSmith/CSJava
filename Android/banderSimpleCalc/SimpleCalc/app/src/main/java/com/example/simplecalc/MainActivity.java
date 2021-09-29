package com.example.simplecalc;     //unique id for your program

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    //initialized global variables
    private EditText number1TXT;
    private EditText number2TXT;
    private Button addBTN;
    private Button minusBTN;
    private Button multBTN;
    private Button divBTN;
    private TextView output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);   //this line links the two files

        //linked the global variables to the widgets
        number1TXT = findViewById(R.id.number1);
        number2TXT = findViewById(R.id.number2);
        addBTN = findViewById(R.id.addBTN);
        minusBTN = findViewById(R.id.minusBTN);
        multBTN = findViewById(R.id.multBTN);
        divBTN = findViewById(R.id.divBTN);
        output = findViewById(R.id.output);

        multBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1 = Integer.parseInt(String.valueOf(number1TXT.getText()));
                int num2 = Integer.parseInt(String.valueOf(number2TXT.getText()));

                output.setText(num1 * num2);
            }
        });
        divBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1 = Integer.parseInt(String.valueOf(number1TXT.getText()));
                int num2 = Integer.parseInt(String.valueOf(number2TXT.getText()));

                output.setText(String.valueOf(num1 / num2));
            }
        });
    }

    public void adding(View v){
        //getting the text from our widget
        int num1 = Integer.parseInt(String.valueOf(number1TXT.getText()));
        int num2 = Integer.parseInt(String.valueOf(number2TXT.getText()));

        output.setText(num1 + num2);
    }
    public void minus(View v){
        //getting the text from our widget
        int num1 = Integer.parseInt(String.valueOf(number1TXT.getText()));
        int num2 = Integer.parseInt(String.valueOf(number2TXT.getText()));

        output.setText(num1 - num2);
    }

}