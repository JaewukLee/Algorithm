package com.soowuk.algorithm;

import com.soowuk.algorithm.sort.BubbleSort;
import com.soowuk.algorithm.sort.InsertionSort;
import com.soowuk.algorithm.sort.QuickSort;
import com.soowuk.algorithm.sort.SelectionSort;

public class AlgorithmApplicationTests {

	public static void main(String[] args) {
		int[] sortTest01 = {55, 07, 78, 12, 42};
//		BubbleSort.sort(sortTest01);
//		SelectionSort.sort(sortTest01);
//		InsertionSort.sort(sortTest01);
		QuickSort.sort(sortTest01);
		
		for(int i=0; i<sortTest01.length; i++) {
			System.out.println(sortTest01[i]);
		}
	}

}
