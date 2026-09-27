package com.mycompany.prog6112toolkit.templates;

import java.util.Scanner;

public class TemplateValidation {

    public static void main(String[] args) {

        // Create a Scanner for input.
        Scanner input = new Scanner(System.in);

        // Variable used to store the user's number.
        int number;

        // Keep asking until the number is within the required range.
        do {

            // Ask the user for a value.
            System.out.print("Enter a number between 1 and 100: ");

            // Read the number.
            number = input.nextInt();

            // If the number is invalid, tell the user.
            if (number < 1 || number > 100) {
                System.out.println("Invalid value. Try again.");
            }

        // Continue while the value is outside the allowed range.
        } while (number < 1 || number > 100);

        // Confirm the valid value.
        System.out.println("Valid value: " + number);

        // Close the Scanner.
        input.close();
    }
}
