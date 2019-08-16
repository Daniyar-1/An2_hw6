package com.mytaskapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ApplyingWindowActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_applying_window);


    }

    public void onClick(View view) {
        startActivity(new Intent(ApplyingWindowActivity.this, MainActivity.class));


    }
}
