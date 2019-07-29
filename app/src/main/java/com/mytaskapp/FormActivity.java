package com.mytaskapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class FormActivity extends AppCompatActivity {
    EditText editTitle;
    EditText editDesc;
    Button save;
    public static String RESULT_KEY = "result_key";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);

        editTitle = findViewById(R.id.editTitle);
        editDesc = findViewById(R.id.editDecs);
        save = findViewById(R.id.saveBtn);

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                String title = editTitle.getText().toString();
                String desc = editDesc.getText().toString();
                Task task = new Task(title, desc);
                intent.putExtra(RESULT_KEY, task);
                setResult(RESULT_OK, intent);
                finish();
                Log.d("logg", task.title + " " + task.desc);
            }
        });
    }
}
