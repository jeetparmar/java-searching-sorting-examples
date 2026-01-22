package com.sorting;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = ThreadLocalRandom.current().ints(10, 10, 100).toArray();
		System.out.println(Arrays.toString(arr));
		bubbleSort(arr);
		System.out.println(Arrays.toString(arr));
	}

	static void bubbleSort(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}

}
