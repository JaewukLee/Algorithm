package com.soowuk.algorithm.codility.prefixsums;

/**
 * Hint
1. 2개 인자의 평균은 항상 2개중 한개의 인자보다 값이 크다.
2. 평균들의 평균은 각 인자들의 평균과 같다.
(여기서 1전제에 의해 평균들의 평균은 그 인자가 되는 평균들 보다 항상 크다.)

그러므로 최소 단위인 2개 의 평균들중 가작 작은 값만 있으면 된다.

그런데 하나의 경우의 수가 더 필요하다.
그건 바로. 인자가 3개인 경우 이다.
4개의 부분 집합은 0개 1개 2개 3개 4개 가 있다.
이 문제에서 부분집합 0개는 필요 없다.
각 인자 하나를 뜻하는 부분집합 1개는 필요 없다.
4개의 의 부분집합은 곧 2개의 부분집합 으로 표현되므로 1전제 만으로 충분
(4개의 부분집합은 2개의 부분집합의 평균들의 평균 이므로 항상 큼)
하지만 3개를 인자로 하는 부분집합 도 고려 해야 한다.
(2개의 부분집합들로 3개의 부분집합 을 구할 수 없음)

그래서 2개 와 3개의 평균들만 고려 하면 된다.

요약.
부분집합중 가장 작은 집합의 평균이 항상 작다.
모든 부분집합은 2와 3으로 모두 표현된다. 그러나 그것은 값이 항상 크다.(전제 1)
 * @author Administrator
 *
 */

public class MinAvgTwoSlice {

	public int solution(int[] A) {
		
		int N = A.length;
		int[] sum = new int[N];
		int[] sumOfSum = new int[N];
		sum[0] = A[0];
		sumOfSum[0] = sum[0];
		
		for(int i=1; i<N; i++) {
			sum[i] = sum[i-1] + A[i];
			sumOfSum[i] = sumOfSum[i-1] + sum[i];
		}
		
		float minAvg = Float.MAX_VALUE;
		int returnVal = 0;
		for(int P=1; P<N-1; P++) {
			for(int Q=N-1; Q>P; Q--) {
				float avg = (sumOfSum[Q] - sumOfSum[P-1])/(float)(Q - P + 1);
				if(avg < minAvg) {
					minAvg = avg;
					returnVal = P;
				}
			}
		}
		
		return returnVal;
	}
}
