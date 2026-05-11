
package com.mycompany.vehiclerentalsystem;


public class Truck extends Vehicle {
 private boolean payloadCapacity;

    public Truck(boolean payloadCapacity, String vehicleId, String brand, String model, boolean isAvailable, double rentalRate) {
        super(vehicleId, brand, model, isAvailable, rentalRate);
        this.payloadCapacity = payloadCapacity;
    }

    public boolean isPayloadCapacity() {
        return payloadCapacity;
    }

    public void setPayloadCapacity(boolean payloadCapacity) {
        this.payloadCapacity = payloadCapacity;
    }

    @Override
    public double calculateRentalCost(int days) {
        return super.calculateRentalCost(days); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    
    

   
    
 
}
