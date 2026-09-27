package com.mycompany.prog6112toolkit.templates;

public class TemplateHighest {

    public static void main(String[] args) {

        // Store names in a 1D array.
        String[] names = {"A", "B", "C"};

        // Store the values that will be compared.
        int[] totals = {30, 75, 50};

        // Start with a value smaller than any normal total.
        int highest = -1;

        // Store the position of the highest value.
        int highestIndex = 0;

        // Check every total.
        for (int i = 0; i < totals.length; i++) {

            // If this total is larger than the current highest...
            if (totals[i] > highest) {

                // Store the new highest value.
                highest = totals[i];

                // Remember which name belongs to it.
                highestIndex = i;
            }
        }

        // Display the result.
        System.out.println("Highest: " + names[highestIndex]);
        System.out.println("Value: " + highest);
    }
}
