package com.mycompany.prog6112toolkit.templates;

public class TemplateFormattedReport {

    public static void main(String[] args) {

        // Example values that would normally come from input/arrays.
        String name = "Cape Town";
        int first = 245;
        int second = 380;
        int total = first + second;

        // Print a simple formatted report.
        System.out.println("========================================");
        System.out.println("          PERFORMANCE REPORT");
        System.out.println("========================================");
        System.out.println("NAME: " + name);
        System.out.println("FIRST VALUE: " + first);
        System.out.println("SECOND VALUE: " + second);
        System.out.println("TOTAL: " + total);
        System.out.println("========================================");
    }
}
