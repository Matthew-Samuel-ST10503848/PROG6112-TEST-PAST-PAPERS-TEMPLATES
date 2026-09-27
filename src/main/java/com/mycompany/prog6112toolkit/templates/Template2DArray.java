package com.mycompany.prog6112toolkit.templates;

public class Template2DArray {

    public static void main(String[] args) {

        // A 2D array can be viewed as rows and columns.
        int[][] values = {
            {10, 20},
            {30, 40},
            {50, 60}
        };

        // Outer loop moves through the rows.
        for (int i = 0; i < values.length; i++) {

            // Inner loop moves through the columns in the current row.
            for (int j = 0; j < values[i].length; j++) {

                // Print the current value.
                System.out.print(values[i][j] + "\t");
            }

            // Move to the next output line after each row.
            System.out.println();
        }
    }
}
