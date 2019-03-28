package com.soowuk.algorithm.codility.stacksandqueues;

import java.util.Stack;

public class Brackets {

	public int solution(String S) {
		
		char[] input = S.toCharArray();
		Stack<Character> nested = new Stack<Character>();
		
		for(char c : input) {
			if(c == '(' || c == '[' || c == '{') {
				nested.push(c);
				continue;
			}
			
			if(nested.isEmpty()) {
				return 0;
			}
			
			char stackItem = nested.pop();
			if(c == ')' && stackItem != '(') {
				return 0;
			}
			if(c == ']' && stackItem != '[') {
				return 0;
			}
			if(c == '}' && stackItem != '{') {
				return 0;
			}
		}
		
		return (nested.size() == 0) ? 1 : 0;
	}
}
