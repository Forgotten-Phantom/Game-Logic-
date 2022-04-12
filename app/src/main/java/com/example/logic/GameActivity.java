package com.example.logic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.graphics.Canvas;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.google.android.material.card.MaterialCardView;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class GameActivity extends AppCompatActivity {

    MaterialCardView red;
    MaterialCardView green;
    MaterialCardView orange;
    Button skyBlue;
    Button blue;
    Button yellow;
    Button pink;
    Button purple;
    LinearLayout firstLine;
    LinearLayout secondLine;

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
        firstLine = findViewById(R.id.firstLine);
        secondLine = findViewById(R.id.secondLine);

        for (int i = 0; i < 5; i++)
            code[i] = ThreadLocalRandom.current().nextInt(1, 9);

        red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                answer[count] = 1;
                count++;

                CardView cardView = new CardView(getBaseContext());
                cardView.setCardBackgroundColor(Color.RED);
                cardView.setRadius(50);
                cardView.setLayoutParams(new LinearLayout.LayoutParams(100, 100));
                secondLine.addView(cardView);

                if (count > 4) {
                    count = 0;
                    secondLine.removeAllViews();
                }
            }
        });

        green.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                answer[count] = 2;
                count++;

                CardView cardView = new CardView(getBaseContext());
                cardView.setCardBackgroundColor(Color.GREEN);
                cardView.setRadius(50);
                cardView.setLayoutParams(new LinearLayout.LayoutParams(100, 100));
                secondLine.addView(cardView);

                if (count > 4) {
                    count = 0;
                    secondLine.removeAllViews();
                }
            }
        });

        orange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                answer[count] = 3;
                count++;

                CardView cardView = new CardView(getBaseContext());
                cardView.setCardBackgroundColor(getBaseContext().getColor(R.color.orange));
                cardView.setRadius(50);
                cardView.setLayoutParams(new LinearLayout.LayoutParams(100, 100));
                secondLine.addView(cardView);

                if (count > 4) {
                    count = 0;
                    secondLine.removeAllViews();
                }
            }
        });

    }
}