package com.soowuk.algorithm.codility.stacksandqueues;

import java.util.Stack;

public class Fish {

	public int solution(int[] A, int[] B) {
		int N = A.length;
		int returnVal = 0;
		Stack<Integer> downFish = new Stack<Integer>();
		
		for(int i=0; i<N; i++) {
			if(B[i] == 1) {
				downFish.push(A[i]);
				continue;
			}
			
			while(!downFish.isEmpty()) {
				int df = downFish.pop();
				if(df > A[i]) {
					downFish.push(df);
					break;
				}
			}

			if(downFish.isEmpty()) {
				returnVal ++;
			}
		}
		
		returnVal = returnVal + downFish.size();
		
		return returnVal;
	}
}
