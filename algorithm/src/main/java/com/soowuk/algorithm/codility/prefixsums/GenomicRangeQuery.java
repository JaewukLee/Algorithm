package com.soowuk.algorithm.codility.prefixsums;

/**
 * String 메소드는 내부적으로 반복문이 있어서 결국 시간복잡도가 증가함
 * prefix counting을 응용하라 하는데 아직 이해가 되지 않음.
 * 
 * hint
 * // impactCnt = {2,3,1,1} // = {A,C,G,T}
 * //               padding C A G C C T A
 * // impactArray[0] = {0,  0,1,1,1,1,1,2} // = [A]
 * // impactArray[1] = {0,  1,1,1,2,3,3,3} // = [C]
 * // impactArray[2] = {0,  0,0,1,1,1,1,1} // = [G]
 * // impactArray[3] = {0,  0,0,0,0,0,1,1} // = [T]
 * // 구간이 정해지면, impactArray[0]부터 해당 구간 index값 검사. 해당 구간에서 변화가 있으면 반환
 * @author Administrator
 *
 */
public class GenomicRangeQuery {

	public int[] solution(String S, int[] P, int[] Q) {
		
		int M = P.length;
		int[] returnVal = new int[M];
		
		for(int i=0; i<M; i++) {
			String queries = S.substring(P[i], Q[i] + 1);
			
			returnVal[i] = 4;
			if(queries.indexOf('A') != -1) {
				returnVal[i] = 1;
			} else if(queries.indexOf('C') != -1) {
				returnVal[i] = 2;
			} else if(queries.indexOf('G') != -1) {
				returnVal[i] = 3;
			}
		}
		
		return returnVal;
	}
}
