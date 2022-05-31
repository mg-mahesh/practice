package com.test;

import java.util.Arrays;

public class Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 10, 2, 5, 1, 8, 20 };
		System.out.println(solution(arr));
	}

	public static int solution(int[] A) {

		int N = A.length;
		if (N < 3)
			return 0;
		Arrays.sort(A);

		for (int i = 0; i < N - 2; i++) {

			/**
			 * Since the array is sorted A[i + 2] is always greater or equal to previous
			 * values So A[i + 2] + A[i] > A[i + 1] ALWAYS As well ass A[i + 2] + A[i + 1] >
			 * A[i] ALWAYS Therefore no need to check those. We only need to check if A[i] +
			 * A[i + 1] > A[i + 2]? Since in case of A[i] + A[i + 1] > MAXINT the code would
			 * strike an overflow (ie the result will be greater than allowed integer limit)
			 * We'll modify the formula to an equivalent A[i] > A[i + 2] - A[i + 1] And
			 * inspect it there
			 */
			if (A[i] >= 0 && A[i] > A[i + 2] - A[i + 1]) {

				return 1;
			}
		}

		return 0;

	}
}
