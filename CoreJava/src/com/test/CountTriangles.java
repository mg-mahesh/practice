package com.test;

import java.util.Arrays;

public class CountTriangles {

	public static void main(String[] args) {
		
		int[] A = {10,2,5,1,8,12};
		System.out.println(solution(A));

	}
	
	public static int solution(int[] A) {
		
		int N = A.length;
        Arrays.sort(A);
        int result = 0;
        for (int i=0; i < N; i++) {
            int k = i + 2;
            for (int j=i+1; j < N; j++) {
                while(k<N && A[i]+A[j]>A[k]) {
                    k++;    
                }
                result += k-j-1; 
            }
        }
        return result;
        
    }
}

