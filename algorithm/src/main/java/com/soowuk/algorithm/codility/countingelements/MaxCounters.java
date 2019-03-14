package com.soowuk.algorithm.codility.countingelements;

/**
 * max counter operation의 최적화가 관건
 * 1. 첫번째 반복에서 최대 counter(tmpMaxCount), N+1을 만난 시점의 최대 counter(doneMaxCount) 구한다.
 *  1.1 counter의 값이 doneMaxCount보다 작으면 대입
 *  1.2 1증가
 *  1.3 tmpMaxCount보다 크면 값 교체
 * 2. doneMaxCount가 발견된 이후의 increase는 max counter operation 이 적용되어 있으므로, doneMaxCount 이상의 값을 가짐
 * 따라서 doneMaxCount보다 낮은 값들은 doneMaxCount보다 작은 값들에 대입해줌
 * 
 * 와 난 이건 힌트 없으면 못 알아냄.
 * @author JaeWuk Lee
 *
 */
public class MaxCounters {

	public int[] solution(int N, int[] A) {
		
		int[] counter = new int[N];
		int tmpMaxCount = 0;
		int doneMaxCount = 0;
		
		for(int a : A) {
			if(a > N) {
				doneMaxCount = tmpMaxCount;
			} else {
				int counterIdx = a-1;
				if(counter[counterIdx] < doneMaxCount) {
					counter[counterIdx] = doneMaxCount;
				}
				
				counter[counterIdx] ++;
				
				if(counter[counterIdx] > tmpMaxCount) {
					tmpMaxCount = counter[counterIdx];
				}
			}
		}
		
		if(doneMaxCount > 0) {
			for(int i=0; i<N; i++) {
				if(counter[i] < doneMaxCount) {
					counter[i] = doneMaxCount;
				}
			}
		}
		
		return counter;
	}
}
