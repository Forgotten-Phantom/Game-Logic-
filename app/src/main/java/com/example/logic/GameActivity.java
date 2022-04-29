package com.example.logic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.android.material.card.MaterialCardView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class GameActivity extends AppCompatActivity {

    MaterialCardView red;
    MaterialCardView green;
    MaterialCardView orange;
    MaterialCardView skyBlue;
    MaterialCardView blue;
    MaterialCardView yellow;
    MaterialCardView pink;
    MaterialCardView purple;
    LinearLayout firstPlayerLine;
    LinearLayout secondPlayerLine;
    LinearLayout computerAnswerLine;
    Random random = new Random();

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
        firstPlayerLine = findViewById(R.id.firstPlayerLine);
        secondPlayerLine = findViewById(R.id.secondPlayerLine);
        computerAnswerLine = findViewById(R.id.computerAnswerLine);

        for (int i = 0; i < 5; i++) {
            while (code[i] == 0) {
                code[i] = random.nextInt(9);
            }
        }

        red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                answer[count] = 1;
                count++;

                getApplicationContext().getTheme().applyStyle(R.style.Base_Theme_MaterialComponents_Light, true);

                MaterialCardView materialCardView = new MaterialCardView(getApplication());
                materialCardView.setCardBackgroundColor(getBaseContext().getColor(R.color.red));
                materialCardView.setRadius(50);
                materialCardView.setStrokeColor(Color.BLACK);
                materialCardView.setStrokeWidth(2);
                materialCardView.setLayoutParams(new LinearLayout.LayoutParams(100, 100));
                secondPlayerLine.addView(materialCardView);

                if (count > 4) {
                    count = 0;
                    secondPlayerLine.removeAllViews();
                    firstPlayerLine.removeAllViews();
                    computerAnswerLine.removeAllViews();

                    for (int j : answer) {
                        MaterialCardView materialCardViewToFirstLine = new MaterialCardView(getApplication());
                        materialCardViewToFirstLine.setRadius(50);
                        materialCardViewToFirstLine.setLayoutParams(new LinearLayout.LayoutParams(100, 100));
                        materialCardViewToFirstLine.setStrokeColor(Color.BLACK);
                        materialCardViewToFirstLine.setStrokeWidth(2);

                        switch (j) {
                            case 1:
                                materialCardViewToFirstLine.setCardBackgroundColor(getBaseContext().getColor(R.color.red));
                                break;
                            case 2:
                                materialCardViewToFirstLine.setCardBackgroundColor(getBaseContext().getColor(R.color.green));
                                break;
                            case 3:
                                materialCardViewToFirstLine.setCardBackgroundColor(getBaseContext().getColor(R.color.orange));
                                break;
                            case 4:
                                materialCardViewToFirstLine.setCardBackgroundColor(getBaseContext().getColor(R.color.skyBlue));
                                break;
                            case 5:
                                materialCardViewToFirstLine.setCardBackgroundColor(getBaseContext().getColor(R.color.blue));
                                break;
                            case 6:
                                materialCardViewToFirstLine.setCardBackgroundColor(getBaseContext().getColor(R.color.yellow));
                                break;
                            case 7:
                                materialCardViewToFirstLine.setCardBackgroundColor(getBaseContext().getColor(R.color.pink));
                                break;
                            case 8:
                                materialCardViewToFirstLine.setCardBackgroundColor(getBaseContext().getColor(R.color.purple));
                                break;
                        }

                        firstPlayerLine.addView(materialCardViewToFirstLine);
                    }

                    int count = 0;

                    for (int i = 0; i < answer.length; i++) {
                        for (int j = 0; j < code.length; j++) {
                            if (answer[i] == code[j] && i == j) {
                                count++;

                                MaterialCardView computerAnswerCardView = new MaterialCardView(getApplication());
                                computerAnswerCardView.setCardBackgroundColor(getBaseContext().getColor(R.color.black));
                                computerAnswerCardView.setRadius(25);
                                computerAnswerCardView.setStrokeColor(Color.BLACK);
                                computerAnswerCardView.setStrokeWidth(2);
                                computerAnswerCardView.setLayoutParams(new LinearLayout.LayoutParams(50, 50));

                                computerAnswerLine.addView(computerAnswerCardView);
                            } else if (answer[i] == code[j] && i != j) {
                                count++;

                                MaterialCardView computerAnswerCardView = new MaterialCardView(getApplication());
                                computerAnswerCardView.setCardBackgroundColor(getBaseContext().getColor(R.color.white));
                                computerAnswerCardView.setRadius(25);
                                computerAnswerCardView.setStrokeColor(Color.BLACK);
                                computerAnswerCardView.setStrokeWidth(2);
                                computerAnswerCardView.setLayoutParams(new LinearLayout.LayoutParams(50, 50));

                                computerAnswerLine.addView(computerAnswerCardView);
                            }
                        }
                        if (count == 5)
                            break;
                    }

                    if (Arrays.equals(code, answer)) {
                        Bundle bundle = new Bundle();
                        bundle.putIntArray("code", code);
                        Intent i = new Intent(GameActivity.this, EndGameActivity.class);
                        i.putExtra("code", code);
                        startActivity(i);
                    }
                }
            }
        });

        green.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                answer[count] = 2;
                count++;

                getApplicationContext().getTheme().applyStyle(R.style.Base_Theme_MaterialComponents_Light, true);

                MaterialCardView materialCardView = new MaterialCardView(getApplication());
                materialCardView.setCardBackgroundColor(getBaseContext().getColor(R.color.green));
                materialCardView.setRadius(50);
                materialCardView.setStrokeColor(Color.BLACK);
                materialCardView.setStrokeWidth(2);
                materialCardView.setLayoutParams(new LinearLayout.LayoutParams(100, 100));
                secondPlayerLine.addView(materialCardView);

                if (count > 4) {
                    count = 0;
                    secondPlayerLine.removeAllViews();
                    firstPlayerLine.removeAllViews();
                    computerAnswerLine.removeAllViews();

                    for (int j : answer) {
                        MaterialCardView materialCardViewToFirstLine = new MaterialCardView(getApplication());
                        materialCardViewToFirstLine.setRadius(50);
                        materialCardViewToFirstLine.setLayoutParams(new LinearLayout.LayoutParams(100, 100));
                        materialCardViewToFirstLine.setStrokeColor(Color.BLACK);
                        materialCardViewToFirstLine.setStrokeWidth(2);

                        switch (j) {
                            case 1:
                                materialCardViewToFirstLine.setCardBackgroundColor(getBaseContext().getColor(R.color.red));
                                break;
                            case 2:
                                materialCardViewToFirstLine.setCardBackgroundColor(getBaseContext().getColor(R.color.green));
                                break;
                            case 3:
                                materialCardViewToFirstLine.setCardBackgroundColor(getBaseContext().getColor(R.color.orange));
                                break;
                            case 4:
                                materialCardViewToFirstLine.setCardBackgroundColor(getBaseContext().getColor(R.color.skyBlue));
                                break;
                            case 5:
                                materialCardViewToFirstLine.setCardBackgroundColor(getBaseContext().getColor(R.color.blue));
                                break;
                            case 6:
                                materialCardViewToFirstLine.setCardBackgroundColor(getBaseContext().getColor(R.color.yellow));
                                break;
                            case 7:
                                materialCardViewToFirstLine.setCardBackgroundColor(getBaseContext().getColor(R.color.pink));
                                break;
                            case 8:
                                materialCardViewToFirstLine.setCardBackgroundColor(getBaseContext().getColor(R.color.purple));
                                break;
                        }

                        firstPlayerLine.addView(materialCardViewToFirstLine);
                    }

                    int count = 0;

                    for (int i = 0; i < answer.length; i++) {
                        for (int j = 0; j < code.length; j++) {
                            if (answer[i] == code[j] && i == j) {
                                count++;

                                MaterialCardView computerAnswerCardView = new MaterialCardView(getApplication());
                                computerAnswerCardView.setCardBackgroundColor(getBaseContext().getColor(R.color.black));
                                computerAnswerCardView.setRadius(25);
                                computerAnswerCardView.setStrokeColor(Color.BLACK);
                                computerAnswerCardView.setStrokeWidth(2);
                                computerAnswerCardView.setLayoutParams(new LinearLayout.LayoutParams(50, 50));

                                computerAnswerLine.addView(computerAnswerCardView);
                            } else if (answer[i] == code[j] && i != j) {
                                count++;

                                MaterialCardView computerAnswerCardView = new MaterialCardView(getApplication());
                                computerAnswerCardView.setCardBackgroundColor(getBaseContext().getColor(R.color.white));
                                computerAnswerCardView.setRadius(25);
                                computerAnswerCardView.setStrokeColor(Color.BLACK);
                                computerAnswerCardView.setStrokeWidth(2);
                                computerAnswerCardView.setLayoutParams(new LinearLayout.LayoutParams(50, 50));

                                computerAnswerLine.addView(computerAnswerCardView);
                            }
                        }
                        if (count == 5)
                            break;
                    }

                    if (Arrays.equals(code, answer)) {
                        Bundle bundle = new Bundle();
                        bundle.putIntArray("code", code);
                        Intent i = new Intent(GameActivity.this, EndGameActivity.class);
                        i.putExtra("code", code);
                        startActivity(i);
                    }
                }
            }
        });

        orange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                answer[count] = 3;
                count++;

                getApplicationContext().getTheme().applyStyle(R.style.Base_Theme_MaterialComponents_Light, true);

                MaterialCardView materialCardView = new MaterialCardView(getApplication());
                materialCardView.setCardBackgroundColor(getBaseContext().getColor(R.color.orange));
                materialCardView.setRadius(50);
                materialCardView.setStrokeColor(Color.BLACK);
                materialCardView.setStrokeWidth(2);
                materialCardView.setLayoutParams(new LinearLayout.LayoutParams(100, 100));
                secondPlayerLine.addView(materialCardView);

                if (count > 4) {
                    count = 0;
                    secondPlayerLine.removeAllViews();
                    firstPlayerLine.removeAllViews();
                    computerAnswerLine.removeAllViews();

                    for (int j : answer) {
                        MaterialCardView materialCardViewToFirstLine = new MaterialCardView(getApplication());
                        materialCardViewToFirstLine.setRadius(50);
                        materialCardViewToFirstLine.setLayoutParams(new LinearLayout.LayoutParams(100, 100));
                        materialCardViewToFirstLine.setStrokeColor(Color.BLACK);
                        materialCardViewToFirstLine.setStrokeWidth(2);

                        switch (j) {
                            case 1:
                                materialCardViewToFirstLine.setCardBackgroundColor(getBaseContext().getColor(R.color.red));
                                break;
                            case 2:
                                materialCardViewToFirstLine.setCardBackgroundColor(getBaseContext().getColor(R.color.green));
                                break;
                            case 3:
                                materialCardViewToFirstLine.setCardBackgroundColor(getBaseContext().getColor(R.color.orange));
                                break;
                            case 4:
                                materialCardViewToFirstLine.setCardBackgroundColor(getBaseContext().getColor(R.color.skyBlue));
                                break;
                            case 5:
                                materialCardViewToFirstLine.setCardBackgroundColor(getBaseContext().getColor(R.color.blue));
                                break;
                            case 6:
                                materialCardViewToFirstLine.setCardBackgroundColor(getBaseContext().getColor(R.color.yellow));
                                break;
                            case 7:
                                materialCardViewToFirstLine.setCardBackgroundColor(getBaseContext().getColor(R.color.pink));
                                break;
                            case 8:
                                materialCardViewToFirstLine.setCardBackgroundColor(getBaseContext().getColor(R.color.purple));
                                break;
                        }

                        firstPlayerLine.addView(materialCardViewToFirstLine);
                    }

                    int count = 0;

                    for (int i = 0; i < answer.length; i++) {
                        for (int j = 0; j < code.length; j++) {
                            if (answer[i] == code[j] && i == j) {
                                count++;

                                MaterialCardView computerAnswerCardView = new MaterialCardView(getApplication());
                                computerAnswerCardView.setCardBackgroundColor(getBaseContext().getColor(R.color.black));
                                computerAnswerCardView.setRadius(25);
                                computerAnswerCardView.setStrokeColor(Color.BLACK);
                                computerAnswerCardView.setStrokeWidth(2);
                                computerAnswerCardView.setLayoutParams(new LinearLayout.LayoutParams(50, 50));

                                computerAnswerLine.addView(computerAnswerCardView);
                            } else if (answer[i] == code[j] && i != j) {
                                count++;

                                MaterialCardView computerAnswerCardView = new MaterialCardView(getApplication());
                                computerAnswerCardView.setCardBackgroundColor(getBaseContext().getColor(R.color.white));
                                computerAnswerCardView.setRadius(25);
                                computerAnswerCardView.setStrokeColor(Color.BLACK);
                                computerAnswerCardView.setStrokeWidth(2);
                                computerAnswerCardView.setLayoutParams(new LinearLayout.LayoutParams(50, 50));

                                computerAnswerLine.addView(computerAnswerCardView);
                            }
                        }
                        if (count == 5)
                            break;
                    }

                    if (Arrays.equals(code, answer)) {
                        Bundle bundle = new Bundle();
                        bundle.putIntArray("code", code);
                        Intent i = new Intent(GameActivity.this, EndGameActivity.class);
                        i.putExtra("code", code);
                        startActivity(i);
                    }
                }
            }
        });

        skyBlue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                answer[count] = 4;
                count++;

                getApplicationContext().getTheme().applyStyle(R.style.Base_Theme_MaterialComponents_Light, true);

                MaterialCardView materialCardView = new MaterialCardView(getApplication());
                materialCardView.setCardBackgroundColor(getBaseContext().getColor(R.color.skyBlue));
                materialCardView.setRadius(50);
                materialCardView.setStrokeColor(Color.BLACK);
                materialCardView.setStrokeWidth(2);
                materialCardView.setLayoutParams(new LinearLayout.LayoutParams(100, 100));
                secondPlayerLine.addView(materialCardView);

                if (count > 4) {
                    count = 0;
                    secondPlayerLine.removeAllViews();
                    firstPlayerLine.removeAllViews();
                    computerAnswerLine.removeAllViews();

                    for (int j : answer) {
                        MaterialCardView materialCardViewToFirstLine = new MaterialCardView(getApplication());
                        materialCardViewToFirstLine.setRadius(50);
                        materialCardViewToFirstLine.setLayoutParams(new LinearLayout.LayoutParams(100, 100));
                        materialCardViewToFirstLine.setStrokeColor(Color.BLACK);
                        materialCardViewToFirstLine.setStrokeWidth(2);

                        switch (j) {
                            case 1:
                                materialCardViewToFirstLine.setCardBackgroundColor(getBaseContext().getColor(R.color.red));
                                break;
                            case 2:
                                materialCardViewToFirstLine.setCardBackgroundColor(getBaseContext().getColor(R.color.green));
                                break;
                            case 3:
                                materialCardViewToFirstLine.setCardBackgroundColor(getBaseContext().getColor(R.color.orange));
                                break;
                            case 4:
                                materialCardViewToFirstLine.setCardBackgroundColor(getBaseContext().getColor(R.color.skyBlue));
                                break;
                            case 5:
                                materialCardViewToFirstLine.setCardBackgroundColor(getBaseContext().getColor(R.color.blue));
                                break;
                            case 6:
                                materialCardViewToFirstLine.setCardBackgroundColor(getBaseContext().getColor(R.color.yellow));
                                break;
                            case 7:
                                materialCardViewToFirstLine.setCardBackgroundColor(getBaseContext().getColor(R.color.pink));
                                break;
                            case 8:
                                materialCardViewToFirstLine.setCardBackgroundColor(getBaseContext().getColor(R.color.purple));
                                break;
                        }

                        firstPlayerLine.addView(materialCardViewToFirstLine);
                    }

                    int count = 0;

                    for (int i = 0; i < answer.length; i++) {
                        for (int j = 0; j < code.length; j++) {
                            if (answer[i] == code[j] && i == j) {
                                count++;

                                MaterialCardView computerAnswerCardView = new MaterialCardView(getApplication());
                                computerAnswerCardView.setCardBackgroundColor(getBaseContext().getColor(R.color.black));
                                computerAnswerCardView.setRadius(25);
                                computerAnswerCardView.setStrokeColor(Color.BLACK);
                                computerAnswerCardView.setStrokeWidth(2);
                                computerAnswerCardView.setLayoutParams(new LinearLayout.LayoutParams(50, 50));

                                computerAnswerLine.addView(computerAnswerCardView);
                            } else if (answer[i] == code[j] && i != j) {
                                count++;

                                MaterialCardView computerAnswerCardView = new MaterialCardView(getApplication());
                                computerAnswerCardView.setCardBackgroundColor(getBaseContext().getColor(R.color.white));
                                computerAnswerCardView.setRadius(25);
                                computerAnswerCardView.setStrokeColor(Color.BLACK);
                                computerAnswerCardView.setStrokeWidth(2);
                                computerAnswerCardView.setLayoutParams(new LinearLayout.LayoutParams(50, 50));

                                computerAnswerLine.addView(computerAnswerCardView);
                            }
                        }
                        if (count == 5)
                            break;
                    }

                    if (Arrays.equals(code, answer)) {
                        Bundle bundle = new Bundle();
                        bundle.putIntArray("code", code);
                        Intent i = new Intent(GameActivity.this, EndGameActivity.class);
                        i.putExtra("code", code);
                        startActivity(i);
                    }
                }
            }
        });

        blue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                answer[count] = 5;
                count++;

                getApplicationContext().getTheme().applyStyle(R.style.Base_Theme_MaterialComponents_Light, true);

                MaterialCardView materialCardView = new MaterialCardView(getApplication());
                materialCardView.setCardBackgroundColor(getBaseContext().getColor(R.color.blue));
                materialCardView.setRadius(50);
                materialCardView.setStrokeColor(Color.BLACK);
                materialCardView.setStrokeWidth(2);
                materialCardView.setLayoutParams(new LinearLayout.LayoutParams(100, 100));
                secondPlayerLine.addView(materialCardView);

                if (count > 4) {
                    count = 0;
                    secondPlayerLine.removeAllViews();
                    firstPlayerLine.removeAllViews();
                    computerAnswerLine.removeAllViews();

                    for (int j : answer) {
                        MaterialCardView materialCardViewToFirstLine = new MaterialCardView(getApplication());
                        materialCardViewToFirstLine.setRadius(50);
                        materialCardViewToFirstLine.setLayoutParams(new LinearLayout.LayoutParams(100, 100));
                        materialCardViewToFirstLine.setStrokeColor(Color.BLACK);
                        materialCardViewToFirstLine.setStrokeWidth(2);

                        switch (j) {
                            case 1:
                                materialCardViewToFirstLine.setCardBackgroundColor(getBaseContext().getColor(R.color.red));
                                break;
                            case 2:
                                materialCardViewToFirstLine.setCardBackgroundColor(getBaseContext().getColor(R.color.green));
                                break;
                            case 3:
                                materialCardViewToFirstLine.setCardBackgroundColor(getBaseContext().getColor(R.color.orange));
                                break;
                            case 4:
                                materialCardViewToFirstLine.setCardBackgroundColor(getBaseContext().getColor(R.color.skyBlue));
                                break;
                            case 5:
                                materialCardViewToFirstLine.setCardBackgroundColor(getBaseContext().getColor(R.color.blue));
                                break;
                            case 6:
                                materialCardViewToFirstLine.setCardBackgroundColor(getBaseContext().getColor(R.color.yellow));
                                break;
                            case 7:
                                materialCardViewToFirstLine.setCardBackgroundColor(getBaseContext().getColor(R.color.pink));
                                break;
                            case 8:
                                materialCardViewToFirstLine.setCardBackgroundColor(getBaseContext().getColor(R.color.purple));
                                break;
                        }

                        firstPlayerLine.addView(materialCardViewToFirstLine);
                    }

                    int count = 0;

                    for (int i = 0; i < answer.length; i++) {
                        for (int j = 0; j < code.length; j++) {
                            if (answer[i] == code[j] && i == j) {
                                count++;

                                MaterialCardView computerAnswerCardView = new MaterialCardView(getApplication());
                                computerAnswerCardView.setCardBackgroundColor(getBaseContext().getColor(R.color.black));
                                computerAnswerCardView.setRadius(25);
                                computerAnswerCardView.setStrokeColor(Color.BLACK);
                                computerAnswerCardView.setStrokeWidth(2);
                                computerAnswerCardView.setLayoutParams(new LinearLayout.LayoutParams(50, 50));

                                computerAnswerLine.addView(computerAnswerCardView);
                            } else if (answer[i] == code[j] && i != j) {
                                count++;

                                MaterialCardView computerAnswerCardView = new MaterialCardView(getApplication());
                                computerAnswerCardView.setCardBackgroundColor(getBaseContext().getColor(R.color.white));
                                computerAnswerCardView.setRadius(25);
                                computerAnswerCardView.setStrokeColor(Color.BLACK);
                                computerAnswerCardView.setStrokeWidth(2);
                                computerAnswerCardView.setLayoutParams(new LinearLayout.LayoutParams(50, 50));

                                computerAnswerLine.addView(computerAnswerCardView);
                            }
                        }
                        if (count == 5)
                            break;
                    }

                    if (Arrays.equals(code, answer)) {
                        Bundle bundle = new Bundle();
                        bundle.putIntArray("code", code);
                        Intent i = new Intent(GameActivity.this, EndGameActivity.class);
                        i.putExtra("code", code);
                        startActivity(i);
                    }
                }
            }
        });

        yellow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                answer[count] = 6;
                count++;

                getApplicationContext().getTheme().applyStyle(R.style.Base_Theme_MaterialComponents_Light, true);

                MaterialCardView materialCardView = new MaterialCardView(getApplication());
                materialCardView.setCardBackgroundColor(getBaseContext().getColor(R.color.yellow));
                materialCardView.setRadius(50);
                materialCardView.setStrokeColor(Color.BLACK);
                materialCardView.setStrokeWidth(2);
                materialCardView.setLayoutParams(new LinearLayout.LayoutParams(100, 100));
                secondPlayerLine.addView(materialCardView);

                if (count > 4) {
                    count = 0;
                    secondPlayerLine.removeAllViews();
                    firstPlayerLine.removeAllViews();
                    computerAnswerLine.removeAllViews();

                    for (int j : answer) {
                        MaterialCardView materialCardViewToFirstLine = new MaterialCardView(getApplication());
                        materialCardViewToFirstLine.setRadius(50);
                        materialCardViewToFirstLine.setLayoutParams(new LinearLayout.LayoutParams(100, 100));
                        materialCardViewToFirstLine.setStrokeColor(Color.BLACK);
                        materialCardViewToFirstLine.setStrokeWidth(2);

                        switch (j) {
                            case 1:
                                materialCardViewToFirstLine.setCardBackgroundColor(getBaseContext().getColor(R.color.red));
                                break;
                            case 2:
                                materialCardViewToFirstLine.setCardBackgroundColor(getBaseContext().getColor(R.color.green));
                                break;
                            case 3:
                                materialCardViewToFirstLine.setCardBackgroundColor(getBaseContext().getColor(R.color.orange));
                                break;
                            case 4:
                                materialCardViewToFirstLine.setCardBackgroundColor(getBaseContext().getColor(R.color.skyBlue));
                                break;
                            case 5:
                                materialCardViewToFirstLine.setCardBackgroundColor(getBaseContext().getColor(R.color.blue));
                                break;
                            case 6:
                                materialCardViewToFirstLine.setCardBackgroundColor(getBaseContext().getColor(R.color.yellow));
                                break;
                            case 7:
                                materialCardViewToFirstLine.setCardBackgroundColor(getBaseContext().getColor(R.color.pink));
                                break;
                            case 8:
                                materialCardViewToFirstLine.setCardBackgroundColor(getBaseContext().getColor(R.color.purple));
                                break;
                        }

                        firstPlayerLine.addView(materialCardViewToFirstLine);
                    }

                    int count = 0;

                    for (int i = 0; i < answer.length; i++) {
                        for (int j = 0; j < code.length; j++) {
                            if (answer[i] == code[j] && i == j) {
                                count++;

                                MaterialCardView computerAnswerCardView = new MaterialCardView(getApplication());
                                computerAnswerCardView.setCardBackgroundColor(getBaseContext().getColor(R.color.black));
                                computerAnswerCardView.setRadius(25);
                                computerAnswerCardView.setStrokeColor(Color.BLACK);
                                computerAnswerCardView.setStrokeWidth(2);
                                computerAnswerCardView.setLayoutParams(new LinearLayout.LayoutParams(50, 50));

                                computerAnswerLine.addView(computerAnswerCardView);
                            } else if (answer[i] == code[j] && i != j) {
                                count++;

                                MaterialCardView computerAnswerCardView = new MaterialCardView(getApplication());
                                computerAnswerCardView.setCardBackgroundColor(getBaseContext().getColor(R.color.white));
                                computerAnswerCardView.setRadius(25);
                                computerAnswerCardView.setStrokeColor(Color.BLACK);
                                computerAnswerCardView.setStrokeWidth(2);
                                computerAnswerCardView.setLayoutParams(new LinearLayout.LayoutParams(50, 50));

                                computerAnswerLine.addView(computerAnswerCardView);
                            }
                        }
                        if (count == 5)
                            break;
                    }

                    if (Arrays.equals(code, answer)) {
                        Bundle bundle = new Bundle();
                        bundle.putIntArray("code", code);
                        Intent i = new Intent(GameActivity.this, EndGameActivity.class);
                        i.putExtra("code", code);
                        startActivity(i);
                    }
                }
            }
        });

        pink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                answer[count] = 7;
                count++;

                getApplicationContext().getTheme().applyStyle(R.style.Base_Theme_MaterialComponents_Light, true);

                MaterialCardView materialCardView = new MaterialCardView(getApplication());
                materialCardView.setCardBackgroundColor(getBaseContext().getColor(R.color.pink));
                materialCardView.setRadius(50);
                materialCardView.setStrokeColor(Color.BLACK);
                materialCardView.setStrokeWidth(2);
                materialCardView.setLayoutParams(new LinearLayout.LayoutParams(100, 100));
                secondPlayerLine.addView(materialCardView);

                if (count > 4) {
                    count = 0;
                    secondPlayerLine.removeAllViews();
                    firstPlayerLine.removeAllViews();
                    computerAnswerLine.removeAllViews();

                    for (int j : answer) {
                        MaterialCardView materialCardViewToFirstLine = new MaterialCardView(getApplication());
                        materialCardViewToFirstLine.setRadius(50);
                        materialCardViewToFirstLine.setLayoutParams(new LinearLayout.LayoutParams(100, 100));
                        materialCardViewToFirstLine.setStrokeColor(Color.BLACK);
                        materialCardViewToFirstLine.setStrokeWidth(2);

                        switch (j) {
                            case 1:
                                materialCardViewToFirstLine.setCardBackgroundColor(getBaseContext().getColor(R.color.red));
                                break;
                            case 2:
                                materialCardViewToFirstLine.setCardBackgroundColor(getBaseContext().getColor(R.color.green));
                                break;
                            case 3:
                                materialCardViewToFirstLine.setCardBackgroundColor(getBaseContext().getColor(R.color.orange));
                                break;
                            case 4:
                                materialCardViewToFirstLine.setCardBackgroundColor(getBaseContext().getColor(R.color.skyBlue));
                                break;
                            case 5:
                                materialCardViewToFirstLine.setCardBackgroundColor(getBaseContext().getColor(R.color.blue));
                                break;
                            case 6:
                                materialCardViewToFirstLine.setCardBackgroundColor(getBaseContext().getColor(R.color.yellow));
                                break;
                            case 7:
                                materialCardViewToFirstLine.setCardBackgroundColor(getBaseContext().getColor(R.color.pink));
                                break;
                            case 8:
                                materialCardViewToFirstLine.setCardBackgroundColor(getBaseContext().getColor(R.color.purple));
                                break;
                        }

                        firstPlayerLine.addView(materialCardViewToFirstLine);
                    }

                    int count = 0;

                    for (int i = 0; i < answer.length; i++) {
                        for (int j = 0; j < code.length; j++) {
                            if (answer[i] == code[j] && i == j) {
                                count++;

                                MaterialCardView computerAnswerCardView = new MaterialCardView(getApplication());
                                computerAnswerCardView.setCardBackgroundColor(getBaseContext().getColor(R.color.black));
                                computerAnswerCardView.setRadius(25);
                                computerAnswerCardView.setStrokeColor(Color.BLACK);
                                computerAnswerCardView.setStrokeWidth(2);
                                computerAnswerCardView.setLayoutParams(new LinearLayout.LayoutParams(50, 50));

                                computerAnswerLine.addView(computerAnswerCardView);
                            } else if (answer[i] == code[j] && i != j) {
                                count++;

                                MaterialCardView computerAnswerCardView = new MaterialCardView(getApplication());
                                computerAnswerCardView.setCardBackgroundColor(getBaseContext().getColor(R.color.white));
                                computerAnswerCardView.setRadius(25);
                                computerAnswerCardView.setStrokeColor(Color.BLACK);
                                computerAnswerCardView.setStrokeWidth(2);
                                computerAnswerCardView.setLayoutParams(new LinearLayout.LayoutParams(50, 50));

                                computerAnswerLine.addView(computerAnswerCardView);
                            }
                        }
                        if (count == 5)
                            break;
                    }

                    if (Arrays.equals(code, answer)) {
                        Bundle bundle = new Bundle();
                        bundle.putIntArray("code", code);
                        Intent i = new Intent(GameActivity.this, EndGameActivity.class);
                        i.putExtra("code", code);
                        startActivity(i);
                    }
                }
            }
        });

        purple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                answer[count] = 8;
                count++;

                getApplicationContext().getTheme().applyStyle(R.style.Base_Theme_MaterialComponents_Light, true);

                MaterialCardView materialCardView = new MaterialCardView(getApplication());
                materialCardView.setCardBackgroundColor(getBaseContext().getColor(R.color.purple));
                materialCardView.setRadius(50);
                materialCardView.setStrokeColor(Color.BLACK);
                materialCardView.setStrokeWidth(2);
                materialCardView.setLayoutParams(new LinearLayout.LayoutParams(100, 100));
                secondPlayerLine.addView(materialCardView);

                if (count > 4) {
                    count = 0;
                    secondPlayerLine.removeAllViews();
                    firstPlayerLine.removeAllViews();
                    computerAnswerLine.removeAllViews();

                    for (int j : answer) {
                        MaterialCardView materialCardViewToFirstLine = new MaterialCardView(getApplication());
                        materialCardViewToFirstLine.setRadius(50);
                        materialCardViewToFirstLine.setLayoutParams(new LinearLayout.LayoutParams(100, 100));
                        materialCardViewToFirstLine.setStrokeColor(Color.BLACK);
                        materialCardViewToFirstLine.setStrokeWidth(2);

                        switch (j) {
                            case 1:
                                materialCardViewToFirstLine.setCardBackgroundColor(getBaseContext().getColor(R.color.red));
                                break;
                            case 2:
                                materialCardViewToFirstLine.setCardBackgroundColor(getBaseContext().getColor(R.color.green));
                                break;
                            case 3:
                                materialCardViewToFirstLine.setCardBackgroundColor(getBaseContext().getColor(R.color.orange));
                                break;
                            case 4:
                                materialCardViewToFirstLine.setCardBackgroundColor(getBaseContext().getColor(R.color.skyBlue));
                                break;
                            case 5:
                                materialCardViewToFirstLine.setCardBackgroundColor(getBaseContext().getColor(R.color.blue));
                                break;
                            case 6:
                                materialCardViewToFirstLine.setCardBackgroundColor(getBaseContext().getColor(R.color.yellow));
                                break;
                            case 7:
                                materialCardViewToFirstLine.setCardBackgroundColor(getBaseContext().getColor(R.color.pink));
                                break;
                            case 8:
                                materialCardViewToFirstLine.setCardBackgroundColor(getBaseContext().getColor(R.color.purple));
                                break;
                        }

                        firstPlayerLine.addView(materialCardViewToFirstLine);
                    }

                    int count = 0;

                    for (int i = 0; i < answer.length; i++) {
                        for (int j = 0; j < code.length; j++) {
                            if (answer[i] == code[j] && i == j) {
                                count++;

                                MaterialCardView computerAnswerCardView = new MaterialCardView(getApplication());
                                computerAnswerCardView.setCardBackgroundColor(getBaseContext().getColor(R.color.black));
                                computerAnswerCardView.setRadius(25);
                                computerAnswerCardView.setStrokeColor(Color.BLACK);
                                computerAnswerCardView.setStrokeWidth(2);
                                computerAnswerCardView.setLayoutParams(new LinearLayout.LayoutParams(50, 50));

                                computerAnswerLine.addView(computerAnswerCardView);
                            } else if (answer[i] == code[j] && i != j) {
                                count++;

                                MaterialCardView computerAnswerCardView = new MaterialCardView(getApplication());
                                computerAnswerCardView.setCardBackgroundColor(getBaseContext().getColor(R.color.white));
                                computerAnswerCardView.setRadius(25);
                                computerAnswerCardView.setStrokeColor(Color.BLACK);
                                computerAnswerCardView.setStrokeWidth(2);
                                computerAnswerCardView.setLayoutParams(new LinearLayout.LayoutParams(50, 50));

                                computerAnswerLine.addView(computerAnswerCardView);
                            }
                        }
                        if (count == 5)
                            break;
                    }

                    if (Arrays.equals(code, answer)) {
                        Bundle bundle = new Bundle();
                        bundle.putIntArray("code", code);
                        Intent i = new Intent(GameActivity.this, EndGameActivity.class);
                        i.putExtra("code", code);
                        startActivity(i);
                    }
                }
            }
        });
    }
}