package com.soowuk.algorithm.codility.countingelements;

import java.util.Arrays;

public class MissingInteger {

	public int solution(int[] A) {
		Arrays.sort(A);

		int returnVal = 0;
		for (int a : A) {
			if (a < 1) {
				continue;
			}

			if (a - returnVal == 1) {
				returnVal++;
				continue;
			}

			if (a - returnVal > 1) {
				return ++returnVal;
			}
		}

		return ++returnVal;
	}
}
