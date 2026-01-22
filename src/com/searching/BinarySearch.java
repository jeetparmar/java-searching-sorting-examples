package com.searching;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class BinarySearch {

	public static void main(String[] args) {
		int[] arr = ThreadLocalRandom.current().ints(10, 10, 100).toArray();
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		int key = 56;
		int result = binarySearch(arr, key);
		if (result != -1)
			System.out.println("Element found at index: " + result);
		else
			System.out.println("Element not found");
	}

	static int binarySearch(int[] arr, int key) {
		int low = 0, high = arr.length - 1;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (arr[mid] == key)
				return mid;
			if (arr[mid] < key)
				low = mid + 1;
			else
				high = mid - 1;
		}
		return -1;
	}

}
