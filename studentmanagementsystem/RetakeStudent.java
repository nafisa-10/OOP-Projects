
package com.mycompany.studentmanagementsystem;


public class RetakeStudent extends Student{
    private int retakeFee;
    

    public RetakeStudent(String studentID, String name, int age, double grade,int retakeFee) {
        super(studentID, name, age, grade);
        this.retakeFee = retakeFee;
    }

    public int getRetakeFee() {
        return retakeFee;
    }

    public void setRetakeFee(int retakeFee) {
        this.retakeFee = retakeFee;
    }

    

    @Override
    public double calculateTution() {
        return 15000.00 + getRetakeFee();
    }

   
    
    
}
