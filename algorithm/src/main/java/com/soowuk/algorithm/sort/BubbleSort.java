package com.soowuk.algorithm.sort;

public class BubbleSort {

	public static void sort(int[] arr) {
		int size = arr.length;
		for(int i=0; i < size; i++) {
			for(int j=1; j < size - i; j++) {
				if(arr[j-1] > arr[j]) {
					int tmp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = tmp;
				}
			}
		}
	}
}
