package com.example.smartagriculture.ui.monitor;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MonitorViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public MutableLiveData<String> getText() {
        if (mText == null) {
            mText = new MutableLiveData<>();
            mText.setValue("儿子");
        }
        return mText;
    }


}