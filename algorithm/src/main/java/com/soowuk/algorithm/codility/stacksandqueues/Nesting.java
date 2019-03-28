package com.soowuk.algorithm.codility.stacksandqueues;

import java.util.Stack;

public class Nesting {

	public int solution(String S) {
		char[] input = S.toCharArray();
		Stack<Character> nested = new Stack<Character>();
		
		for(char c : input) {
			if(c == '(') {
				nested.push(c);
				continue;
			}
			
			if(nested.isEmpty()) {
				return 0;
			}
			
			char stackItem = nested.pop();
			if(stackItem != '(') {
				return 0;
			}
		}
		
		return (nested.size() == 0) ? 1 : 0;
	}
}
