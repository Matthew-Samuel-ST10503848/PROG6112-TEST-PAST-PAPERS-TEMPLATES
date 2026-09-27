package com.mycompany.prog6112toolkit.templates;

public class TemplateAverage {

    public static void main(String[] args) {

        // Store several numbers.
        int[] values = {10, 20, 30};

        // Start the total at zero.
        int total = 0;

        // Add every value to total.
        for (int i = 0; i < values.length; i++) {
            total += values[i];
        }

        // Divide the total by the number of values.
        double average = (double) total / values.length;

        // Display the average.
        System.out.println("Average: " + average);
    }
}
