package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @SuppressLint("SetTextI18n")
    public void disable(View v) {
//        View myView = findViewById(R.id.button);
//        myView.setEnabled(false);
//        Button button = (Button) myView;
//        button.setText("Disabled");
//        button.setTextColor(Color.rgb(255, 148, 147));
        v.setEnabled(false);
        Button b = (Button)v;
        b.setText("No Worko....");
        b.setTextColor(Color.rgb(255, 148, 147));
        Log.d("SUCCESS", "Disabled " + v.getId());
    }

    public void switchToUserInput(View v) {
        Intent i = new Intent(this, user_input.class);
        startActivity(i);

    }

}