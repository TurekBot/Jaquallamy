package com.turekbros.games.jaquallamy.levels;

import com.turekbros.games.jaquallamy.Game;

import java.time.Duration;
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
    private static String[] weapons = {"a Scymitar" ,"a Bow and Arrow" ,"a Katana" ,"a Soup can Lid" ,"a Dagger" ,"a Plow", "glasses", "sand", "THEEEE Rapier", "a Fish-stick", "a Portal Gun",
            "a Broadsword"};

    public static void say(String s, long delay) throws InterruptedException { // this method delays text characters
        for (int i = 0; i < s.length(); i++) {
            System.out.print(s.charAt(i));
            Thread.sleep(delay);
        }
        System.out.println(""); // space
    }

    public static void start() throws InterruptedException {
        String[] listLine = new String[500];
        listLine[0] = "\n\nLevel 1 Begin: \n\n";
        listLine[1] = "You are on a war-torn Plateau";
        listLine[2] = "Upon the horizon you spy something...";
        listLine[3] = "What do you spy?";
        // see line 55 for listLine[4]
        listLine[5] = "what will you do next?";
        // see line ___ for listLine[10]
        int i;
        long time = 1L; // this is the time integer THIS DETERMINES HOW LONG THE  DELAY IS IN BETWEEN CHARACTERS
        for (i = 0; i < listLine[0].length(); i++) { // for loop delays individual chars in string
            System.out.print(listLine[0].charAt(i));
            Thread.sleep(time); //time is in milliseconds
        }
        System.out.println(""); // this is the space in between lines


        say("You are on a war-torn Plateau", time);


        say("Upon the horizon you spy something...", time);

        say("What do you spy?", time);


        String answer = keyboard.nextLine(); //user's reply

        listLine[4] = "Ah, you can now definitely see it is " + answer + " coming towards you."; // listLine[4] needs to be here to utilize String var "answer"

        say("Ah, you can now definitely see it is " + answer + " coming towards you.", time);


        say("what will you do next?", time);
        say("1. Run in the opposite direction", time);
        say("2. Sneak up on the " + answer, time);
        say("3. Stay put", time);
        say("4. Sprint towards "+ answer + " while swinging " + getRandomWeapon(), time);


        String action = keyboard.nextLine();
        listLine[10] = "You decide to " + action; //listLine[6] is here to utilize String var "action"

        for (i = 0; i < listLine[10].length(); i++) { //prints line 10
            System.out.print(listLine[10].charAt(i));
            Thread.sleep(time);
        }
        System.out.println("");


    }

    private static String getRandomWeapon() {
        Random r = new Random();
        int weaponNumber  = r.nextInt(12);

        return weapons[weaponNumber];
    }

    /**
     * A convenience method that prints out the message one key at a time in an effort to simulate someone
     * talking or typing.
     *
     * @param message the message that will be output to the user, character by character
     * @param delay   the delay between outputting characters
     */
    private void say(String message, Duration delay) throws InterruptedException {
        //Get the string as a bunch of chars

        //Then for each character, print it at the specified delay.
    }
}


