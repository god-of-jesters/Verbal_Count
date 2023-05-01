package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Select_type extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_type);
        Button ac = findViewById(R.id.button2);
        Button speed = findViewById(R.id.button3);
        Button count = findViewById(R.id.button4);
        Button right = findViewById(R.id.button5);
        ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Select_type.this, Accuracy.class);
                startActivity(intent);
            }
        });

        speed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Select_type.this, Speed.class);
                startActivity(intent);
            }
        });

        count.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Select_type.this, Count.class);
                startActivity(intent);
            }
        });

        right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Select_type.this, Accuracy.class);
                startActivity(intent);
            }
        });
    }
}