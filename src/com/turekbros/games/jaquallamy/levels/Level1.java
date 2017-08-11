package com.turekbros.games.jaquallamy.levels;

import java.util.Scanner;

public class Level1 {

    private static Scanner keyboard = new Scanner(System.in);


    public static void start  ()throws InterruptedException {
        String[] listLine = new String[500];
        listLine[0] = "\n\nLevel 1 Begin: \n\n";
        listLine[1] = "You are on a war-torn Plateau";
        listLine[2] = "\"Upon the horizon you spy something...\"";
        listLine[3] = "What do you spy?";
        listLine[4] = "Ah, you can now definitely see it is " + answer + " coming towards you.";
        System.out.println(listLine[0]);

        System.out.println(listLine[1]);
        System.out.println(listLine[2]);

        System.out.println(listLine[3]);
        String answer = keyboard.nextLine();
        System.out.println("Ah, you can now definitely see it is " + answer + " coming towards you.");
        System.out.pintln(name +" what will you do next?");
        String action = keyboard.nextLine();
        System.out.println("You decide to " + action);
        System.out.println("");


    }
}
