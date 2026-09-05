/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.university.lab.palindrome;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author waleeja
 */
public class palindromecheckTest {
    
    palindromecheck check=new palindromecheck();

    
   
    @Test
    public void testPalindromeTrue() {
        assertTrue(check.isPalindrome("madam"));
    }

    @Test
    public void testPalindromeCaseInsensitive() {
        assertTrue(check.isPalindrome("RaceCar"));
    }

    @Test
    public void testNotPalindrome() {
        assertFalse(check.isPalindrome("hello"));
    }

    @Test
    public void testNullOrEmptyString() {
        assertFalse(check.isPalindrome(null));
        assertFalse(check.isPalindrome(""));
    }
     

    @Test
    @DisplayName("Vowel count: normal sentence")
    public void testCountVowelsNormal() {
        assertEquals(2, check.countVowels("hello"));
    }

    @Test
    @DisplayName("Vowel count: no vowels present")
    public void testCountVowelsNone() {
        assertEquals(0, check.countVowels("xyz"));
    }

    @Test
    @DisplayName("Vowel count: null or empty input returns zero")
    public void testCountVowelsNullOrEmpty() {
        assertEquals(0, check.countVowels(null));
        assertEquals(0, check.countVowels(""));
    }

    @Test
    @DisplayName("Anagram: valid matching pair")
    public void testAnagramTrue() {
        assertTrue(check.isAnagram("listen", "silent"));
    }

    @Test
    @DisplayName("Anagram: case-insensitive check")
    public void testAnagramCaseInsensitive() {
        assertTrue(check.isAnagram("Listen", "Silent"));
    }

    @Test
    @DisplayName("Anagram: non-matching pair returns false")
    public void testAnagramFalse() {
        assertFalse(check.isAnagram("hello", "world"));
    }

    @Test
    @DisplayName("Anagram: null input returns false")
    public void testAnagramNullInput() {
        assertFalse(check.isAnagram(null, "test"));
    }
}
