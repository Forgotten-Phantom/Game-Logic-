package com.example.logic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.google.android.material.card.MaterialCardView;

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

        for (int i = 0; i < 5; i++)
            code[i] = ThreadLocalRandom.current().nextInt(1, 9);

        red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                answer[count] = 1;
                count++;

                CardView cardView = new CardView(getBaseContext());
                cardView.setCardBackgroundColor(getBaseContext().getColor(R.color.red));
                cardView.setRadius(50);
                cardView.setLayoutParams(new LinearLayout.LayoutParams(100, 100));
                secondPlayerLine.addView(cardView);

                if (count > 4) {
                    count = 0;
                    secondPlayerLine.removeAllViews();
                    firstPlayerLine.removeAllViews();
                    computerAnswerLine.removeAllViews();

                    for (int j : answer) {
                        CardView cardViewToFirstLine = new CardView(getBaseContext());
                        cardViewToFirstLine.setRadius(50);
                        cardViewToFirstLine.setLayoutParams(new LinearLayout.LayoutParams(100, 100));

                        switch (j) {
                            case 1:
                                cardViewToFirstLine.setCardBackgroundColor(getBaseContext().getColor(R.color.red));
                                break;
                            case 2:
                                cardViewToFirstLine.setCardBackgroundColor(getBaseContext().getColor(R.color.green));
                                break;
                            case 3:
                                cardViewToFirstLine.setCardBackgroundColor(getBaseContext().getColor(R.color.orange));
                                break;
                            case 4:
                                cardViewToFirstLine.setCardBackgroundColor(getBaseContext().getColor(R.color.skyBlue));
                                break;
                            case 5:
                                cardViewToFirstLine.setCardBackgroundColor(getBaseContext().getColor(R.color.blue));
                                break;
                            case 6:
                                cardViewToFirstLine.setCardBackgroundColor(getBaseContext().getColor(R.color.yellow));
                                break;
                            case 7:
                                cardViewToFirstLine.setCardBackgroundColor(getBaseContext().getColor(R.color.pink));
                                break;
                            case 8:
                                cardViewToFirstLine.setCardBackgroundColor(getBaseContext().getColor(R.color.purple));
                                break;
                        }

                        firstPlayerLine.addView(cardViewToFirstLine);
                    }

                    for (int i = 0; i < answer.length; i++) {
                        for (int j = 0; j < code.length; j++) {
                            if (answer[i] == code[j] && i == j) {
                                CardView computerAnswerCardView = new CardView(getBaseContext());
                                computerAnswerCardView.setCardBackgroundColor(getBaseContext().getColor(R.color.black));
                                computerAnswerCardView.setRadius(25);
                                computerAnswerCardView.setLayoutParams(new LinearLayout.LayoutParams(50, 50));

                                computerAnswerLine.addView(computerAnswerCardView);
                            } else if (answer[i] == code[j] && i != j) {
                                CardView computerAnswerCardView = new CardView(getBaseContext());
                                computerAnswerCardView.setCardBackgroundColor(getBaseContext().getColor(R.color.white));
                                computerAnswerCardView.setRadius(25);
                                computerAnswerCardView.setLayoutParams(new LinearLayout.LayoutParams(50, 50));

                                computerAnswerLine.addView(computerAnswerCardView);
                            }
                        }
                    }
                }
            }
        });

        green.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                answer[count] = 2;
                count++;

                CardView cardView = new CardView(getBaseContext());
                cardView.setCardBackgroundColor(getBaseContext().getColor(R.color.green));
                cardView.setRadius(50);
                cardView.setLayoutParams(new LinearLayout.LayoutParams(100, 100));
                secondPlayerLine.addView(cardView);

                if (count > 4) {
                    count = 0;
                    secondPlayerLine.removeAllViews();
                    firstPlayerLine.removeAllViews();

                    for (int j : answer) {
                        CardView cardViewToFirstLine = new CardView(getBaseContext());
                        cardViewToFirstLine.setRadius(50);
                        cardViewToFirstLine.setLayoutParams(new LinearLayout.LayoutParams(100, 100));

                        switch (j) {
                            case 1:
                                cardViewToFirstLine.setCardBackgroundColor(getBaseContext().getColor(R.color.red));
                                break;
                            case 2:
                                cardViewToFirstLine.setCardBackgroundColor(getBaseContext().getColor(R.color.green));
                                break;
                            case 3:
                                cardViewToFirstLine.setCardBackgroundColor(getBaseContext().getColor(R.color.orange));
                                break;
                            case 4:
                                cardViewToFirstLine.setCardBackgroundColor(getBaseContext().getColor(R.color.skyBlue));
                                break;
                            case 5:
                                cardViewToFirstLine.setCardBackgroundColor(getBaseContext().getColor(R.color.blue));
                                break;
                            case 6:
                                cardViewToFirstLine.setCardBackgroundColor(getBaseContext().getColor(R.color.yellow));
                                break;
                            case 7:
                                cardViewToFirstLine.setCardBackgroundColor(getBaseContext().getColor(R.color.pink));
                                break;
                            case 8:
                                cardViewToFirstLine.setCardBackgroundColor(getBaseContext().getColor(R.color.purple));
                                break;
                        }

                        firstPlayerLine.addView(cardViewToFirstLine);
                    }
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
                secondPlayerLine.addView(cardView);

                if (count > 4) {
                    count = 0;
                    secondPlayerLine.removeAllViews();
                    firstPlayerLine.removeAllViews();

                    for (int j : answer) {
                        CardView cardViewToFirstLine = new CardView(getBaseContext());
                        cardViewToFirstLine.setRadius(50);
                        cardViewToFirstLine.setLayoutParams(new LinearLayout.LayoutParams(100, 100));

                        switch (j) {
                            case 1:
                                cardViewToFirstLine.setCardBackgroundColor(getBaseContext().getColor(R.color.red));
                                break;
                            case 2:
                                cardViewToFirstLine.setCardBackgroundColor(getBaseContext().getColor(R.color.green));
                                break;
                            case 3:
                                cardViewToFirstLine.setCardBackgroundColor(getBaseContext().getColor(R.color.orange));
                                break;
                            case 4:
                                cardViewToFirstLine.setCardBackgroundColor(getBaseContext().getColor(R.color.skyBlue));
                                break;
                            case 5:
                                cardViewToFirstLine.setCardBackgroundColor(getBaseContext().getColor(R.color.blue));
                                break;
                            case 6:
                                cardViewToFirstLine.setCardBackgroundColor(getBaseContext().getColor(R.color.yellow));
                                break;
                            case 7:
                                cardViewToFirstLine.setCardBackgroundColor(getBaseContext().getColor(R.color.pink));
                                break;
                            case 8:
                                cardViewToFirstLine.setCardBackgroundColor(getBaseContext().getColor(R.color.purple));
                                break;
                        }

                        firstPlayerLine.addView(cardViewToFirstLine);
                    }
                }
            }
        });

        skyBlue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                answer[count] = 4;
                count++;

                CardView cardView = new CardView(getBaseContext());
                cardView.setCardBackgroundColor(getBaseContext().getColor(R.color.skyBlue));
                cardView.setRadius(50);
                cardView.setLayoutParams(new LinearLayout.LayoutParams(100, 100));
                secondPlayerLine.addView(cardView);

                if (count > 4) {
                    count = 0;
                    secondPlayerLine.removeAllViews();
                    firstPlayerLine.removeAllViews();

                    for (int j : answer) {
                        CardView cardViewToFirstLine = new CardView(getBaseContext());
                        cardViewToFirstLine.setRadius(50);
                        cardViewToFirstLine.setLayoutParams(new LinearLayout.LayoutParams(100, 100));

                        switch (j) {
                            case 1:
                                cardViewToFirstLine.setCardBackgroundColor(getBaseContext().getColor(R.color.red));
                                break;
                            case 2:
                                cardViewToFirstLine.setCardBackgroundColor(getBaseContext().getColor(R.color.green));
                                break;
                            case 3:
                                cardViewToFirstLine.setCardBackgroundColor(getBaseContext().getColor(R.color.orange));
                                break;
                            case 4:
                                cardViewToFirstLine.setCardBackgroundColor(getBaseContext().getColor(R.color.skyBlue));
                                break;
                            case 5:
                                cardViewToFirstLine.setCardBackgroundColor(getBaseContext().getColor(R.color.blue));
                                break;
                            case 6:
                                cardViewToFirstLine.setCardBackgroundColor(getBaseContext().getColor(R.color.yellow));
                                break;
                            case 7:
                                cardViewToFirstLine.setCardBackgroundColor(getBaseContext().getColor(R.color.pink));
                                break;
                            case 8:
                                cardViewToFirstLine.setCardBackgroundColor(getBaseContext().getColor(R.color.purple));
                                break;
                        }

                        firstPlayerLine.addView(cardViewToFirstLine);
                    }
                }
            }
        });

        blue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                answer[count] = 5;
                count++;

                CardView cardView = new CardView(getBaseContext());
                cardView.setCardBackgroundColor(getBaseContext().getColor(R.color.blue));
                cardView.setRadius(50);
                cardView.setLayoutParams(new LinearLayout.LayoutParams(100, 100));
                secondPlayerLine.addView(cardView);

                if (count > 4) {
                    count = 0;
                    secondPlayerLine.removeAllViews();
                    firstPlayerLine.removeAllViews();

                    for (int j : answer) {
                        CardView cardViewToFirstLine = new CardView(getBaseContext());
                        cardViewToFirstLine.setRadius(50);
                        cardViewToFirstLine.setLayoutParams(new LinearLayout.LayoutParams(100, 100));

                        switch (j) {
                            case 1:
                                cardViewToFirstLine.setCardBackgroundColor(getBaseContext().getColor(R.color.red));
                                break;
                            case 2:
                                cardViewToFirstLine.setCardBackgroundColor(getBaseContext().getColor(R.color.green));
                                break;
                            case 3:
                                cardViewToFirstLine.setCardBackgroundColor(getBaseContext().getColor(R.color.orange));
                                break;
                            case 4:
                                cardViewToFirstLine.setCardBackgroundColor(getBaseContext().getColor(R.color.skyBlue));
                                break;
                            case 5:
                                cardViewToFirstLine.setCardBackgroundColor(getBaseContext().getColor(R.color.blue));
                                break;
                            case 6:
                                cardViewToFirstLine.setCardBackgroundColor(getBaseContext().getColor(R.color.yellow));
                                break;
                            case 7:
                                cardViewToFirstLine.setCardBackgroundColor(getBaseContext().getColor(R.color.pink));
                                break;
                            case 8:
                                cardViewToFirstLine.setCardBackgroundColor(getBaseContext().getColor(R.color.purple));
                                break;
                        }

                        firstPlayerLine.addView(cardViewToFirstLine);
                    }
                }
            }
        });

        yellow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                answer[count] = 6;
                count++;

                CardView cardView = new CardView(getBaseContext());
                cardView.setCardBackgroundColor(getBaseContext().getColor(R.color.yellow));
                cardView.setRadius(50);
                cardView.setLayoutParams(new LinearLayout.LayoutParams(100, 100));
                secondPlayerLine.addView(cardView);

                if (count > 4) {
                    count = 0;
                    secondPlayerLine.removeAllViews();
                    firstPlayerLine.removeAllViews();

                    for (int j : answer) {
                        CardView cardViewToFirstLine = new CardView(getBaseContext());
                        cardViewToFirstLine.setRadius(50);
                        cardViewToFirstLine.setLayoutParams(new LinearLayout.LayoutParams(100, 100));

                        switch (j) {
                            case 1:
                                cardViewToFirstLine.setCardBackgroundColor(getBaseContext().getColor(R.color.red));
                                break;
                            case 2:
                                cardViewToFirstLine.setCardBackgroundColor(getBaseContext().getColor(R.color.green));
                                break;
                            case 3:
                                cardViewToFirstLine.setCardBackgroundColor(getBaseContext().getColor(R.color.orange));
                                break;
                            case 4:
                                cardViewToFirstLine.setCardBackgroundColor(getBaseContext().getColor(R.color.skyBlue));
                                break;
                            case 5:
                                cardViewToFirstLine.setCardBackgroundColor(getBaseContext().getColor(R.color.blue));
                                break;
                            case 6:
                                cardViewToFirstLine.setCardBackgroundColor(getBaseContext().getColor(R.color.yellow));
                                break;
                            case 7:
                                cardViewToFirstLine.setCardBackgroundColor(getBaseContext().getColor(R.color.pink));
                                break;
                            case 8:
                                cardViewToFirstLine.setCardBackgroundColor(getBaseContext().getColor(R.color.purple));
                                break;
                        }

                        firstPlayerLine.addView(cardViewToFirstLine);
                    }
                }
            }
        });

        pink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                answer[count] = 7;
                count++;

                CardView cardView = new CardView(getBaseContext());
                cardView.setCardBackgroundColor(getBaseContext().getColor(R.color.pink));
                cardView.setRadius(50);
                cardView.setLayoutParams(new LinearLayout.LayoutParams(100, 100));
                secondPlayerLine.addView(cardView);

                if (count > 4) {
                    count = 0;
                    secondPlayerLine.removeAllViews();
                    firstPlayerLine.removeAllViews();

                    for (int j : answer) {
                        CardView cardViewToFirstLine = new CardView(getBaseContext());
                        cardViewToFirstLine.setRadius(50);
                        cardViewToFirstLine.setLayoutParams(new LinearLayout.LayoutParams(100, 100));

                        switch (j) {
                            case 1:
                                cardViewToFirstLine.setCardBackgroundColor(getBaseContext().getColor(R.color.red));
                                break;
                            case 2:
                                cardViewToFirstLine.setCardBackgroundColor(getBaseContext().getColor(R.color.green));
                                break;
                            case 3:
                                cardViewToFirstLine.setCardBackgroundColor(getBaseContext().getColor(R.color.orange));
                                break;
                            case 4:
                                cardViewToFirstLine.setCardBackgroundColor(getBaseContext().getColor(R.color.skyBlue));
                                break;
                            case 5:
                                cardViewToFirstLine.setCardBackgroundColor(getBaseContext().getColor(R.color.blue));
                                break;
                            case 6:
                                cardViewToFirstLine.setCardBackgroundColor(getBaseContext().getColor(R.color.yellow));
                                break;
                            case 7:
                                cardViewToFirstLine.setCardBackgroundColor(getBaseContext().getColor(R.color.pink));
                                break;
                            case 8:
                                cardViewToFirstLine.setCardBackgroundColor(getBaseContext().getColor(R.color.purple));
                                break;
                        }

                        firstPlayerLine.addView(cardViewToFirstLine);
                    }
                }
            }
        });

        purple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                answer[count] = 8;
                count++;

                CardView cardView = new CardView(getBaseContext());
                cardView.setCardBackgroundColor(getBaseContext().getColor(R.color.purple));
                cardView.setRadius(50);
                cardView.setLayoutParams(new LinearLayout.LayoutParams(100, 100));
                secondPlayerLine.addView(cardView);

                if (count > 4) {
                    count = 0;
                    secondPlayerLine.removeAllViews();
                    firstPlayerLine.removeAllViews();

                    for (int j : answer) {
                        CardView cardViewToFirstLine = new CardView(getBaseContext());
                        cardViewToFirstLine.setRadius(50);
                        cardViewToFirstLine.setLayoutParams(new LinearLayout.LayoutParams(100, 100));

                        switch (j) {
                            case 1:
                                cardViewToFirstLine.setCardBackgroundColor(getBaseContext().getColor(R.color.red));
                                break;
                            case 2:
                                cardViewToFirstLine.setCardBackgroundColor(getBaseContext().getColor(R.color.green));
                                break;
                            case 3:
                                cardViewToFirstLine.setCardBackgroundColor(getBaseContext().getColor(R.color.orange));
                                break;
                            case 4:
                                cardViewToFirstLine.setCardBackgroundColor(getBaseContext().getColor(R.color.skyBlue));
                                break;
                            case 5:
                                cardViewToFirstLine.setCardBackgroundColor(getBaseContext().getColor(R.color.blue));
                                break;
                            case 6:
                                cardViewToFirstLine.setCardBackgroundColor(getBaseContext().getColor(R.color.yellow));
                                break;
                            case 7:
                                cardViewToFirstLine.setCardBackgroundColor(getBaseContext().getColor(R.color.pink));
                                break;
                            case 8:
                                cardViewToFirstLine.setCardBackgroundColor(getBaseContext().getColor(R.color.purple));
                                break;
                        }

                        firstPlayerLine.addView(cardViewToFirstLine);
                    }
                }
            }
        });
    }
}