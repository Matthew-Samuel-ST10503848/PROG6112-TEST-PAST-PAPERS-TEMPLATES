package com.mycompany.prog6112toolkit.oop;

/*
 * QUESTION 2 TEMPLATE - INTERFACE
 *
 * An interface lists methods that a class must provide.
 * During the exam, change the interface name and method names
 * to exactly match the question.
 */
public interface IDeliveryVehicleTemplate {

    // Getter for the type/category of the object.
    String getVehicleType();

    // Getter for the registration/ID number.
    String getRegistrationNumber();

    // Getter for the area/location.
    String getDeliveryArea();

    // Getter for the number/value being recorded.
    int getCompletedDeliveries();
}
