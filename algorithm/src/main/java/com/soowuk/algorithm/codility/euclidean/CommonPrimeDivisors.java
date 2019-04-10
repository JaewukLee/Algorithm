package com.soowuk.algorithm.codility.euclidean;

public class CommonPrimeDivisors {

	public int solution(int[] A, int[] B) {
		int N = A.length;
		int returnVal = 0;
		for(int i=0; i<N; i++) {
			if(hasCommonPrimeDivisors(A[i], B[i])) {
				returnVal ++;
			}
		}
		
		return returnVal;
	}
	
	private int gcd(int a, int b) {
		if(a%b == 0) {
			return b;
		} else {
			return gcd(b, a%b);
		}
	}
	
	private boolean hasCommonPrimeDivisors(int a, int b) {
		int gcdAB = gcd(a, b);
		int gcdA = 0;
		int gcdB = 0;
		
		/**
		 * 1. 두 수의 최대공약수를 찾는다. (gcdAB)
		 * 2. 한 수와 최대공약수 사이의 약수를 찾는다. (gcdA)
		 * 3. gcdA로 a를 나눠 몫을 찾는다.
		 * 4. gcdA가 1이 될때까지 a가 1이 되지 않으면, 최대공약수 이외의 소인수가 존재한다.
		 */
		while(gcdA != 1) {
			gcdA = gcd(a, gcdAB);
			a /= gcdA;
		}
		
		while(gcdB != 1) {
			gcdB = gcd(b, gcdAB);
			b /= gcdB;
		}
		
		return (a==1 && b==1)? true:false;
	}
}
