package com.soowuk.algorithm.codility.primeandcompositenumbers;

public class CountFactors {

	public int solution(int N) {
		int returnVal = 0;
		
		int length = (int)Math.ceil(Math.sqrt(N));
		
		int i=1;
		while(i < length) {
			if(N % i == 0) {
				returnVal = returnVal + 2;
			}
			i++;
		}
		
		if(i*i == N) {
			returnVal ++;
		}
		
		return returnVal;
	}
}
