package com.soowuk.algorithm.sort;

public class QuickSort {

	public static void sort(int[] arr) {
		int length = arr.length;
		if(length <= 1) return;
		
		sort(arr, 0, length-1);
	}
	
	private static void sort(int[] arr, int left, int right) {
		if(left < right) {
			int pivotIdx = partition(arr, left, right);
			
			sort(arr, left, pivotIdx - 1);
			sort(arr, pivotIdx + 1, right);
		}
	}
	
	private static int partition(int[] arr, int left, int right) {
		int pivot = arr[right];
		int i = (left - 1);
		
		for(int j = left; j < right; j++) {
			if(arr[j] <= pivot) {
				i++;
				
				int tmp = arr[i];
				arr[i] = arr[j];
				arr[j] = tmp;
			}
		}
		
		int tmp = arr[i+1];
		arr[i+1] = arr[right];
		arr[right] = tmp;
		
		return i + 1;
	}
}
