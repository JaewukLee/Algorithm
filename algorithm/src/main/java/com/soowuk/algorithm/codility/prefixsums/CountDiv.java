package com.soowuk.algorithm.codility.prefixsums;

/**
 * !!!!!!!!!!! 연산식 구성할 때, 변수 타입에 따른 결과를 항상 고민하자
 * (B - A)/C != B/C - A/C
 * @author Administrator
 *
 */
public class CountDiv {

	public int solution(int A, int B, int K) {
		int returnVal = B/K - A/K;
		if(A % K == 0) returnVal ++;
		
		return returnVal;
	}
}
