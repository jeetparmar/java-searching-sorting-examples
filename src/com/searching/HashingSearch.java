package com.searching;

import java.util.HashMap;
import java.util.Map;

public class HashingSearch {
    public static void main(String[] args) {
        int[] arr = { 5, 3, 8, 6, 2, 7, 4, 1 };
        int target = 6;
        int result = hashingSearch(arr, target);
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }
    }

    public static int hashingSearch(int[] arr, int target) {
        // Create a hash table to store the elements and their indices
        Map<Integer, Integer> hashTable = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            hashTable.put(arr[i], i);
        }

        // Search for the target in the hash table
        if (hashTable.containsKey(target)) {
            return hashTable.get(target);
        } else {
            return -1; // Target not found
        }
    }
}
