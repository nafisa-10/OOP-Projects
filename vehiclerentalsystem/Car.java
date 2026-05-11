
package com.mycompany.vehiclerentalsystem;


public class Car extends Vehicle {
    private int numofDoors ;

    public Car(int numofDoors, String vehicleId, String brand, String model, boolean isAvailable, double rentalRate) {
        super(vehicleId, brand, model, isAvailable, rentalRate);
        this.numofDoors = numofDoors;
    }

    public int getNumofDoors() {
        return numofDoors;
    }

    public void setNumofDoors(int numofDoors) {
        this.numofDoors = numofDoors;
    }

    @Override
    public double calculateRentalCost(int days) {
        return rentalRate * days + 69 ;
    }

   
    
    
    
    
    
    
    
}
