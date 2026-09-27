package com.mycompany.prog6112toolkit.templates;

public class TemplateLowest {

    public static void main(String[] args) {

        // Values to compare.
        int[] values = {30, 75, 50};

        // Start with the first array value.
        int lowest = values[0];

        // Check the remaining values.
        for (int i = 1; i < values.length; i++) {

            // If the current value is smaller...
            if (values[i] < lowest) {

                // Store it as the new lowest value.
                lowest = values[i];
            }
        }

        // Display the lowest value.
        System.out.println("Lowest: " + lowest);
    }
}
