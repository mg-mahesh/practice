package com.test;

public class Dominator {

	public static void main(String[] args) {

		int[] arr = { 3, 4, 3, 2, 3, -1, 3, 3 };
		System.out.println(solution(arr));
	}

	public static int solution(int[] A) {
		int size = 0;
		int dominator = 0;

		for (int a : A) {
			if (size == 0) {
				size++;
				dominator = a;
			} else if (dominator != a) {
				size--;
			} else {
				size++;
			}
		}

		if (size == 0)
			return -1;

		int result = 0;
		int cnt = 0;

		for (int i = 0; i < A.length; i++) {
			if (A[i] == dominator) {
				cnt++;
				result = i;
			}
		}

		if (cnt <= A.length / 2)
			return -1;
		else
			return result;
	}

}
