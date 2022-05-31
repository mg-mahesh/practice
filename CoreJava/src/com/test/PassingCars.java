package com.test;

public class PassingCars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 0, 1, 0, 1, 1 };
		System.out.println(solution(arr));

	}

	public static int solution(int[] A) {
		int count = 0;
		int multiply = 0;
		for (int car : A) {
			if (car == 0) {
				multiply = multiply + 1;
			}
			if (multiply > 0) {
				if (car == 1) {
					count = count + multiply;
					if (count > 1000000000) {
						return -1;
					}
				}
			}
		}
		return count;

	}
}
