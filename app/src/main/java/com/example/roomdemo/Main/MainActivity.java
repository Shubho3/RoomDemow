package com.example.roomdemo.Main;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.example.roomdemo.Home.HomeActivity;
import com.example.roomdemo.R;
import com.example.roomdemo.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(
                this, R.layout.activity_main);
        MainViewModel mainViewModel = new MainViewModel();
        binding.setMainViewModel(mainViewModel);
        binding.setLifecycleOwner(this);
        mainViewModel.getMainModelMutableLiveData().observe(this, mainModel -> {
            if (mainModel != null) {
                Toast.makeText(MainActivity.this, mainModel.getFloating_btn(), Toast.LENGTH_SHORT).show();
                Intent i = new Intent(getApplicationContext(), HomeActivity.class);
                startActivity(i);

            }
        });
    }
}