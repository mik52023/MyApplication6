package com.example.study.myapplication6;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    DrawView drawview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        drawview = new DrawView(this);
        drawview.setBackgroundColor(Color.WHITE);
        setContentView(drawview);
    }
}
