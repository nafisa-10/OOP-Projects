
package com.mycompany.onlineshoppingsystem;


public class Product {
    
    private String productId , productName;
    private double price;
    private boolean quantityAvailable;

    public Product(String productId, String productName, double price, boolean quantityAvailable) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.quantityAvailable = quantityAvailable;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isQuantityAvailable() {
        return quantityAvailable;
    }

    public void setQuantityAvailable(boolean quantityAvailable) {
        this.quantityAvailable = quantityAvailable;
    }
    
    
    public double shippingCost()
    {
        return 800.0;
    }
    
}
