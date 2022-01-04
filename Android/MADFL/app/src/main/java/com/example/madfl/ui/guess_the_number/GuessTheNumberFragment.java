package com.example.madfl.ui.guess_the_number;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.madfl.R;
import com.example.madfl.databinding.FragmentGuessTheNumberBinding;

import java.util.Random;

public class GuessTheNumberFragment extends Fragment {

    private FragmentGuessTheNumberBinding binding;
    private TextView guessTheNumTXT, hiloTXT;
    private Button resetBTN, submitBTN;
    private EditText guessIN;
    private int randInt;
    private int guessesLeft = 5;
    private Random random;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        super.onCreateView(inflater, container, savedInstanceState);
        View root = inflater.inflate(R.layout.fragment_guess_the_number, container, false);
        random = new Random();
        randInt = random.nextInt(101);
        guessTheNumTXT = root.findViewById(R.id.guessTheNumTXT);
        guessTheNumTXT.setText("I have a random number, you have 5 guesses, and each guess you don't use is 5 points.  I will tell you if you guess to high or too low. Good luck!");
        resetBTN = root.findViewById(R.id.resetBTNNUM);
        submitBTN = root.findViewById(R.id.submitBTNNUM);
        guessIN = root.findViewById(R.id.guessIN);
        hiloTXT = root.findViewById(R.id.hiloTXT);

        resetBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                guessesLeft = 5;
                randInt = random.nextInt(101);
                guessTheNumTXT.setText("I have a random number, you have 5 guesses, and each guess you don't use is 5 points.  I will tell you if you guess to high or too low. Good luck!");
            }
        });

        submitBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hiloTXT.setText(guess());
            }
        });


        return root;
    }
    public String guess() {
        String result = "";
        int guess = Integer.parseInt(String.valueOf(guessIN.getText()));
        if (guess > randInt) {
            result += "" + guess + " is too high, guess lower.";
            guessesLeft--;
        } else if (guess < randInt) {
            result += "" + guess + " is too low, guess higher.";
            guessesLeft--;
        } else {
            result += "" + guess + " is correct, good job.\nYou get " + (50 + (guessesLeft * 5)) + " points.";
            guessesLeft--;
        }
        return result;
    }
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}