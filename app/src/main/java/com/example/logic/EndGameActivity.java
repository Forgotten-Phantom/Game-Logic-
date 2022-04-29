package com.example.logic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.google.android.material.card.MaterialCardView;

public class EndGameActivity extends AppCompatActivity {

    Button playAgain;
    Button toMenu;
    LinearLayout finalCode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end_game);

        playAgain = findViewById(R.id.playAgain);
        toMenu = findViewById(R.id.toMenu);
        finalCode = findViewById(R.id.finalCode);

        int[] code = getIntent().getExtras().getIntArray("code");

        for (int j : code) {

            getApplicationContext().getTheme().applyStyle(R.style.Base_Theme_MaterialComponents_Light, true);

            MaterialCardView materialCardView = new MaterialCardView(getApplication());
            materialCardView.setRadius(150);
            materialCardView.setLayoutParams(new LinearLayout.LayoutParams(150, 150));
            materialCardView.setStrokeColor(Color.BLACK);
            materialCardView.setStrokeWidth(2);

            switch (j) {
                case 1:
                    materialCardView.setCardBackgroundColor(getBaseContext().getColor(R.color.red));
                    break;
                case 2:
                    materialCardView.setCardBackgroundColor(getBaseContext().getColor(R.color.green));
                    break;
                case 3:
                    materialCardView.setCardBackgroundColor(getBaseContext().getColor(R.color.orange));
                    break;
                case 4:
                    materialCardView.setCardBackgroundColor(getBaseContext().getColor(R.color.skyBlue));
                    break;
                case 5:
                    materialCardView.setCardBackgroundColor(getBaseContext().getColor(R.color.blue));
                    break;
                case 6:
                    materialCardView.setCardBackgroundColor(getBaseContext().getColor(R.color.yellow));
                    break;
                case 7:
                    materialCardView.setCardBackgroundColor(getBaseContext().getColor(R.color.pink));
                    break;
                case 8:
                    materialCardView.setCardBackgroundColor(getBaseContext().getColor(R.color.purple));
                    break;
            }

            finalCode.addView(materialCardView);
        }

        playAgain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(EndGameActivity.this, GameActivity.class);
                startActivity(i);
            }
        });

        toMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(EndGameActivity.this, MenuActivity.class);
                startActivity(i);
            }
        });
    }
}