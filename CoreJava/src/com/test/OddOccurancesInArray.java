package com.test;

import java.util.Arrays;

public class OddOccurancesInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {9,3,9,3,9,7,9,7,5};
		System.out.println(solution(arr));

	}
	
	public static int solution (int[] A){
		if (A.length == 0){
	        return 0;
	    }
	    if (A.length == 1) {
	        return A[0];
	    }
	    Arrays.parallelSort(A);
	    for(int i=0; i<A.length-2; i+=2) {
	        if(A[i]!=A[i+1])
	            return A[i];
	    }
	    return A[A.length-1];
	}
}
