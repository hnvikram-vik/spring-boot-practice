package org.example;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class AccountService {

    private BankAccount bankAccount;


    public AccountService(){
        this.bankAccount = new BankAccount();
    }

    public double getBalance(){
        return bankAccount.getBalance(); // method call
    }

    public void deposite(double amount){
        bankAccount.deposite(amount);
    }

    public boolean withdraw(double amount){
        return bankAccount.withdraw(amount);
    }
}
