package com.soowuk.algorithm.sum;

public class PrefixSum {

	public int prefixSum(int[] A, int begin, int end) {
		int length = A.length;
		int[] sum = new int[length];
		
		sum[0] = A[0];
		for(int i=1; i<length; i++) {
			sum[i] = sum[i - 1] + A[i];
		}
		
		return sum[end] - sum[begin]; 
	}
}
