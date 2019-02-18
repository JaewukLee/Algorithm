package com.soowuk.algorithm.sort;

public class InsertionSort {

	public static void sort(int[] arr) {
		int length = arr.length;
		for(int i=1; i<length; i++) {
			for(int j=0; j<i; j++) {
				if(arr[i] < arr[j]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
	}
}
