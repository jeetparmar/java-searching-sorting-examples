package com.sorting;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class MergeSort {

	public static void main(String[] args) {
		int[] arr = ThreadLocalRandom.current().ints(10, 10, 100).toArray();
		System.out.println(Arrays.toString(arr));
		mergeSort(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(arr));
	}

	static void mergeSort(int[] arr, int l, int r) {
		if (l < r) {
			int m = (l + r) / 2;
			mergeSort(arr, l, m);
			mergeSort(arr, m + 1, r);
			merge(arr, l, m, r);
		}
	}

	static void merge(int[] arr, int l, int m, int r) {
		int[] left = Arrays.copyOfRange(arr, l, m + 1);
		int[] right = Arrays.copyOfRange(arr, m + 1, r + 1);

		int i = 0, j = 0, k = l;
		while (i < left.length && j < right.length) {
			arr[k++] = (left[i] <= right[j]) ? left[i++] : right[j++];
		}
		while (i < left.length)
			arr[k++] = left[i++];
		while (j < right.length)
			arr[k++] = right[j++];
	}

}
