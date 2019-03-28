package com.soowuk.algorithm.codility.sorting;

import java.util.Arrays;

public class Triangle {

	public int solution(int[] A) {
		
		Arrays.sort(A);
		
		int N = A.length;
		
		for(int i=2; i<N; i++) {
			if(A[i-2] + A[i-1] > A[i]) return 1;
		}
		
		return 0;
	}
}
