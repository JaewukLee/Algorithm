package com.soowuk.algorithm.codility.prefixsums;

public class PassingCars {

	public int solution(int[] A) {
		
		int returnVal = 0;
		int eastCar = 0;
		
		for(int a : A) {
			if(a == 0) {
				eastCar++;
				continue;
			} else {
				returnVal = returnVal + eastCar;
				if(returnVal > 1000000000) {
					return -1;
				}
			}
		}
		
		return returnVal;
	}
}
