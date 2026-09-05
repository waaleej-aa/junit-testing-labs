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
public class shoppingcart1Test {

    shoppingcart1 cart = new shoppingcart1();

    @Test
    public void testAddItems() {
        cart.addItem("Apple");
        cart.addItem("Bread");
        cart.addItem("Milk");
        assertEquals(3, cart.getItemCount());
    }

    @Test
    public void testRemoveItem() {
        cart.addItem("Apple");
        cart.addItem("Bread");
        cart.addItem("Milk");
        cart.removeItem("Bread");
        assertEquals(2, cart.getItemCount());
    }

    @Test
    public void testClearCart() {
        cart.addItem("Apple");
        cart.addItem("Bread");
        cart.clear();
        assertEquals(0, cart.getItemCount());
    }

    @Test
    public void testRemoveNonExistentItem() {
        cart.addItem("Apple");
        assertDoesNotThrow(() -> {
            cart.removeItem("Banana");
        });
        assertEquals(1, cart.getItemCount());
    }

}