
package com.mycompany.studentmanagementsystem;


public class RegularStudent extends Student {
    
    private int SemesterFee;
    public RegularStudent(String studentID, String name, int age, double grade, int SemesterFee) {
        super(studentID, name, age, grade);
        this.SemesterFee = SemesterFee;
    }

    public int getSemesterFee() {
        return SemesterFee;
    }

    public void setSemesterFee(int SemesterFee) {
        this.SemesterFee = SemesterFee;
    }

    @Override
    public double calculateTution() {
        return 00.0 + getSemesterFee();
    }
    
    
    
}