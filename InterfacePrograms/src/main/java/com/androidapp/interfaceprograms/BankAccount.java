package com.androidapp.interfaceprograms;

public class BankAccount {
    private double balance;
    private int accountNumber;
    private static int lastAssignedNumber=1000;

//    public BankAccount(double balance) {
//        this.balance = balance;
//        lastAssignedNumber++;
//        accountNumber=lastAssignedNumber;
//    }

    public BankAccount() {
        lastAssignedNumber++;
        accountNumber=lastAssignedNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
}
