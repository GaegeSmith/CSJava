package com.example.navdrawertest.ui.dice;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.lang.Math;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.navdrawertest.R;
import com.example.navdrawertest.databinding.FragmentSlideshowBinding;

public class DiceFragment extends Fragment {
    private ImageView dice;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View rootView = inflater.inflate(R.layout.fragment_dice, container, false);

        dice = rootView.findViewById(R.id.diceIMG);
        dice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                rollDice();
            }
        });
        return rootView;
    }
//    private void rollDice() {
//        int
//    }
}
