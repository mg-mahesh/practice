package com.test;

import java.util.Arrays;

public class MinAbsSumOfTwo {

	public static void main(String[] args) {
		
		int[] A = {1,4,-3};
		System.out.println(solution(A));
	}
	public static int solution(int[] A) {
		int N = A.length;
        Arrays.sort(A);
        int tail = 0;
        int head = N - 1;
        int minAbsSum = Math.abs(A[tail] + A[head]);
        while (tail <= head) {
            int currentSum = A[tail] + A[head];
            minAbsSum = Math.min(minAbsSum, Math.abs(currentSum));
            if (currentSum <= 0)
                tail++;
            else
                head--;
        }
        return minAbsSum;
    }	
	

}
