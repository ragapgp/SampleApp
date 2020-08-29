package com.example.sampleapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Toast with Hello World message
        Toast.makeText(this, "Hello World!!", Toast.LENGTH_SHORT).show();
        //Toast with Hello! This is Android App.
        Toast.makeText(this, "Hello! This is Android App!!", Toast.LENGTH_SHORT).show();
    }
}