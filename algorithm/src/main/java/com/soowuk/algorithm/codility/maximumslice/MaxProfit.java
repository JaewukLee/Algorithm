package com.soowuk.algorithm.codility.maximumslice;

public class MaxProfit {

	public int solution(int[] A) {
		
		int N = A.length;
		if(N == 0) {
			return 0;
		}
		
		int lowPrice = A[0];
		int maxProfit = 0;
		for(int i=0; i<N; i++) {
			lowPrice = Math.min(lowPrice, A[i]);
			maxProfit = Math.max(maxProfit, (A[i] - lowPrice));
		}
		
		return maxProfit;
	}
}
