package com.example.calculator.operacioneslgoicas;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class OperacionesLogicasViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public OperacionesLogicasViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is home fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
