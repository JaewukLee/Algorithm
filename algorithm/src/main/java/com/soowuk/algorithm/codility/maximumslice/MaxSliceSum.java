package com.soowuk.algorithm.codility.maximumslice;

public class MaxSliceSum {

	public int solution(int[] A) {
		
		int N = A.length;
		if(N == 0) {
			return 0;
		}
		
		int partSum = A[0];
		int maxSum = A[0];
		for(int i=1; i<N; i++) {
			partSum = Math.max(A[i], partSum + A[i]);
			maxSum = Math.max(maxSum, partSum);
		}
		
		return maxSum;
	}
}
