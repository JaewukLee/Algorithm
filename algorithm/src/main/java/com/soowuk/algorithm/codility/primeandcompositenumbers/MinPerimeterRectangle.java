package com.soowuk.algorithm.codility.primeandcompositenumbers;

public class MinPerimeterRectangle {

	public int solution(int N) {
		int length = (int)Math.ceil(Math.sqrt(N));
		int i = length;
		while(i > 0) {
			if(N%i == 0) {
				return 2*(N/i + i);
			}
			i--;
		}
		
		return 0;
	}
}
