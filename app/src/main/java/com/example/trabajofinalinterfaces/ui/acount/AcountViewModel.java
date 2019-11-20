package com.example.trabajofinalinterfaces.ui.acount;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class AcountViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public AcountViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("");
    }

    public LiveData<String> getText() {
        return mText;
    }
}