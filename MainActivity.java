package com.johnlazzarini.courtcounter;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int pointsA = 0;
    int pointsB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void incrementByThreeA(View view){
        pointsA += 3;
        TextView quantityTextView = (TextView) findViewById(R.id.team_a);
        quantityTextView.setText("" + pointsA);
        winResult();
    }

    public void incrementByTwoA(View view){
        pointsA += 2;
        TextView quantityTextView = (TextView) findViewById(R.id.team_a);
        quantityTextView.setText("" + pointsA);
        winResult();
    }

    public void incrementByOneA(View view){
        pointsA += 1;
        TextView quantityTextView = (TextView) findViewById(R.id.team_a);
        quantityTextView.setText("" + pointsA);
        winResult();
    }

    public void incrementByThreeB(View view){
        pointsB += 3;
        TextView quantityTextView = (TextView) findViewById(R.id.team_b);
        quantityTextView.setText("" + pointsB);
        winResult();
    }

    public void incrementByTwoB(View view){
        pointsB += 2;
        TextView quantityTextView = (TextView) findViewById(R.id.team_b);
        quantityTextView.setText("" + pointsB);
        winResult();
    }

    public void incrementByOneB(View view){
        pointsB += 1;
        TextView quantityTextView = (TextView) findViewById(R.id.team_b);
        quantityTextView.setText("" + pointsB);
        winResult();
    }

    public void reset(View view){
        pointsA = pointsB = 0;

        TextView quantityTextViewA = (TextView) findViewById(R.id.team_a);
        TextView quantityTextViewB = (TextView) findViewById(R.id.team_b);
        quantityTextViewA.setText("" + pointsA);
        quantityTextViewB.setText("" + pointsB);

        TextView winner = (TextView) findViewById(R.id.win_result);
        winner.setText("");
    }

    public void winResult(){
        TextView winner = (TextView) findViewById(R.id.win_result);

        if(pointsA >= 21 && pointsB >= 21)
            return;

        if (pointsA >= 21)
        winner.setText("Team A has won!");

        else if (pointsB >= 21)
            winner.setText("Team B has won!");
    }
}
