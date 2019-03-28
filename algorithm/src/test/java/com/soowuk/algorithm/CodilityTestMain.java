package com.soowuk.algorithm;

import com.soowuk.algorithm.codility.stacksandqueues.Brackets;

public class CodilityTestMain {

	public static void main(String[] args) {
		Brackets brackets = new Brackets();
		
		String S = "{[()()]}";
		String S2 = "([)()]";
		System.out.println(brackets.solution(S2));
	}
}