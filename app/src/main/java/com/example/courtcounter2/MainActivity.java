package com.example.android.courtcounter2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.android.courtcounter2.R;

public class MainActivity extends AppCompatActivity {
    int score = 0 , scoreB=0; int x = 0  , x3 , x2 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public int add3ForA(View v)
    { score= score+3;
        displayForTeamA(score);
        x3= 3 ;
        return x3 ;
    }

    public int add2ForA(View v)
    {score=score+2;
        displayForTeamA(score);
        x3= 2;
        return x3 ;
    }

    public int add1ForA(View v)
    {score=score+1;
        displayForTeamA(score);
        x3= 1;
        return x3;
    }

    public void redoforA(View v  )
    {
        displayForTeamA(score-x3)  ;
     score=score - x3;
     x3 =0 ;
    }

    public int add3ForB(View v)
    { scoreB= scoreB+3;
    displayForTeamB(scoreB);
        x2=3 ;
        return x2;
    }

    public int add2ForB(View v)
    {scoreB=scoreB+2;
        displayForTeamB(scoreB);
        x2 = 2 ;
        return x2 ;
    }

    public int add1ForB(View v)
    {scoreB=scoreB+1;
        displayForTeamB(scoreB);
        x2 = 1 ;
        return x2 ;
    }

    public void redoforB(View v )
    {
        displayForTeamB(scoreB - x2)  ;
        scoreB=scoreB - x2;
        x2 =0 ;

    }

    public void ResetScore(View v)
    {
     score = 0 ;
     scoreB =0;
     displayForTeamA(score);
     displayForTeamB(scoreB);

    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
}