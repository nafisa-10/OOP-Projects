
package com.mycompany.simplebankingproject;


public class CheckingAccount extends Account 
{
    private double bonusInterest;
    public CheckingAccount(String accountNumber, String accountHolder, double balance, double interestRate, double bonusInterest) {
        super(accountNumber, accountHolder, balance, interestRate);
        this.bonusInterest = bonusInterest;
        
    }
     
    // Applied Getter & Setter  methods 
    public double getBonusInterest() {
        return bonusInterest;
    }

    public void setBonusInterest(double bonusInterest) {
        this.bonusInterest = bonusInterest;
    }

    // Overridden method (polymorphism)
    @Override
    public double calculateInterest() {
        return getBalance() * ((getInterestRate() + getBonusInterest())/100);
    }

    
}
