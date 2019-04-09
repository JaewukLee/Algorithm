package com.soowuk.algorithm.codility.eratosthenes;

import java.util.ArrayList;

public class CountSemiprimes {

	public int[] solution(int N, int[] P, int[] Q) {
		int M = P.length;
		
		if(N < 4) {
			return new int[M];
		}
		
		int idx = 2;
		boolean[] primes = new boolean[N+1];
		for(int i=2; i<=N; i++) {
			primes[i] = true;
		}
		
		while(idx * idx <= N) {
			if(primes[idx]) {
				int k = idx * idx;
				while(k <= N) {
					primes[k] = false;
					k += idx;
				}
			}
			
			idx++;
		}
		ArrayList<Integer> primeList = new ArrayList<Integer>();
		for(int i=0; i<=N; i++) {
			if(primes[i]) primeList.add(i);
		}
		
		//remain semiprime numbers
		int size = primeList.size();
		boolean[] semiprimes = new boolean[N+1];
		for(int i=0; i<size; i++) {
			for(int j=i; j<size; j++) {
				long isSemi = (long)primeList.get(i) * (long)primeList.get(j);
				if(isSemi > N) {
					break;
				} else {
					semiprimes[(int)isSemi] = true;
				}
			}
		}
		
		int[] counts = new int[N+1];
		int count = 0;
		for(int i=0; i<=N; i++) {
			if(semiprimes[i]) {
				 count++;
			}
			counts[i] = count;
		}
		
		int[] returnVal = new int[M];
		for(int j=0; j<M; j++) {
			returnVal[j] = counts[Q[j]] - counts[P[j] - 1];
		}
		
		return returnVal;
	}
}
