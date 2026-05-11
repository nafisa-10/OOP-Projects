
package com.mycompany.onlineshoppingsystem;


public class OnlineShoppingSystem {

    public static void main(String[] args) {
        
        ElectronicProduct e = new ElectronicProduct("102414" , "Oven" , 11000, true , 5);
        ClothingProduct c = new ClothingProduct("1865789" , " Maria B" , 9590, true, "40");
        BookProduct b = new BookProduct("228997" , "Titanic" , 1200 , true, "Jani na");
     
        
        System.out.println("Product name:" + e.getProductName() + "," + "Product price: " + e.getPrice());
        System.out.println("Product name:" + c.getProductName() + "," + "Product price: " + c.getPrice());
        System.out.println("Product name:" + b.getProductName() + "," + "Product price: " + b.getPrice());

        System.out.println("Oven Warranty: " + e.getWarranty() + "," + "Oven shipping cost: " +  e.shippingCost());
        System.out.println("Maria B Size: " + c.getSize() + "," + "Maria B shipping cost: " +  c.shippingCost());
        System.out.println("Titanic Author name: " + b.getAuthor() + "," + "Titanic shipping cost: " +  b.shippingCost());

        
        
        
    }
}
