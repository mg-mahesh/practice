package com.test;

import java.util.Arrays;

public class PermMissingElement {
	public static void main(String[] args) {
		int[] arr = {2,3,1,5};
		System.out.println(solution(arr));
	}
	
	 public static int solution(int[] A) {
	       int N = A.length+1;
	       int idealSum = (N * (N + 1)) / 2;
	       int sum = Arrays.stream(A).sum();
	       int M = idealSum - sum;
	       return M;
	    }

}
