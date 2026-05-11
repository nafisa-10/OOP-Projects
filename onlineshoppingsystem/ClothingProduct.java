
package com.mycompany.onlineshoppingsystem;


public class ClothingProduct extends Product {
    
    private String size;
    public ClothingProduct(String productId, String productName, double price, boolean quantityAvailable, String size) {
        super(productId, productName, price, quantityAvailable);
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public double shippingCost() {
        return 700.00;
    }

  
    
    
    
    
}
