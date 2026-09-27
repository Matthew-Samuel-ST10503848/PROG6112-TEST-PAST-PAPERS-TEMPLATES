package com.mycompany.prog6112toolkit.templates;

import java.util.Scanner;

public class TemplateSwitch {

    public static void main(String[] args) {

        // Create a Scanner for keyboard input.
        Scanner input = new Scanner(System.in);

        // Ask the user to choose an option.
        System.out.print("Enter an option (1-3): ");
        int choice = input.nextInt();

        // switch is useful when there are several fixed choices.
        switch (choice) {

            case 1:
                // Code for option 1.
                System.out.println("Option 1 selected.");
                break;

            case 2:
                // Code for option 2.
                System.out.println("Option 2 selected.");
                break;

            case 3:
                // Code for option 3.
                System.out.println("Option 3 selected.");
                break;

            default:
                // Runs if none of the cases match.
                System.out.println("Invalid option.");
        }

        // Close the Scanner.
        input.close();
    }
}
