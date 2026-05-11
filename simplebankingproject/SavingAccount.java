
package com.mycompany.simplebankingproject;
public class SavingAccount extends Account {
    
    private double minimumBalance ;
    public SavingAccount(String accountNumber, String accountHolder, double balance, double interestRate, double minimumBalance) {
        super(accountNumber, accountHolder, balance, interestRate);
        this.minimumBalance = minimumBalance;
    }

    public double getMinimumBalance() {
        return minimumBalance;
    }

    public void setMinimumBalance(double minimumBalance) {
        this.minimumBalance = minimumBalance;
    }
    
    // Overridden method (polymorphism)
    @Override
    public double calculateInterest() {
        if(getBalance() >= minimumBalance)
        {
            return getBalance() * (getInterestRate()/100);
        }
        else{
                return 0;   
        }

      }
    }
