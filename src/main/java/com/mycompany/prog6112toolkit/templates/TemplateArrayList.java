package com.mycompany.prog6112toolkit.templates;

import java.util.ArrayList;

public class TemplateArrayList {

    public static void main(String[] args) {

        // Create an ArrayList that stores String values.
        ArrayList<String> names = new ArrayList<>();

        // Add values to the ArrayList.
        names.add("A");
        names.add("B");
        names.add("C");

        // Loop through the ArrayList.
        for (int i = 0; i < names.size(); i++) {

            // get(i) returns the value at position i.
            System.out.println(names.get(i));
        }

        // Remove the value at index 1 if required.
        // names.remove(1);
    }
}
