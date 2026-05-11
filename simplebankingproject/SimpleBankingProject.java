
package com.mycompany.simplebankingproject;


public class SimpleBankingProject {

    public static void main(String[] args) {
     SavingAccount s = new SavingAccount("102414" , "Neha" , 200000.00,1.20,50000);
     CheckingAccount c = new CheckingAccount("102414" , "Neha" , 200000.00,1.20,3);
     FixedDipositeAccount f = new FixedDipositeAccount("102414" , "Neha" , 200000.00,1.20,2);
     
        System.out.println("Account HolderName: " + s.getAccountHolder() + "," + " Holder total balance: " + s.getBalance() + "," 
               + " Minimum balance: " + s.getMinimumBalance() + "," + " Calculate Interest: " + s.calculateInterest() );
        System.out.println("Bonus interest: " + c.calculateInterest());
        System.out.println("Fixed diposite interest: " + f.calculateInterest());
        
    }   
}
