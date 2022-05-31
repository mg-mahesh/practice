package com.test;

public class NumberSolitaire {

	public static void main(String[] args) {
		int[] A = {1,-2,0,9,-1,-2};
		System.out.println(solution(A));
	}
	
	public static int solution(int[] A) {
		int N = A.length;

	    int[] result = new int[N];
	    result[0] = A[0];

	    for (int i = 1; i < N; i++) {

	        result[i] = result[i - 1];

	        for (int j = 2; j <= 6; j++) {

	            if (j > i) {
	                break;
	            }

	            // 0, 1, 2, 3, 4
	            result[i] = Math.max(result[i], result[i-j]);
	        }

	        result[i] += A[i];
	    }

	    return result[N - 1];
	}
	

}
