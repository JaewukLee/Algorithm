package com.soowuk.algorithm.sort;

public class SelectionSort {

	public static void sort(int[] arr) {
		int length = arr.length;
		for(int i=0; i<length-1; i++) {
			int minIdx = i;

			for(int j=i+1; j<length; j++) {
				if(arr[minIdx] > arr[j]) {
					minIdx = j;
				}
			}
			
			int tmp = arr[i];
			arr[i] = arr[minIdx];
			arr[minIdx] = tmp;
		}
		
	}
}
