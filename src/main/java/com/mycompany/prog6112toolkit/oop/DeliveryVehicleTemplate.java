package com.mycompany.prog6112toolkit.oop;

/*
 * QUESTION 2 TEMPLATE - ABSTRACT CLASS
 *
 * This class implements the interface and stores the common data.
 * It is abstract because the exam pattern asks for an abstract
 * parent class that is extended by another class.
 */
public abstract class DeliveryVehicleTemplate
        implements IDeliveryVehicleTemplate {

    // Private variables store the object's data.
    private String vehicleType;
    private String registrationNumber;
    private String deliveryArea;
    private int completedDeliveries;

    // Constructor receives values and stores them in the variables.
    public DeliveryVehicleTemplate(
            String vehicleType,
            String registrationNumber,
            String deliveryArea,
            int completedDeliveries) {

        // "this" means the variable belonging to this object.
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
        this.deliveryArea = deliveryArea;
        this.completedDeliveries = completedDeliveries;
    }

    // Getter returns the vehicle type.
    @Override
    public String getVehicleType() {
        return vehicleType;
    }

    // Getter returns the registration number.
    @Override
    public String getRegistrationNumber() {
        return registrationNumber;
    }

    // Getter returns the delivery area.
    @Override
    public String getDeliveryArea() {
        return deliveryArea;
    }

    // Getter returns the completed-deliveries value.
    @Override
    public int getCompletedDeliveries() {
        return completedDeliveries;
    }
}
