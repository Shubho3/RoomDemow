package com.example.roomdemo.Main;

import androidx.databinding.BaseObservable;
import androidx.databinding.ObservableField;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

public class MainViewModel extends BaseObservable {
    public final ObservableField<String> btn = new ObservableField<>();
    private MutableLiveData<MainModel> mainModelMutableLiveData;

    public MainViewModel() {

    }

    LiveData<MainModel> getMainModelMutableLiveData() {
        if (mainModelMutableLiveData == null) {
            mainModelMutableLiveData = new MutableLiveData<>();
        }

        return mainModelMutableLiveData;
    }

    public void onBtnClicked() {
        mainModelMutableLiveData.setValue(new MainModel("clicked"));
        // Intent i = new Intent()
    }
}
