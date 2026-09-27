package com.mycompany.prog6112toolkit.templates;

import java.util.Scanner;

public class TemplateArrayInput {

    public static void main(String[] args) {

        // Create a Scanner for keyboard input.
        Scanner input = new Scanner(System.in);

        // Store the names/categories in a 1D array.
        String[] names = {"A", "B", "C"};

        // Create a 2D array with one row for each name and two values per row.
        int[][] values = new int[names.length][2];

        // Move through every row.
        for (int i = 0; i < names.length; i++) {

            // Ask for the first value.
            System.out.print("Enter first value for " + names[i] + ": ");

            // Store it in column 0.
            values[i][0] = input.nextInt();

            // Ask for the second value.
            System.out.print("Enter second value for " + names[i] + ": ");

            // Store it in column 1.
            values[i][1] = input.nextInt();
        }

        // Close the Scanner.
        input.close();
    }
}
