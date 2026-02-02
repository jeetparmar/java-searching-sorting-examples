package com.searching;

public class InterpolationSearch {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
        int target = 70;
        int result = interpolationSearch(arr, target);
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }
    }

    public static int interpolationSearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high && target >= arr[low] && target <= arr[high]) {
            if (low == high) {
                if (arr[low] == target) {
                    return low;
                }
                return -1;
            }

            // Probing the position with keeping uniform distribution in mind.
            int pos = low + ((target - arr[low]) * (high - low)) / (arr[high] - arr[low]);

            // Condition of target found
            if (arr[pos] == target) {
                return pos;
            }

            // If target is larger, target is in upper part
            if (arr[pos] < target) {
                low = pos + 1;
            }
            // If target is smaller, target is in lower part
            else {
                high = pos - 1;
            }
        }
        return -1; // Target not found
    }
}
