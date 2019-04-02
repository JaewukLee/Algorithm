package com.soowuk.algorithm.codility.leader;

import java.util.Stack;

public class EquiLeader {

	public int solution(int[] A) {
		int N = A.length;
		
		Stack<Integer> voter = new Stack<Integer>();
		
		for(int i=0; i<N; i++) {
			if(voter.isEmpty()) {
				voter.push(A[i]);
				continue;
			}
			
			if(A[i] == voter.peek()) {
				voter.push(A[i]);
				continue;
			}
			
			voter.pop();
		}
		
		if(voter.isEmpty()) {
			return 0;
		}
		
		int candidate = voter.pop();
		int size = 0;
		for(int i=0; i<N; i++) {
			if(A[i] == candidate) {
				size++;
			}
		}
		
		if(size <= N/2) {
			return 0;
		}
		
		int returnVal = 0;
		int leftSize = 0;
		for(int j=0; j<N; j++) {
			if(A[j] == candidate) {
				leftSize ++;
			}
			
			if(leftSize > (j+1)/2 && (size - leftSize) > (N-j-1)/2) {
				returnVal++;
			}
		}
		
		return returnVal;
	}
}
