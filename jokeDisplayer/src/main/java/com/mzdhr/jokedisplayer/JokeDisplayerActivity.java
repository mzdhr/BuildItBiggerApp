package com.mzdhr.jokedisplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class JokeDisplayerActivity extends AppCompatActivity {
    public static final String JOKE_KEY = "joke_key";
    private static TextView mJokeTextView;
    private ImageView mCloseButton;
    private ImageView mShareButton;
    private String mJoke;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke_displayer);

        // FindView
        mJokeTextView = (TextView) findViewById(R.id.joke_textView);
        mCloseButton = (ImageView) findViewById(R.id.close_button_imageView);
        mShareButton = (ImageView) findViewById(R.id.share_joke_imageView);

        // Receive Joke and Display it
        Intent intent = getIntent();
        mJoke = intent.getStringExtra(JOKE_KEY);
        if (mJoke != null && mJoke.length() != 0) {
            mJokeTextView.setText(mJoke);
        }

        mCloseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        mShareButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = mJoke;
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_TEXT, text.toString());
                startActivity(intent.createChooser(intent, "Please choose an App to send it!"));
            }
        });

    }
}
