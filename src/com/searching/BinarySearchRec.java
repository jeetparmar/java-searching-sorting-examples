package com.searching;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class BinarySearchRec {

	public static void main(String[] args) {
		int[] arr = ThreadLocalRandom.current().ints(10, 10, 100).toArray();
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		int key = 56;
		int result = binarySearchRec(arr, 0, arr.length - 1, key);
		if (result != -1)
			System.out.println("Element found at index: " + result);
		else
			System.out.println("Element not found");
	}

	static int binarySearchRec(int[] arr, int low, int high, int key) {
		if (low > high)
			return -1;
		int mid = (low + high) / 2;
		if (arr[mid] == key)
			return mid;
		if (arr[mid] > key)
			return binarySearchRec(arr, low, mid - 1, key);
		return binarySearchRec(arr, mid + 1, high, key);
	}

}
