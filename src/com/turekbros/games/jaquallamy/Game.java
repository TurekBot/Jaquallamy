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


    public static void main(String[] args) throws InterruptedException {
        int i;
        long time=50L;


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

            // TODO: 8/10/2017 Let's add a method that automates the delay of text so that things look cleaner.
            // TODO: 8/11/2017 Let's add
            for (i = 0; i < 3; i++) {
                System.out.print(".");
                Thread.sleep(1000);
            }

       say("Press any key to begin Level 1...", time);

            Scanner keyboard = new Scanner(System.in);
            keyboard.hasNextLine();
            Level1.start();

        }


    public static String getName() {
        return name;
    }

    public static String getLand() {
        return land;
    }
}
