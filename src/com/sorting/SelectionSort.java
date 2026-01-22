package com.sorting;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr = ThreadLocalRandom.current().ints(10, 10, 100).toArray();
		System.out.println(Arrays.toString(arr));
		selectionSort(arr);
		System.out.println(Arrays.toString(arr));
	}

	static void selectionSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			int min = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[min])
					min = j;
			}
			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
		}
	}

}
