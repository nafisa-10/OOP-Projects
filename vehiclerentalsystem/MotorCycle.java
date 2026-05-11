
package com.mycompany.vehiclerentalsystem;


public class MotorCycle extends Vehicle {
    private boolean hasHelmet;

    public MotorCycle(boolean hasHelmet, String vehicleId, String brand, String model, boolean isAvailable, double rentalRate) {
        super(vehicleId, brand, model, isAvailable, rentalRate);
        this.hasHelmet = hasHelmet;
    }

    public boolean isHasHelmet() {
        return hasHelmet;
    }

    public void setHasHelmet(boolean hasHelmet) {
        this.hasHelmet = hasHelmet;
    }

    @Override
    public double calculateRentalCost(int days) {
        return rentalRate * days; 
    }
    
    
    
}
