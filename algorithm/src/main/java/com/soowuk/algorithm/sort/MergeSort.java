package com.soowuk.algorithm.sort;

public class MergeSort {

	public static void sort(int[] arr) {
		sort(arr, 0, arr.length - 1);
	}
	
	private static void sort(int[] arr, int left, int right) {
		if(left < right) {
			int mid = (left + right) / 2;
			sort(arr, left, mid);
			sort(arr, mid+1, right);
			merge(arr, left, mid, right);
		}
	}
	
	private static void merge(int[] arr, int left, int mid, int right) {
		int leftIdx = left;
		int rightIdx = mid + 1;
		int tmpIdx = left;
		int[] tmp = new int[right + 1];
		while(leftIdx <= mid && rightIdx <= right) {
			if(arr[leftIdx] < arr[rightIdx]) {
				tmp[tmpIdx++] = arr[leftIdx++];
			} else {
				tmp[tmpIdx++] = arr[rightIdx++];
			}
		}
		
		while(leftIdx <= mid) {
			tmp[tmpIdx++] = arr[leftIdx++];
		}
		
		while(rightIdx <= right) {
			tmp[tmpIdx++] = arr[rightIdx++];
		}
		
		for(int i=left; i<=right; i++) {
			arr[i] = tmp[i];
		}
	}
}
