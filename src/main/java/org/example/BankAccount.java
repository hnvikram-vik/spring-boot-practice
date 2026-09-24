package org.example;

public class BankAccount {

    private double balance;

    public BankAccount(){
        this.balance = 10000;
    }

    public double getBalance(){
        return balance;
    }

    public void deposite(double amount){
        balance += amount;
    }

    public boolean withdraw(double amount){
        if(amount > balance){
            return false;
        }

        balance -= amount;

        return false;
    }
}
