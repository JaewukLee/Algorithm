package com.soowuk.algorithm.codility.sorting;

import java.util.Arrays;

/**
 * 중심값이 항상 0 이상이기 때문에, 두 disc를 비교했을 때, 한 disc의 최대값이 다른 디스크의 최소값보다 크면 항상 intersection이다.
 * @author Administrator
 *
 */

public class NumberOfDisIntersections {

	public int solution(int[] A) {
		
		int N = A.length;
		
		long[] large = new long[N];
		long[] small = new long[N];
		
		for(int i=0; i<N; i++) {
			small[i] = i - A[i];
			large[i] = i + A[i];
		}
		
		Arrays.sort(large);
		Arrays.sort(small);
		
		int returnVal = 0;
		int smallIdx = 0;
		
		for(int i=0; i<N; i++) {
			while(smallIdx < N && large[i] >= small[smallIdx]) {
				returnVal = returnVal + smallIdx;
				/**
				 * 1번째는 0번째 값이랑 비교한 결과가 중복이므로 -1
				 * 2번째는 0번째, 1번째 값이랑 비교한 결과가 중복이므로 -2 ...
				 */
				returnVal = returnVal - i;
			}
		}
		
		return (returnVal > 10000000) ? -1 : returnVal;
	}
}
