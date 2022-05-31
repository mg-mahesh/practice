package com.test;

public class MaxSliceSum {

	public static void main(String[] args) {
		int[] arr = { 3, 2, -6, 4, 0 };
		System.out.println(solution(arr));
	}

	public static int solution(int[] A) {
		int absoluteMax = A[0];
	    int localMax = A[0];
	    int nextSum = 0;
	    int currentElement = 0;
	   
	    for (int i = 1; i < A.length; i++) {
	      currentElement = A[i];
	      nextSum = localMax + currentElement;
	      localMax = Math.max(A[i], nextSum);
	      absoluteMax = Math.max(absoluteMax, localMax);
	    }
	    return absoluteMax;
	}

}
