
package com.mycompany.studentmanagementsystem;

public class StudentManagementSystem {

    public static void main(String[] args) {
        
        RegularStudent r = new RegularStudent("242-115-029" , "Kishore" , 21, 3.91, 15000);
        RetakeStudent re = new RetakeStudent("242-115-083" , "Arian" , 21, 2.88, 2000);
        SupplyStudent s = new SupplyStudent("242-115-013","Shoumik" , 21, 1.88, 2000, 4);
        
        System.out.println("Regular student: " + r.getName() + "," + "Tution fee: " + r.calculateTution());
        System.out.println("Retake student: " + re.getName() + "," + "Tution fee: " + re.calculateTution());
        System.out.println("Supply student: " + s.getName() + "," + "Tution fee: " + s.calculateTution());
    }
    
}
