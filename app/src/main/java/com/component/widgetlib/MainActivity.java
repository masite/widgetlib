package com.component.widgetlib;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.component.widgetlib.widget.LoadDataLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LoadDataLayout loadDataLayout = findViewById(R.id.loadlayout);
        loadDataLayout.setStatus(LoadDataLayout.LOADING);
    }
}
