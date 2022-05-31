package com.test;

public class TieRopes {

	public static void main(String[] args) {
		
		int[] A = {1,2,3,4,1,1,5};
		System.out.println(solution(4, A));
	}

	public static int solution(int K, int[] A) {
		int N = A.length;
		int result = 0;
		int length = 0;
		for (int rope : A) {
			length += rope;
			if (length >= K) {
				result++;
				length = 0;
			}
		}
		return result;
	}

}
