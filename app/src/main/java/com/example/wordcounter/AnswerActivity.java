package com.example.wordcounter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class AnswerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer);

        TextView answerText = (TextView)findViewById(R.id.text_answer);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        String result = extras.getString("result");

        answerText.setText(result);
    }
}
