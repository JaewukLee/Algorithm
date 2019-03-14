package com.soowuk.algorithm;

import com.soowuk.algorithm.codility.prefixsums.GenomicRangeQuery;

public class CodilityTestMain {

	public static void main(String[] args) {
		GenomicRangeQuery grq = new GenomicRangeQuery();
		int[] A = {0,1,0,1,1};
		String S = "G";
		int[] P = {0};
		int[] Q = {0};
		int[] result = grq.solution(S, P, Q);
		
		for(int r : result) {
			System.out.println(r);
		}
		
	}
}
