package com.example.simplecalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText number1TXT;
    private Button addBTN;
    private TextView output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        number1TXT = findViewById(R.id.number1);
        addBTN = findViewById(R.id.addBtn);
        output = findViewById(R.id.output);

    }

    public void test(View view) {
        String intput = String.valueOf(number1TXT.getText());

    }


}