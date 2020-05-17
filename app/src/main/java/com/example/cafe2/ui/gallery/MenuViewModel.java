package com.example.cafe2.ui.gallery;

import android.view.View;
import android.widget.Button;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MenuViewModel extends ViewModel {

    private MutableLiveData<String> mText;
    private Button button2;

    public MenuViewModel() {
        mText = new MutableLiveData<>();
      //  mText.setValue("This is gallery fragment");

    }



    public LiveData<String> getText() {
        return mText;
    }
}