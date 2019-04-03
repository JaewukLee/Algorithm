package com.soowuk.algorithm.codility.maximumslice;

public class MaxSliceSum {

	public int solution(int[] A) {
		
		int N = A.length;
		if(N == 0) {
			return 0;
		}
		
		int lower = Integer.MIN_VALUE;
		int partSum = lower;
		int maxSum = lower;
		for(int i=0; i<N; i++) {
			partSum = Math.max(lower, partSum + A[i]);
			maxSum = Math.max(maxSum, partSum);
		}
		
		return maxSum;
	}
}
