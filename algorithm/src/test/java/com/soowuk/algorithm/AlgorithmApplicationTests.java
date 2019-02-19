package com.soowuk.algorithm;

import com.soowuk.algorithm.sort.HeapSort;

public class AlgorithmApplicationTests {

	public static void main(String[] args) {
		int[] sortTest01 = {5,2,4,7,1,3,2,6};
//		BubbleSort.sort(sortTest01);
//		SelectionSort.sort(sortTest01);
//		InsertionSort.sort(sortTest01);
//		QuickSort.sort(sortTest01);
//		MergeSort.sort(sortTest01);
		HeapSort heapSort = new HeapSort();
		heapSort.sort(sortTest01);
		
		for(int i=0; i<sortTest01.length; i++) {
			System.out.println(sortTest01[i]);
		}
	}

}
