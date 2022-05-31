package com.test;

import java.util.ArrayList;
import java.util.List;

public class FragRiverOne {

	public static void main(String[] args) {

		int[] arr = { 1, 3, 1, 4, 2, 3, 5, 4 };
		System.out.println(solution(5, arr));
	}

	public static int solution(int X, int[] A) {

		// write your code in Java SE 8
		int sum = 0;
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < A.length; i++) {
			if (A[i] <= X && !list.contains(A[i])) {
				sum += A[i];
				list.add(A[i]);
			}
			if (A[i] == X) {
				if (sum == X * (X + 1) / 2) {
					return i;
				}

			}

		}
		return -1;
	}

}
