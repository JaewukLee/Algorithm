package com.soowuk.algorithm.sort;

public class BubbleSort {

	/**
	 * loop마다 가장 큰 수가 제일 뒤쪽부터 차례대로 위치 -> 큰/작은 값이 loop마다 떠오름
	 * @param inputArray
	 */
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
