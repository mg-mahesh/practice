package com.test;

public class MinABsSum {

	public static void main(String[] args) {
		int[] A = { 1, 5, 2, -2 };
		System.out.println(solution(A));
	}

	public static int solution(int[] A) {
		if (A.length == 0) {
			return 0;
		}
		int sum = 0;
		int max = Integer.MIN_VALUE;

		for (int i = 0; i < A.length; i++) {
			final int value = Math.abs(A[i]);
			sum += value;
			if (max < value) {
				max = value;
			}
			A[i] = value;
		}
		final int[] counts = new int[max + 1];
		for (int value : A) {
			counts[value]++;
		}

		final int[] r = new int[sum + 1];
		for (int i = 1; i < r.length; i++) {
			r[i] = -1;
		}

		for (int i = 1; i < counts.length; i++) {
			for (int j = 0; j < r.length; j++) {
				if (r[j] >= 0) {
					r[j] = counts[i];
				} else if (j - i >= 0 && r[j - i] > 0) {
					r[j] = r[j - i] - 1;
				}
			}
		}

		int result = sum;

		for (int i = 0; i < r.length / 2 + 1; i++) {
			if (r[i] >= 0 && result > Math.abs(sum - 2 * i)) {
				result = Math.abs(sum - 2 * i);
			}
		}
		return result;
	}

}
