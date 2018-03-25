package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.util.Pair;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by mohammad on 24/03/2018.
 */

@RunWith(AndroidJUnit4.class)
public class MainActivityTest {
    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule =
            new ActivityTestRule<>(MainActivity.class);


    /**
     * Method to verify that the AsyncTask is indeed loading jokes. Not an empty "" result.
     * @throws Exception
     */
    @Test
    public void tellJokeTest() throws Exception {
        // Arrange
        EndpointsAsyncTask endpointsAsyncTask = new EndpointsAsyncTask();

        // Action
        endpointsAsyncTask.execute(new Pair<Context, String>(mActivityTestRule.getActivity(), "Manfred"));

        // Assert
        String result = endpointsAsyncTask.get();
        System.out.println("Result Joke ---> " + result);
        assertThat(result.isEmpty(), is(false));
    }

}