/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.university.lab.bankaccount;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;

/**
 *
 * @author waleeja
 */
public class BankAccount1Test {

    BankAccount1 account;

    @BeforeEach
    public void setUp() {
        account = new BankAccount1();
    }

    @Test
    public void testDepositPositive() {
        account.deposit(100.0);
        assertEquals(100.0, account.getBalance(), 0.01);
    }

    @Test
    public void testWithdrawValid() {
        account.deposit(100.0);
        account.withdraw(40.0);
        assertEquals(60.0, account.getBalance(), 0.01);
    }

    @Test
    public void testWithdrawBeyondBalance() {
        account.deposit(50.0);
        assertThrows(IllegalStateException.class, () -> {
            account.withdraw(100.0);
        });
    }

    @Test
    public void testDepositNegative() {
        assertThrows(IllegalArgumentException.class, () -> {
            account.deposit(-10.0);
        });
    }
    @Test
    public void testAccountBecomesInactiveBelowThreshold() {
        account.deposit(150.0);
        account.withdraw(60.0);          
        assertFalse(account.isActive());
    }

    @Test
    public void testAccountStaysActiveAboveThreshold() {
        account.deposit(500.0);
        account.withdraw(100.0);         
        assertTrue(account.isActive());
    }

}
