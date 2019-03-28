package com.soowuk.algorithm.codility.sorting;

public class MaxProductOfThree {

	public int solution(int[] A) {
		int N = A.length;
		
		int[] maximum = new int[3];
		for(int i=0; i < 3; i++) {
			int j;
			for(j=1; j < N - i; j++) {
				if(A[j-1] > A[j]) {
					int tmp = A[j];
					A[j] = A[j-1];
					A[j-1] = tmp;
				}
			}
			maximum[i] = A[j-1];
		}
		
		int[] minimum = new int[2];
		if(N > 5) {
			for(int i=0; i < 2; i++) {
				int j;
				for(j=1; j < N - i - 3; j++) {
					if(A[j-1] < A[j]) {
						int tmp = A[j];
						A[j] = A[j-1];
						A[j-1] = tmp;
					}
				}
				minimum[i] = A[j-1];
			}			
		} else {
			minimum[0] = A[0];
			minimum[1] = A[1];
		}
		
		int max = maximum[0] * maximum[1] * maximum[2];
		int min = minimum[0] * minimum[1] * maximum[0];
		
		return (max > min) ? max: min;
	}
}
