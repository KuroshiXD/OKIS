package org.example;

public class StringManipulator {
    public String concatenate(String str1, String str2) {
        if (str1 == null || str2 == null) {
            throw new IllegalArgumentException("Input strings cannot be null");
        }
        return str1 + str2;
    }

    public int findLength(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Input string cannot be null");
        }
        return str.length();
    }

    public String convertToUpperCase(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Input string cannot be null");
        }
        return str.toUpperCase();
    }

    public String convertToLowerCase(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Input string cannot be null");
        }
        return str.toLowerCase();
    }
}
