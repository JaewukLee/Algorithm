package com.soowuk.algorithm.codility.sorting;

import java.util.HashSet;

/** 
 * 문제 의도
 * A 정렬 후, count를 검사하는 것이 맞을 것 같음.
 * Set을 사용하는 것은 문제의도를 벗어난 꼼수가 아닌가 생각됨.
 * @author Administrator
 *
 */

public class Distinct {

	public int solution(int[] A) {
		
		HashSet<Integer> distinct = new HashSet<Integer>();
		for(int a : A) {
			distinct.add(a);
		}
		
		return distinct.size();
	}
}
