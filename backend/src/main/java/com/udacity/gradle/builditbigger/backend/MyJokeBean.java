package com.udacity.gradle.builditbigger.backend;

import com.mzdhr.jokesource.Joke;

/** The object model for the data we are sending through endpoints */
public class MyJokeBean {
    private Joke mJoke;

    public MyJokeBean() {
        mJoke = new Joke();
    }

    public String getJokes() {
        return mJoke.getJoke();
    }

}