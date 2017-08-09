package com.example.wordcounter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class WordCounterActivity extends AppCompatActivity {

    Button button;
    TextView enteredText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_counter);

        enteredText = (TextView) findViewById(R.id.passage_text);
        button = (Button)findViewById(R.id.button);
    }

    public void onButtonClicked(View button) {
        Log.d(getClass().toString(), "onShakeButtonClicked was called");
        String  passage = enteredText.getText().toString();

        WordCounter wordCounter = new WordCounter(passage);
        Integer words = wordCounter.wordCount();
        String result = words.toString();

        Intent intent = new Intent(this, AnswerActivity.class);
        intent.putExtra("result", result);
        startActivity(intent);
    }

}
