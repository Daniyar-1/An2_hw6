package com.mytaskapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ColourActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colour_actiivty);
    }

    public void onClick(View view) {
        Intent intent = new Intent();
        switch (view.getId()){

            case R.id.btnBlue:
            intent.putExtra("color",R.color.blue);
            break;

            case R.id.btnRed:
                intent.putExtra("color",R.color.red);
                break;

            case R.id.btnGreen:
                intent.putExtra("color",R.color.green);
                break;

            case R.id.btnCyan:
                intent.putExtra("color",R.color.cyan);
                break;

            case R.id.btnYellow:
                intent.putExtra("color",R.color.yellow);
                break;
        }
        setResult(RESULT_OK,intent);
        finish();


    }
}
