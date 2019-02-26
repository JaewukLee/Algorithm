package com.soowuk.algorithm.codility;

public class PermCheck {
	public static int solution(int[] A) {
		int length = A.length;
		boolean[] check = new boolean[length];

		for (int i = 0; i < length; i++) {
			int num = A[i] - 1;
			if (num >= length || num < 0) {
				return 0;
			}
			check[num] = true;
		}

		for (int i = 0; i < length; i++) {
			if (check[i] != true) {
				return 0;
			}
		}

		return 1;
	}
}
