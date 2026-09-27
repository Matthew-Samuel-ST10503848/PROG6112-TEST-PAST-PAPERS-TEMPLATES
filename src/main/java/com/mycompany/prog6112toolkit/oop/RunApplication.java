package com.mycompany.prog6112toolkit.oop;

/*
 * QUESTION 2 TEMPLATE - MAIN CLASS
 *
 * This is where the program starts.
 * The main method creates an object from the subclass
 * and calls the report method.
 */
public class RunApplication {

    public static void main(String[] args) {

        // Create an object using the subclass constructor.
        // Change these sample values to the values in the question.
        CourierVehicleReportTemplate report =
                new CourierVehicleReportTemplate(
                        "Electric Scooter",
                        "QB-458",
                        "Cape Town CBD",
                        185
                );

        // Call the method that prints the report.
        report.printVehicleReport();
    }
}
