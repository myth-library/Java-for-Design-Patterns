package com.codewithmyth;

public class Account {
    private double balance;

    public void deposit(float amount) {
        if (amount > 0)
            this.balance = this.balance + amount;
            // this.balance += amount;
    }

    public void withdraw(float amount) {
        if (amount > 0)
            this.balance -= amount;
    }

    public void setBalance(float balance) {
        if (balance > 0)
            this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
}
