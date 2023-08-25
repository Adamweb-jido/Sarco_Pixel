package com.adamweb.sarcopixel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(R.style.Theme_SarcoPixel);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);
    }
}