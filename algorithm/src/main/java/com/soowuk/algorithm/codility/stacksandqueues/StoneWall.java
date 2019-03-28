package com.soowuk.algorithm.codility.stacksandqueues;

import java.util.Stack;

public class StoneWall {

	public int solution(int[] H) {
		
		Stack<Integer> wall = new Stack<Integer>();
		int returnVal = 0;
		
		for(int h : H) {
			while(!wall.isEmpty() && wall.peek() > h) {
				wall.pop();
			}
			
			if(wall.isEmpty() || wall.peek() < h) {
				wall.push(h);
				returnVal ++;
			}
		}
		
		return returnVal;
	}
}
