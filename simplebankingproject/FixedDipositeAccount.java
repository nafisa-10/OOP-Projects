
package com.mycompany.simplebankingproject;


public class FixedDipositeAccount extends Account {
    private double FDinterest;

    public FixedDipositeAccount( String accountNumber, String accountHolder, double balance, double interestRate, double FDinterest) {
        super(accountNumber, accountHolder, balance, interestRate);
        this.FDinterest = FDinterest;
    }

    public double getFDinterest() {
        return FDinterest;
    }

    public void setFDinterest(double FDinterest) {
        this.FDinterest = FDinterest;
    }
    
    // Overridden method to include fixed deposit interest
    @Override
    public double calculateInterest() {
        return getBalance() * ((getInterestRate() + getFDinterest())/100);
    }
    
    
    
    
    
}
