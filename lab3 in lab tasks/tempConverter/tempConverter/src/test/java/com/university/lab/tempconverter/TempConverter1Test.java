/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.university.lab.tempconverter;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author waleeja
 */
public class TempConverter1Test {
    
    public TempConverter1Test() {
    }
    
        TempConverter1 converter = new TempConverter1();

    @Test
    public void testCelsiusToFahrenheit() {
        assertEquals(32.0, converter.celsiusToFahrenheit(0.0), 0.01);
        assertEquals(212.0, converter.celsiusToFahrenheit(100.0), 0.01);
    }

    @Test
    public void testFahrenheitToCelsius() {
        assertEquals(0.0, converter.fahrenheitToCelsius(32.0), 0.01);
        assertEquals(100.0, converter.fahrenheitToCelsius(212.0), 0.01);
    }

    
    @Test
    public void testRoundTrip() {
        double original = 37.0;
        double converted = converter.fahrenheitToCelsius(converter.celsiusToFahrenheit(original));
        assertEquals(original, converted, 0.01);
    }

}
