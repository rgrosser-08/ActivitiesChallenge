package com.example.activitieschallenge;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE =
            "com.example.android.activitieschallenge.extra.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void button1OnClick(View view) {
        Intent intent = new Intent(this, ScrollingActivity.class);
        String message = "button1";
        intent.putExtra(EXTRA_MESSAGE,message);
        startActivity(intent);
    }

    public void button2OnClick(View view) {
        Intent intent = new Intent(this, ScrollingActivity.class);
        String message = "button2";
        intent.putExtra(EXTRA_MESSAGE,message);
        startActivity(intent);
    }

    public void button3OnClick(View view) {
        Intent intent = new Intent(this, ScrollingActivity.class);
        String message = "button3";
        intent.putExtra(EXTRA_MESSAGE,message);
        startActivity(intent);
    }
}