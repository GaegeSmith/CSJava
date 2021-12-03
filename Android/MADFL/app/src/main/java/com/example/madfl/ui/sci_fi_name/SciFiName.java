package com.example.madfl.ui.sci_fi_name;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.madfl.R;

public class SciFiName extends Fragment {
    private EditText firstNameTXT, lastNameTXT, cityTXT, schoolTXT, broTXT, sisTXT;
    private TextView output;
    private Button generateBTN;
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View rootView = inflater.inflate(R.layout.fragment_sci_fi_name, container, false);
        firstNameTXT = rootView.findViewById(R.id.firstTXT);
        lastNameTXT = rootView.findViewById(R.id.lastTXT);
        cityTXT = rootView.findViewById(R.id.cityTXT);
        schoolTXT = rootView.findViewById(R.id.schoolTXT);
        broTXT = rootView.findViewById(R.id.broTXT);
        sisTXT = rootView.findViewById(R.id.sisTXT);
        output = rootView.findViewById(R.id.output);
        generateBTN = rootView.findViewById(R.id.generator);


        generateBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                generate();
            }
        });


        return rootView;
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
        output.setText("Hello there " + sciFiFirst + " " + sciFiLast + " from " + sciFiHome);
        output.setText(
                String.format("Hello there %s %s from %s", sciFiFirst, sciFiLast, sciFiHome)
        );

    }
}
