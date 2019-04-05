package com.soowuk.algorithm.codility.primeandcompositenumbers;

import java.util.ArrayList;

/**
 * TODO : Timeout error
 * ?? 더 줄일 수 있다고..?
 * @author Administrator
 *
 */
public class Flags {

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
		
		int sizePeaks = peaks.size();
		int count = sizePeaks;
		while(count > 1) {
			int peak = peaks.get(0);
			int flags = 1;
			for(int j=1; j<sizePeaks; j++) {
				int thisPeak = peaks.get(j);
				if(thisPeak - peak >= count) {
					peak = thisPeak;
					flags ++;
				}
				
				if(flags >= count) {
					return count;
				}
			}
			
			count --;
		}
		
		return sizePeaks;
	}
}
