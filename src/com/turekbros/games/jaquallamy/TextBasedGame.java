package com.turekbros.games.jaquallamy;

import com.turekbros.games.jaquallamy.levels.Level1;

import java.util.Scanner;

public class TextBasedGame {
    /**
     * This is how the user sends us input. Use methods like .next() and nextLine() to get input.
     */
    private static Scanner keyboard = new Scanner(System.in);

    /**
     * The user's name
     */
    public static String name;
    public static String land;

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Welcome to Jaquallamy, a Text Based Game by");
        System.out.println
                ("╔════╦╗─────╔════╗──────╔╗─╔══╗\n" +
                        "║╔╗╔╗║║─────║╔╗╔╗║──────║║─║╔╗║\n" +
                        "╚╝║║╚╣╚═╦══╗╚╝║║╠╣╔╦═╦══╣║╔╣╚╝╚╦═╦══╦══╗\n" +
                        "──║║─║╔╗║║═╣──║║║║║║╔╣║═╣╚╝╣╔═╗║╔╣╔╗║══╣\n" +
                        "──║║─║║║║║═╣──║║║╚╝║║║║═╣╔╗╣╚═╝║║║╚╝╠══║\n" +
                        "──╚╝─╚╝╚╩══╝──╚╝╚══╩╝╚══╩╝╚╩═══╩╝╚══╩══╝\n");

        System.out.println("What do you call yourself? ");
        name = keyboard.nextLine();

        System.out.println("Ay, " + name + "...");

        for (int i = 0; i < 3; i++) {
            Thread.sleep(1000);
            System.out.print(".");
        }

        System.out.println("...and from where do you hail, oh, " + name + "?");
        land = keyboard.nextLine();

        System.out.println("*A mist swirls around you*");

        for (int i = 0; i < 3; i++) {
            System.out.print(".");
            Thread.sleep(1000);
        }

        System.out.println("Welcome to Jaquallamy, " + name + " of " + land);

        // TODO: 8/10/2017 Let's add a method that automates the delay of text so that things look cleaner.
        for (int i = 0; i < 3; i++) {
            System.out.print(".");
            Thread.sleep(1000);
        }

        System.out.println("Press any key to begin Level 1...");

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
