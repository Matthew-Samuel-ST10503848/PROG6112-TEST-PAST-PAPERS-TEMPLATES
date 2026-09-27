package com.mycompany.prog6112toolkit.templates;

import java.util.Scanner;

public class TemplateScanner {

    public static void main(String[] args) {

        // Create a Scanner so the program can receive keyboard input.
        Scanner input = new Scanner(System.in);

        // Read a String from the user.
        System.out.print("Enter your name: ");
        String name = input.nextLine();

        // Read an integer from the user.
        System.out.print("Enter your age: ");
        int age = input.nextInt();

        // Display the values that were entered.
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);

        // Close the Scanner when input is finished.
        input.close();
    }
}
