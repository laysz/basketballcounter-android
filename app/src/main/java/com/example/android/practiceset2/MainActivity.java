package com.example.android.practiceset2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreA = 0;
    int scoreB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    public void score(View v) {
        String s = (String) v.getTag();
        char team = s.charAt(0);
        char change = s.charAt(1);

        if (team == 'A') {
            if (change == '3') {
                scoreA+=3;
                updateScores();
            } else if(change == '2') {
                scoreA+=2;
                updateScores();
            } else {
                scoreA++;
                updateScores();
            }
        } else {
            if (change == '3') {
                scoreB+=3;
                updateScores();
            } else if(change == '2') {
                scoreB+=2;
                updateScores();
            } else {
                scoreB++;
                updateScores();
            }
        }
    }

    public void resetScores(View v) {
        scoreA = scoreB = 0;
        updateScores();
    }

    public void updateScores() {
        TextView textA = (TextView) findViewById(R.id.scoreA);
        textA.setText("" + scoreA);
        TextView textB = (TextView) findViewById(R.id.scoreB);
        textB.setText("" + scoreB);
    }
}