package com.example.logic;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.card.MaterialCardView;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class GameActivity extends AppCompatActivity {

    MaterialCardView red;
    Button green;
    Button orange;
    Button skyBlue;
    Button blue;
    Button yellow;
    Button pink;
    Button purple;

    int[] code = new int[5];
    int[] answer = new int[5];
    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        red = findViewById(R.id.red);
        green = findViewById(R.id.green);
        orange = findViewById(R.id.orange);
        skyBlue = findViewById(R.id.skyBlue);
        blue = findViewById(R.id.blue);
        yellow = findViewById(R.id.yellow);
        pink = findViewById(R.id.pink);
        purple = findViewById(R.id.purple);

        for (int i = 0; i < 5; i++)
            code[i] = ThreadLocalRandom.current().nextInt(1, 9);

        red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}