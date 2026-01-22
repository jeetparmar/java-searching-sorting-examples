package com.searching;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class LinearSearch {

	public static void main(String[] args) {
		int[] arr = ThreadLocalRandom.current().ints(10, 10, 100).toArray();
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		int key = 56;
		int result = linearSearch(arr, key);
		if (result != -1)
			System.out.println("Element found at index: " + result);
		else
			System.out.println("Element not found");
	}

	static int linearSearch(int[] arr, int key) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key)
				return i;
		}
		return -1;
	}

}
