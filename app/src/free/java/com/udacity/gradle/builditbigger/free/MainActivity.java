package com.udacity.gradle.builditbigger.free;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Pair;
import android.view.View;

import com.udacity.gradle.builditbigger.EndpointsAsyncTask;
import com.udacity.gradle.builditbigger.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void tellJoke(View view) {
        // Trigger an AsyncTask "EndpointsAsyncTask.java".
        // To grab data from the server "backend".
        // The server grab data from "JokeSource Java library".
        // And a method "onPostExecute" inside "AsyncTask" send data result as extra Intent.
        // To joke "jokeDisplayer Android library".
        new EndpointsAsyncTask().execute(new Pair<Context, String>(this, "Manfred"));
    }

}
