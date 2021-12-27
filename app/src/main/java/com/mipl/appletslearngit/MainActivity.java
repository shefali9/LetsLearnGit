package com.mipl.appletslearngit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Sample();
    }

    private void Sample(){
        Toast.makeText(getApplicationContext(), "test Git", Toast.LENGTH_SHORT).show();
        Toast.makeText(getApplicationContext(), "test Git", Toast.LENGTH_SHORT).show();
    }
}