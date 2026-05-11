
package com.mycompany.onlineshoppingsystem;


public class BookProduct extends Product {
    
    private  String author;

    public BookProduct(String productId, String productName, double price, boolean quantityAvailable , String author) {
        super(productId, productName, price, quantityAvailable);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public double shippingCost() {
         return 400.00;
    }
    
    
    
    
}
