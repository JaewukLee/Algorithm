package com.soowuk.algorithm.sort;

public class SelectionSort {

	/**
	 * 매 loop마다 가장 작은 수를 찾아서 가장 앞에 위치
	 * @param arr
	 */
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
