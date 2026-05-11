
package com.mycompany.studentmanagementsystem;

public class SupplyStudent extends Student {
    
    private int SupplyFee;
    private int SupplyCourse;
    public SupplyStudent(String studentID, String name, int age, double grade, int SupplyFee, int SupplyCourse ) {
        super(studentID, name, age, grade);
        this.SupplyFee = SupplyFee;
        this.SupplyCourse = SupplyCourse;
        
    }

    public int getSupplyFee() {
        return SupplyFee;
    }

    public void setSupplyFee(int SupplyFee) {
        this.SupplyFee = SupplyFee;
    }

    public int getSupplyCourse() {
        return SupplyCourse;
    }

    public void setSupplyCourse(int SupplyCourse) {
        this.SupplyCourse = SupplyCourse;
    }

    @Override
    public double calculateTution() {
        return 15000.00 + (getSupplyFee() * getSupplyCourse());
    }
   
}
