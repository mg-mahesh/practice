package com.test;

public class ChocolatesByNumbers {

	public static void main(String[] args) {

		System.out.println(solution(10, 4));
	}

	public static int solution(int N, int M) {

		int lcm = N / gcd(N, M);
		return lcm;
	}

	public static int gcd(int a, int b) {
		if (a % b == 0)
			return b;
		return gcd(b, a % b);
	}

}
