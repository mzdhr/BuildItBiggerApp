package com.mzdhr.jokedisplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

public class JokeDisplayerActivity extends AppCompatActivity {

    private static TextView mJokeTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke_displayer);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // FindView
        mJokeTextView = (TextView) findViewById(R.id.joke_textView);

        // Receive Joke and Display it
        Intent intent = getIntent();
        String joke = intent.getStringExtra("JOKE_KEY");
        if (joke != null && joke.length() != 0) {
            mJokeTextView.setText(joke);
        }

    }
}
