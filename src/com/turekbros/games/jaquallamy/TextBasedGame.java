package com.turekbros.games.jaquallamy;

import com.turekbros.games.jaquallamy.levels.Level1;

import java.util.Scanner;

public class TextBasedGame {

    public static void main(String[] args) {
        System.out.println("Welcome to Jaquallamy, a Text Based Game by");
        System.out.println
                ("╔════╦╗─────╔════╗──────╔╗─╔══╗\n" +
                        "║╔╗╔╗║║─────║╔╗╔╗║──────║║─║╔╗║\n" +
                        "╚╝║║╚╣╚═╦══╗╚╝║║╠╣╔╦═╦══╣║╔╣╚╝╚╦═╦══╦══╗\n" +
                        "──║║─║╔╗║║═╣──║║║║║║╔╣║═╣╚╝╣╔═╗║╔╣╔╗║══╣\n" +
                        "──║║─║║║║║═╣──║║║╚╝║║║║═╣╔╗╣╚═╝║║║╚╝╠══║\n" +
                        "──╚╝─╚╝╚╩══╝──╚╝╚══╩╝╚══╩╝╚╩═══╩╝╚══╩══╝\n");
        System.out.println("Press any key to begin Level 1...");

        Scanner keyboard = new Scanner(System.in);
        keyboard.hasNextLine();
        Level1.start();
    }
}
