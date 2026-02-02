package com.sorting;

public class BucketSort {
    public static void main(String[] args) {
        int[] arr = { 29, 25, 3, 49, 9, 37, 21, 43 };
        bucketSort(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void bucketSort(int[] arr) {
        int n = arr.length;
        if (n <= 0)
            return;

        // Create n empty buckets
        @SuppressWarnings("unchecked")
        java.util.List<Integer>[] buckets = new java.util.List[n];
        for (int i = 0; i < n; i++) {
            buckets[i] = new java.util.ArrayList<>();
        }

        // Put array elements in different buckets
        for (int num : arr) {
            int bucketIndex = num * n / (getMax(arr) + 1);
            buckets[bucketIndex].add(num);
        }

        // Sort individual buckets and concatenate
        int index = 0;
        for (java.util.List<Integer> bucket : buckets) {
            java.util.Collections.sort(bucket);
            for (int num : bucket) {
                arr[index++] = num;
            }
        }
    }

    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
}
