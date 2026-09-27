package com.mycompany.prog6112toolkit.arrays;

import java.util.Scanner;

/*
 * QUESTION 1 TEMPLATE
 *
 * This template follows the repeated pattern seen in the provided papers:
 * 1. One-dimensional array for names.
 * 2. Two-dimensional array for two values per name.
 * 3. User input stored in the 2D array.
 * 4. Display the report.
 * 5. Calculate a total for each row.
 * 6. Find the row with the highest total.
 */
public class ArrayReportTemplate {

    public static void main(String[] args) {

        // Scanner allows us to receive input typed by the user.
        Scanner input = new Scanner(System.in);

        // A 1D String array stores the names/categories.
        // Change these values to match the exam question.
        String[] names = {"Cape Town", "Johannesburg", "Durban"};

        // A 2D int array stores two numbers for each name.
        // Each row belongs to one name.
        // Column 0 = first value, Column 1 = second value.
        int[][] values = new int[3][2];

        // This loop moves through each name one at a time.
        for (int i = 0; i < names.length; i++) {

            // Ask the user for the first value for the current name.
            System.out.print("Enter first value for " + names[i] + ": ");

            // Store the first value in column 0 of the current row.
            values[i][0] = input.nextInt();

            // Ask the user for the second value for the current name.
            System.out.print("Enter second value for " + names[i] + ": ");

            // Store the second value in column 1 of the current row.
            values[i][1] = input.nextInt();
        }

        // Print a heading for the report.
        System.out.println("\n========================================");
        System.out.println("          PERFORMANCE REPORT");
        System.out.println("========================================");

        // Print the column headings.
        System.out.println("NAME\tFIRST\tSECOND");
        System.out.println("----------------------------------------");

        // This loop prints every row stored in the arrays.
        for (int i = 0; i < names.length; i++) {

            // Print the name and its two stored values.
            System.out.println(
                    names[i] + "\t"
                    + values[i][0] + "\t"
                    + values[i][1]
            );
        }

        // Print a heading for the totals.
        System.out.println("\n----------------------------------------");
        System.out.println("TOTAL FOR EACH NAME");
        System.out.println("----------------------------------------");

        // Start with a very small highest total.
        int highestTotal = -1;

        // This variable remembers which row has the highest total.
        int highestIndex = 0;

        // Loop through each row to calculate its total.
        for (int i = 0; i < names.length; i++) {

            // Add the two values in the current row.
            int total = values[i][0] + values[i][1];

            // Display the total for the current name.
            System.out.println(names[i] + ": " + total);

            // Check whether this total is higher than the current highest.
            if (total > highestTotal) {

                // Store the new highest total.
                highestTotal = total;

                // Store the position of the name with the highest total.
                highestIndex = i;
            }
        }

        // Display the name with the highest total.
        System.out.println("\n----------------------------------------");
        System.out.println("NAME WITH THE HIGHEST TOTAL");
        System.out.println("----------------------------------------");
        System.out.println(names[highestIndex]);

        // Close the Scanner because we no longer need input.
        input.close();
    }
}
