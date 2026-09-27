package com.mycompany.prog6112toolkit.templates;

public class Template1DArray {

    public static void main(String[] args) {

        // A 1D array stores a list of values in one row.
        String[] names = {"Cape Town", "Johannesburg", "Durban"};

        // Loop through every position in the array.
        for (int i = 0; i < names.length; i++) {

            // Print the value stored at position i.
            System.out.println(names[i]);
        }
    }
}
