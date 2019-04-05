package com.soowuk.algorithm.codility.primeandcompositenumbers;

import java.util.ArrayList;

public class Peaks {

	public int solution(int[] A) {
		int N = A.length;
		ArrayList<Integer> peaks = new ArrayList<Integer>();
		int i=1;
		while(i < N-1) {
			if(A[i] > A[i-1] && A[i] > A[i+1]) {
				peaks.add(i);
				i++;
			}
			i++;
		}
		
		int count = peaks.size();
		while(count > 1) {
			if(N%count == 0) {
				int gap = N/count;
				int idx = gap;
				
				for(int peak : peaks) {
					if(peak < idx) {
						continue;
					}
					
					idx = idx + gap;
					if(peak >= idx) {
						break;
					}
				}
				
				if(idx >= N) {
					return count;
				}
			}
			count--;
		}
		
		return count;
	}
}
