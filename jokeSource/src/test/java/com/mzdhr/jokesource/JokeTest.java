package com.mzdhr.jokesource;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by mohammad on 24/03/2018.
 */
public class JokeTest {
    Joke mJoke;

    @Before
    public void setUp() throws Exception {
        mJoke = new Joke();
    }

    @Test
    public void getJokeTest() throws Exception {
        for (int i = 0; i < 100; i++) {
            System.out.println(mJoke.getJoke());
            System.out.println("--------");
        }

    }

}