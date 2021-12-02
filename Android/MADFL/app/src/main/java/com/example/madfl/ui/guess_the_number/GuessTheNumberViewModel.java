package com.example.madfl.ui.guess_the_number;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class GuessTheNumberViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public GuessTheNumberViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is  fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}