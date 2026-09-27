package com.mycompany.prog6112toolkit.templates;

public class TemplateTotals {

    public static void main(String[] args) {

        // Each row contains two values.
        int[][] values = {
            {10, 20},
            {30, 40},
            {50, 60}
        };

        // Loop through every row.
        for (int i = 0; i < values.length; i++) {

            // Add column 0 and column 1 for the current row.
            int total = values[i][0] + values[i][1];

            // Display the result.
            System.out.println("Total: " + total);
        }
    }
}
