package com.example.madfl.ui.guess_the_number;

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
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.madfl.R;
import com.example.madfl.databinding.FragmentGuessTheNumberBinding;

public class GuessTheNumberFragment extends Fragment {

    private FragmentGuessTheNumberBinding binding;
    private TextView guessTheNumTXT;
    private Button resetBTN, submitBTN;
    private EditText guessIN;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentGuessTheNumberBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        guessTheNumTXT = root.findViewById(R.id.guessTheNumTXT);
        guessTheNumTXT.setText("I have a random number, you have 5 guesses, and each guess you don't use is 5 points.  I will tell you if you guess to high or too low. Good luck!");
        resetBTN = root.findViewById(R.id.resetBTNNUM);
        submitBTN = root.findViewById(R.id.submitBTNNUM);
        guessIN = root.findViewById(R.id.guessIN);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}