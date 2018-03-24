package com.mzdhr.jokesource;

import java.util.ArrayList;
import java.util.Random;

public class Joke {
    ArrayList<String> mJokes;

    public Joke() {
        mJokes = new ArrayList<>();
        mJokes.add("Heard joke once: Man goes to doctor. Says he's depressed. Says life seems harsh and cruel. Says he feels all alone in a threatening world where what lies ahead is vague and uncertain. Doctor says, \"Treatment is simple. Great clown Pagliacci is in town tonight. Go and see him. That should pick you up.\" Man bursts into tears. Says, \"But doctor...I am Pagliacci.");
        mJokes.add("I’m employed at a computer security company and have a colleague whose name is M. Alware. His e-mail address is malware@company.com.");
        mJokes.add("Q: Why did the computer show up at work late? \nA: It had a hard drive.");
        mJokes.add("I just got fired from my job at the keyboard factory. They told me I wasn’t putting in enough shifts.");
    }

    public String getJoke() {
        Random random = new Random();
        return mJokes.get(random.nextInt(mJokes.size()));
    }
}
