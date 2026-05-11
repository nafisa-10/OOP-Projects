
package com.mycompany.simplebankingproject;


public class Account {
    
     // Encapsulated data (protected for inheritance use)
    private String accountNumber, accountHolder; 
    private double balance,interestRate;

    // Constructor to initialize account details
    public Account(String accountNumber, String accountHolder, double balance, double interestRate) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
        this.interestRate = interestRate;
    }

    // Applied Getter & Setter methods 
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
    
    // Method to calculate interest (will be overridden)
    public double calculateInterest()
    {
        return balance * (getInterestRate()/100);
  
    }
}
