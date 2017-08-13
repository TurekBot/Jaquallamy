package com.turekbros.games.jaquallamy;


import java.util.Random;

public class JokeList {


    String[] jokes = {"Programmer(noun.) A machine that turns coffee into code", "What do you call a programmer from Finland? ", "What do computers and air conditioners hve in common?",
            "Why do Java programmers have to wear glasses?", "what happens to a frog's car when it breaks down?", "what did the duck say when he bought lipstick?"};

    String[] answers = {"A machine that turns coffee into code.", "Nerdic.", "They both become useless when you open Windows.", "because they don't C#.", "It gets toad away."
            , "put it on my bill."};

    String getRandomJoke() throws InterruptedException {//this method pulls from an array of Random Jokes to humor the player with
        int i = 0;
        Random r = new Random();
        int jokeNumber = r.nextInt(5);
        for (i = 0; i < jokes[jokeNumber].length(); i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print(".");
        }
        for (int k = 0; k < answers[jokeNumber].length(); k++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print(answers[jokeNumber].charAt(k));
        }


        return null;
    }
}