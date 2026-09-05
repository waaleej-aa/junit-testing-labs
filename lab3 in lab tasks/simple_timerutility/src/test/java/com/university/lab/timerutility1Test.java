/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.university.lab;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author waleeja
 */
public class timerutility1Test {

    timerutility1 timer = new timerutility1();

    @Test
    public void normalcase() {
        assertEquals(15, timer.secondsBetween(10, 25));
    }

    @Test
    public void boundarycase() {
        assertEquals(0, timer.secondsBetween(0, 0));
    }

    @Test
    public void invalidinput() {
        assertThrows(IllegalArgumentException.class, () -> {
            timer.secondsBetween(20, 5);
        });
    }

}
