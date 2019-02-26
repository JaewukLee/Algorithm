package com.soowuk.algorithm.codility;

public class FrogRiverOne {
	public static int solution(int X, int A[]) {
		int length = A.length;
		boolean[] check = new boolean[X];
		int count = 0;
		for (int i = 0; i < length; i++) {
			if (A[i] > X) {
				continue;
			}

			if (check[A[i] - 1] != true) {
				check[A[i] - 1] = true;
				count++;
			}

			if (count == X) {
				return i;
			}
		}

		return -1;
	}
}
