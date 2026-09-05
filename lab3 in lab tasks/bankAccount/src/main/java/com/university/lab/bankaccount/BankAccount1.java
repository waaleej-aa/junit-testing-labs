/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.university.lab.bankaccount;

/**
 *
 * @author waleeja
 */
public class BankAccount1 {
    private double balance;
    private boolean active =true;
    public void deposit(double amt) {
        if (amt < 0) {
            throw new IllegalArgumentException();
        }
        balance += amt;
    }

    public void withdraw(double amt) {
        if (amt > balance) {
            throw new IllegalStateException();
        }
        balance -= amt;
        if (balance < 100) {
            active = false;
        }
    }

   public double getBalance() {
        return balance;
    }

    public boolean isActive() {
        return active;
    }

}
