package com.searching;

public class BoyerMooreSearch {
    public static void main(String[] args) {
        String text = "ababcababcabc";
        String pattern = "abc";
        int result = boyerMooreSearch(text, pattern);
        if (result != -1) {
            System.out.println("Pattern found at index: " + result);
        } else {
            System.out.println("Pattern not found in the text.");
        }
    }

    public static int boyerMooreSearch(String text, String pattern) {
        int[] badChar = buildBadCharTable(pattern);
        int m = pattern.length();
        int n = text.length();
        int s = 0; // s is shift of the pattern with respect to text

        while (s <= (n - m)) {
            int j = m - 1;

            while (j >= 0 && pattern.charAt(j) == text.charAt(s + j)) {
                j--;
            }

            if (j < 0) {
                return s; // Pattern found at index s
            } else {
                s += Math.max(1, j - badChar[text.charAt(s + j)]);
            }
        }
        return -1; // Pattern not found
    }

    public static int[] buildBadCharTable(String pattern) {
        final int ALPHABET_SIZE = 256;
        int[] badChar = new int[ALPHABET_SIZE];

        for (int i = 0; i < ALPHABET_SIZE; i++) {
            badChar[i] = -1; // Initialize all occurrences as -1
        }

        for (int i = 0; i < pattern.length(); i++) {
            badChar[pattern.charAt(i)] = i; // Store the last occurrence of each character
        }

        return badChar;
    }
}
