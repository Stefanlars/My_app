package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class user_input extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_input);
    }

    public void handleText(View v) {
        TextView t = findViewById(R.id.editTextTextPersonName);
        String input = t.getText().toString();
        Toast.makeText(this, input, Toast.LENGTH_LONG).show();

    }
}