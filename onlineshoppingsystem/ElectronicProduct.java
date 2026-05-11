
package com.mycompany.onlineshoppingsystem;


public class ElectronicProduct extends Product {
    
    private int Warranty;

    public ElectronicProduct(String productId, String productName, double price, boolean quantityAvailable, int Warranty) {
        super(productId, productName, price, quantityAvailable);
        this.Warranty = Warranty;
    }

    public int getWarranty() {
        return Warranty;
    }

    public void setWarranty(int Warranty) {
        this.Warranty = Warranty;
    }

    @Override
    public double shippingCost() {
        return 2000.00;
    }
    
    
    
    
    
    
    
}
