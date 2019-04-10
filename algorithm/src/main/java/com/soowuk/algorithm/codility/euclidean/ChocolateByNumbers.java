package com.soowuk.algorithm.codility.euclidean;

public class ChocolateByNumbers {

	public int solution(int N, int M) {
		int gcd = gcd(N, M);
		
		return N/gcd;
	}
	
	private int gcd(int a, int b) {
		if(a%b == 0) {
			return b;
		} else {
			return gcd(b, a%b);
		}
	}
}
