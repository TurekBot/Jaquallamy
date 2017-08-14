package com.turekbros.games.jaquallamy;

import com.turekbros.games.jaquallamy.levels.Level1;

import java.util.Scanner;

import static com.turekbros.games.jaquallamy.levels.Level1.say;

public class Game {
    /**
     * This is how the user sends us input. Use methods like .next() and nextLine() to get input.
     */
    private static Scanner keyboard = new Scanner(System.in);

    /**
     * The user's name
     */
    private static String name;
    private static String land;
    public static int hp = 100, energy = 10;

    public static void main(String[] args) throws InterruptedException {
        int i;
        long time=50L;
        boolean dead = false;

        say("\"Welcome to Jaquallamy, a Text Based Game by", time);


        say("╔════╦╗─────╔════╗──────╔╗─╔══╗\n" +
                "║╔╗╔╗║║─────║╔╗╔╗║──────║║─║╔╗║\n" +
                "╚╝║║╚╣╚═╦══╗╚╝║║╠╣╔╦═╦══╣║╔╣╚╝╚╦═╦══╦══╗\n" +
                "──║║─║╔╗║║═╣──║║║║║║╔╣║═╣╚╝╣╔═╗║╔╣╔╗║══╣\n" +
                "──║║─║║║║║═╣──║║║╚╝║║║║═╣╔╗╣╚═╝║║║╚╝╠══║\n" +
                "──╚╝─╚╝╚╩══╝──╚╝╚══╩╝╚══╩╝╚╩═══╩╝╚══╩══╝\n", 5L);


        say("\"What do you call yourself? ", time);
        name = keyboard.nextLine();



        say("Ay, " + name + "...", time);

            for (i = 0; i < 3; i++) {
                Thread.sleep(1000);
                System.out.print(".");
            }

        say("...and from where do you hail, oh, " + name + "?", time);
            land = keyboard.nextLine();

            say("*A mist swirls around you*", time);

            for (i = 0; i < 3; i++) {
                System.out.print(".");
                Thread.sleep(1000);
            }

            say("Welcome to Jaquallamy, " + name + " of " + land, time);

        // TODO: 8/10/2017 Let's add a method that automates the delay of text so that things look cleaner. - Completed 8/11/2017
        // TODO: 8/11/2017 Let's add a command detector so the user can use commands like !stats or !help no matter where they are in the game
        // TODO: 8/14/2017 We need to add a win and lose condition, I've tried adding a while loop that checks for hp <= 0 which is checking death but it still needs work
            for (i = 0; i < 3; i++) {
                System.out.print(".");
                Thread.sleep(1000);
            }

        say("Press the enter key to begin Level 1...", time);

            Scanner keyboard = new Scanner(System.in);
            keyboard.hasNextLine();
        while (dead != true) {
            Level1.start();
            if (hp <= 0 || energy <= 0) {
                dead = true;
            }
        }

        say("you have died..", time);
        System.exit(0);
        }


    public static String getName() {
        return name;
    }

    public static String getLand() {
        return land;
    }

    public static String getJoke() {
        return null;
    }

    public static Integer getLiving() {
        return hp;
    }
}
