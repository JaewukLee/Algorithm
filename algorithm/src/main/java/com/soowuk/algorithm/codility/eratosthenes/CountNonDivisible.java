package com.soowuk.algorithm.codility.eratosthenes;

public class CountNonDivisible {

	public int[] solution(int[] A) {
		int N = A.length;
		int size = N*2 + 1;
		int[] count = new int[size];
		
		for(int a : A) {
			count[a] ++;
		}
		
		int[] returnVal = new int[N];
		for(int i=0; i<N; i++) {
			int a = A[i];
			int j=1;
			int divisor = 0;
			while(j*j <= a) {
				if(a % j == 0) {
					divisor += count[j];
					if(a/j != j) {
						divisor += count[a/j];
					}
				}
				j++;
			}
			returnVal[i] = N - divisor;
		}
		
		return returnVal;
	}
}
