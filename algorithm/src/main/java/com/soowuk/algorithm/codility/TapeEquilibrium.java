package com.soowuk.algorithm.codility;

public class TapeEquilibrium {
	public int solution(int[] A) {

		int sum = 0;
		for (int a : A) {
			sum += a;
		}

		int size = A.length - 1;
		int subSum = 0;
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < size; i++) {
			subSum += A[i];
			int tmp = Math.abs(subSum * 2 - sum);

			if (tmp < min) {
				min = tmp;
			}
		}

		return min;
	}
}
