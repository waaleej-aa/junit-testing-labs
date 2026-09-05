/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.university.lab.palindrome;

/**
 *
 * @author waleeja
 */
public class palindromecheck {

    public boolean isPalindrome(String s) {
        if (s == null) {
            return false;
        }
        String clean = s.replaceAll("[^A-Za-z]", "").toLowerCase();
        if (clean.isEmpty()) {
            return false;
        }
        return new StringBuilder(clean).reverse().toString().equals(clean);
    }

    public int countVowels(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }
        String vowelsOnly = s.replaceAll("[^AEIOUaeiou]", "");
        return vowelsOnly.length();
    }

    public boolean isAnagram(String s1, String s2) {
        if (s1 == null || s2 == null) {
            return false;
        }
        String clean1 = s1.replaceAll("[^A-Za-z]", "").toLowerCase();
        String clean2 = s2.replaceAll("[^A-Za-z]", "").toLowerCase();

        char[] arr1 = clean1.toCharArray();
        char[] arr2 = clean2.toCharArray();
        java.util.Arrays.sort(arr1);
        java.util.Arrays.sort(arr2);

        return java.util.Arrays.equals(arr1, arr2);
    }
}
