package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    private Button mFirstAnswer;
    private Button mSecondAnswer;
    private TextView mStoryQuestion;
    private int mStoryIndex = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mFirstAnswer = findViewById(R.id.buttonTop);
        mSecondAnswer = findViewById(R.id.buttonBottom);
        mStoryQuestion = findViewById(R.id.storyTextView);


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:

        mFirstAnswer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mStoryIndex == 1){
                    mStoryQuestion.setText(R.string.T3_Story);
                    mFirstAnswer.setText(R.string.T3_Ans1);
                    mSecondAnswer.setText(R.string.T3_Ans2);
                    mStoryIndex = 4;
                }
                else if(mStoryIndex==2){
                    mStoryQuestion.setText(R.string.T3_Story);
                    mFirstAnswer.setText(R.string.T3_Ans1);
                    mSecondAnswer.setText(R.string.T3_Ans2);
                    mStoryIndex = 3;
                }
                else if(mStoryIndex==3){
                    mStoryQuestion.setText(R.string.T6_End);
                    mFirstAnswer.setVisibility(View.GONE);
                    mSecondAnswer.setVisibility(View.GONE);
                }
                else if(mStoryIndex==4){
                    mStoryQuestion.setText(R.string.T6_End);
                    mFirstAnswer.setVisibility(View.GONE);
                    mSecondAnswer.setVisibility(View.GONE);
                }
            }
        });
        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        mSecondAnswer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mStoryIndex == 1) {
                    mStoryQuestion.setText(R.string.T2_Story);
                    mFirstAnswer.setText(R.string.T2_Ans1);
                    mSecondAnswer.setText(R.string.T2_Ans2);
                    mStoryIndex = 2;
                }else if(mStoryIndex==2){
                    mStoryQuestion.setText(R.string.T4_End);
                    mFirstAnswer.setVisibility(View.GONE);
                    mSecondAnswer.setVisibility(View.GONE);
                }
                else if(mStoryIndex==3){
                    mStoryQuestion.setText(R.string.T5_End);
                    mFirstAnswer.setVisibility(View.GONE);
                    mSecondAnswer.setVisibility(View.GONE);
                }
                else if(mStoryIndex==4){
                    mStoryQuestion.setText(R.string.T5_End);
                    mFirstAnswer.setVisibility(View.GONE);
                    mSecondAnswer.setVisibility(View.GONE);
                }
            }
        });

    }
}
