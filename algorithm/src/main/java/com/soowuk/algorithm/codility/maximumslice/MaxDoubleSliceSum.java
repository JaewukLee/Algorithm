package com.soowuk.algorithm.codility.maximumslice;

/**
 * 1. 1 ~ N-2의 부분합 array1
 * 2. N-2 ~ 1의 부분합 array2
 * 3. 1 ~ N -2까지 max(array1[i-1] + array2[i+1])
 * @author Administrator
 *
 */
public class MaxDoubleSliceSum {

	public int solution(int[] A) {
		int N = A.length;
		int[] left = new int[N];
		int[] right = new int[N];
		
		for(int i=1; i<N-1; i++) {
			left[i] = Math.max(left[i-1] + A[i], 0);
		}
		
		for(int i=N-2; i>0; i--) {
			right[i] = Math.max(right[i+1] + A[i], 0);
		}
		
		int maxSum = 0;
		for(int i=1; i<N-1; i++) {
			maxSum = Math.max(maxSum, left[i-1] + right[i+1]);
		}
		
		return maxSum;
	}
}
