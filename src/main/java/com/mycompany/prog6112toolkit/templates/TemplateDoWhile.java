package com.mycompany.prog6112toolkit.templates;

import java.util.Scanner;

public class TemplateDoWhile {

    public static void main(String[] args) {

        // Create a Scanner for user input.
        Scanner input = new Scanner(System.in);

        // Store the user's choice.
        int choice;

        // A do-while loop runs at least once.
        do {

            // Display a simple menu.
            System.out.println("1. Continue");
            System.out.println("2. Exit");
            System.out.print("Choose: ");

            // Read the user's choice.
            choice = input.nextInt();

        // Repeat while the user has not chosen 2.
        } while (choice != 2);

        // Close the Scanner.
        input.close();
    }
}
