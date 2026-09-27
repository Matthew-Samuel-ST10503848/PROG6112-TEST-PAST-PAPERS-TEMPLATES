package com.mycompany.prog6112toolkit.oop;

/*
 * QUESTION 2 TEMPLATE - SUBCLASS
 *
 * This class extends the abstract parent class.
 * Change the class name and method name to match the exam question.
 */
public class CourierVehicleReportTemplate
        extends DeliveryVehicleTemplate {

    // Constructor receives the same information as the parent.
    public CourierVehicleReportTemplate(
            String vehicleType,
            String registrationNumber,
            String deliveryArea,
            int completedDeliveries) {

        // super(...) calls the constructor of the parent class.
        super(
                vehicleType,
                registrationNumber,
                deliveryArea,
                completedDeliveries
        );
    }

    // This method prints the object's information as a report.
    public void printVehicleReport() {

        // Print a heading.
        System.out.println("========================================");
        System.out.println("          VEHICLE REPORT");
        System.out.println("========================================");

        // Use getter methods inherited from the parent class.
        System.out.println("VEHICLE TYPE: " + getVehicleType());
        System.out.println("REGISTRATION NUMBER: " + getRegistrationNumber());
        System.out.println("DELIVERY AREA: " + getDeliveryArea());
        System.out.println("COMPLETED DELIVERIES: " + getCompletedDeliveries());

        // Print the bottom of the report.
        System.out.println("========================================");
    }
}
