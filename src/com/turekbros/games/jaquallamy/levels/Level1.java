package com.turekbros.games.jaquallamy.levels;

import com.turekbros.games.jaquallamy.Game;
import com.turekbros.games.jaquallamy.JokeList.*;

import java.util.Random;
import java.util.Scanner;


public class Level1 {


    /**
     * This is how the user sends input.◙
     */

    private static Scanner keyboard = new Scanner(System.in);
    /**
     * This is to access global things like the user's name and land
     * Try game.getName(); or game.getLand();
     */
    private static Game game;
    /**
     * what is this private static game used for? ^ <-------<-----------<--------<-------<-------<-------
     */
    private static String[] weapons = {"a Scimitar", "a Bow and Arrow", "a Katana", "a Soup can Lid", "a Dagger", "a Plow", "glasses", "Sand", "THEEEE Rapier", "a Fish-stick", "a Portal Gun",
            "a Broadsword"};
    private static String[] opponent = {"Jeremy", "Mist the Dragon", "Birds", "A Lion", "a Possessed Staple Gun", "a younger version of yourself", "Dr. Impaired", "a United State Quarter"
            , "your Ex-Boyfriend", "your Ex-Girlfriend", "Lad", "a dancing flower", "a Dark Knight", "a Daemon", "a Fallen Star"};

    public static String[] jokes = {"Programmer(noun.) A machine that turns coffee into code", "What do you call a programmer from Finland? ", "What do computers and air conditioners hve in common?",
            "Why do Java programmers have to wear glasses?", "what happens to a frog's car when it breaks down?", "what did the duck say when he bought lipstick?"};

    public static String[] answers = {"A machine that turns coffee into code.", "Nerdic.", "They both become useless when you open Windows.", "because they don't C#.", "It gets toad away."
            , "put it on my bill."};

    public static void say(String s, long delay) throws InterruptedException { // this method delays text characters
        for (int i = 0; i < s.length(); i++) {
            System.out.print(s.charAt(i));
            Thread.sleep(delay);
        }
        System.out.println(""); // space
    }

    /**
     * A convenience method that prints out the message one key at a time in an effort to simulate someone
     * talking or typing.
     */


    public static void start() throws InterruptedException {

        int[] action = new int[50]; //an array designated for in-game choices
        long time = 50L; // this is the time integer THIS DETERMINES HOW LONG THE  DELAY IS IN BETWEEN CHARACTERS
        int proceed = 0; // integer acting as a boolean
        int hp = 100, energy = 10;
        String decide = "You decide to ";
        String[] opponent = new String[14];
        opponent[0] = getRandomOpponent();
        String[] weapon = new String[50];
        weapon[0] = getRandomWeapon();
        String[] option = new String[50];

        /**
         * This String Array will be used to record and declare their decisions
         */

        say("Level 1 Begin:", time);
        say("Your health is " + hp + ".", time);
        say("Your energy is " + energy + ".", time);
        say("You can view your stat's at any time by typing !stats", time);

        say("You are on a war-torn Plateau,", time);
        say("You spot the corner of a buried treasure chest in the ground.", time);

        say("What will you do?", time);
        say(option[0] = "1. Dig up the chest", time);
        say(option[1] = "2. Bury the chest deeper into the ground.", time);
        say(option[2] = "3. Walk past the chest.", time);
        say(option[3] = "4. Crack a witty joke.", time);
        /**
         * option[0-3] branch off into their own story trees
         * option[3] pulls from a joke database that's currently in the works
         */


        action[0] = keyboard.nextInt();
        /**
         * This is how the user sends input.◙
         */
        while (proceed == 0) {
            if (action[0] == 1) { //option 1 branch
                proceed++;//increments proceed so that the while loop ends
                say(decide + option[0], time); //option 1
                say("You open the chest and you discover " + weapon[0] + " inside!", time);
            }

            /**
             * end of option 1's tree story branch
             */


            else if (action[0] == 2) {//option 2
                proceed++;
                say(decide + option[1], time); //option 2
                hp = hp - 12;

                say("Suddenly, the chest shoots out of the ground! It lands on your foot! 'ouch!!' you took damage and lost 12 hp!" + hp, time);
                say("Clearly the chest wants you to  open it. What are you going to do?", time);
                say("1. open the chest. 2. continue across the plateau", time);

                action[1] = keyboard.nextInt();
                while (proceed == 0) {
                    if (action[1] == 1) {
                        say(decide + option[0], time); //option 1
                        say("You open the chest and you discover " + weapon[0] + " inside!", time);
                    } else if (action[1] == 2) {
                        say(decide + option[3], time);

                    }
                }
            }
            /**
             * end of option 2's tree story branch
             */


            else if (action[0] == 3) {
                proceed++;
                say(decide + option[2], time); //option 3
            }

            /**
             * end of option 3's tree story branch
             */

            else if (action[0] == 4) {
                proceed++;
                say(getRandomJoke(), time); //option 4
            }

            /**
             * end of option 4's tree story branch
             */

            else
                say("Option not available. (Use options 1-4)", time);
            /**
             * @param while requires the user to make a choice
             * @param If statements are used to allocate the user's choices
             * @param else resets the while loop
             */

        }

        say("...", 1000L);
        say("", time);
        say("Upon the horizon you spy something...", time);

        say("Ah, you can now definitely see it is " + opponent[0] + " coming towards you.", time);

        say("what will you do next?", time);
        say("1. Run in the opposite direction,", time);
        say("2. Sneak up on the " + opponent[0] + ",", time);
        say("3. Stay put", time);
        say("or 4. Sprint towards " + opponent[0] + " while swinging " + weapon[0] + ".", time);


        action[1] = keyboard.nextInt();
        proceed = 0;
        while (proceed == 0) {
            if (action[1] == 1) { //option 1 branch
                proceed++;//increments the variable proceed so that the while loop ends
                say("You decide to run in the opposite direction of " + opponent[0], time); //option 1
            } else if (action[1] == 2) {//option 2
                proceed++;
                say("You decide to sneak up on " + opponent[0] + ".", time); //option 2
            } else if (action[1] == 3) {
                proceed++;
                say("You decide to stay put.", time); //option 3
            } else if (action[1] == 4) {
                proceed++;
                say("You decide to sprint towards " + opponent[0] + " while furiously swinging " + weapon[0] + " at it.", time); //option 4
            } else
                say("Option not available. (Use options 1-4)", time);//this resets the while loop so that the player may choose again

        }


    }

    private static String getRandomWeapon() {//this method pulls from an array of Random Weapons to give the player
        Random r = new Random();
        int weaponNumber = r.nextInt(12);

        return weapons[weaponNumber];
    }

    private static String getRandomOpponent() {//this method pulls from an array of Random Opponents to put the player up against
        Random r = new Random();
        int opponentNumber = r.nextInt(14);

        return opponent[opponentNumber];
    }

    private static String getRandomJoke() throws InterruptedException {//this method pulls from an array of Random Jokes to humor the player with
        int i = 0;
        Random r = new Random();
        int jokeNumber = r.nextInt(20);
        for (i = 0; i < jokes[jokeNumber].length(); i++) { //Todo I need help with the joke parallel arrays, they are giving me a headache
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


        return String.valueOf(jokes);
    }
}


/**
 * @param message the message that will be output to the user, character by character
 * @param delay   the delay between outputting characters
 */




