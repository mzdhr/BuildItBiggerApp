package com.udacity.gradle.builditbigger;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.mzdhr.jokedisplayer.JokeDisplayerActivity;
import com.mzdhr.jokesource.Joke;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void tellJoke(View view) {
        // Create an Intent to use the Display Joke Android Library
        Intent intent = new Intent(this, JokeDisplayerActivity.class);

        // Create a Joke from Joke Java Library
        Joke jokeSource = new Joke();

        // Putting the Joke inside the intent and send it through the Intent to the Display Activity
        String joke = jokeSource.getJoke();
        intent.putExtra("JOKE_KEY", joke);
        startActivity(intent);
    }

}
