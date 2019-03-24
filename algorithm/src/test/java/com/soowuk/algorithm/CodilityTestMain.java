package com.soowuk.algorithm;

import com.soowuk.algorithm.codility.prefixsums.CountDiv;

public class CodilityTestMain {

	public static void main(String[] args) {
		CountDiv cd = new CountDiv();
		
		int A = 11, B = 345, K = 17;
//		int A = 6, B = 11, K = 2;
//		int A = 10, B = 10, K = 7;
		System.out.println(cd.solution(A, B, K));
		
	}
}
