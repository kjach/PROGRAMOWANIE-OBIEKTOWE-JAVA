package com.company;

public class Main {

    public static void main(String[] args) {
        SavingsAccount acc1 = new SavingsAccount(5000, 0.1);
    }
}

class BankAccount {
    double balance = 0;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public BankAccount() {
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }

    public void transfer(double amount, BankAccount other) {
        withdraw(amount);
        other.deposit(amount);
    }
}

class SavingsAccount extends BankAccount {
    double interestRate;

    public SavingsAccount(double balance, double interestRate) {
        super(balance);
        this. interestRate = interestRate;
    }

    public double calculateInterest() {
        return balance * interestRate;
    }

    @Override
    public String toString() {
        return "SavingsAccount{" +
                "balance=" + balance +
                ", interestRate=" + interestRate +
                '}';
    }
}