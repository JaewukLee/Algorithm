package com.soowuk.algorithm.codility.leader;

import java.util.Stack;

public class Dominator {

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
			return -1;
		}
		
		int candidate = voter.pop();
		int size = 0;
		int returnVal = 0;
		for(int i=0; i<N; i++) {
			if(A[i] == candidate) {
				size++;
				returnVal = i;
			}
		}
		
		return (size > (N/2)) ? returnVal : -1;
	}
}
