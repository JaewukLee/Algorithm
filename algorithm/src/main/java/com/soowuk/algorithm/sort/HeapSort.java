package com.soowuk.algorithm.sort;

public class HeapSort {
	
	public void sort(int[] arr) {
		int length = arr.length;
		
		for(int i = (length/2)-1; i >= 0; i--) {
			heapify(arr, length, i);
		}
		
		for(int j = length - 1; j > 0; j--) {
			swap(arr, 0, j);
			heapify(arr, j, 0);
		}
	}
	
	private void heapify(int[] arr, int length, int i) {
		
		int leftChild = i * 2 + 1;
		int rightChild = i * 2 + 2;
		int largest = i;
		
		if(leftChild < length && arr[leftChild] > arr[i]) {
			largest = leftChild;
		}
		
		if(rightChild < length && arr[rightChild] > arr[largest]) {
			largest = rightChild;
		}
		
		if(largest != i) {
			swap(arr, largest, i);
			heapify(arr, length, largest);
		}
	}
	
	private void swap(int[] arr, int i, int j) {
		int tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}
}
