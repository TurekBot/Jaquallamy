package com.turekbros.games.jaquallamy.levels;

import java.util.Scanner;

public class Level1 {
    private static Scanner keyboard = new Scanner(System.in);


    public static void start() {
        System.out.println("\n\nLevel 1 Begin: \n\n");

        System.out.println("You are on a war-torn plateau.");
        System.out.println("Upon the horizon you spy something...");

        System.out.println("What do you spy?");
        String answer = keyboard.nextLine();
        System.out.println("Ah, you can now definitely see it is a " + answer + " coming towards you.");


    }
}
