
package com.mycompany.vehiclerentalsystem;


public class Vehicle {
   private String vehicleId , brand ,model;
   double rentalRate;
   private boolean isAvailable;

    public Vehicle(String vehicleId, String brand, String model, boolean isAvailable, double rentalRate) {
        this.vehicleId = vehicleId;
        this.brand = brand;
        this.model = model;
        this.isAvailable = isAvailable;
        this.rentalRate = rentalRate;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public boolean getIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }
    
    public double getRentalRate() {
        return rentalRate;
    }

    public void setRentalRate(double rentalRate) {
        this.rentalRate = rentalRate;
    }

   public double  calculateRentalCost(int days)
   {
       return rentalRate * days;
   }
   
}
