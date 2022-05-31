package com.test;

public class MaxBinaryZeros {

	static int maxZeros(int N) {
		// variable to store the length of
		// longest consecutive 0's
		int maxm = -1;

		// to temporary store the consecutive 0's
		int cnt = 0;

		while (N != 0) {
			if ((N & 1) == 0) {
				cnt++;
				N >>= 1;
				maxm = Math.max(maxm, cnt);
			} else {

				maxm = Math.max(maxm, cnt);
				cnt = 0;
				N >>= 1;
			}
		}
		return maxm;
	}

	public static void main(String args[]) {
		int N = 32;
		System.out.println(maxZeros(N));

		System.out.println(solution(15));
	}

	static int longestSeqOfZeroes(int n) {
		if (n == 0)
			return 1;
		int ans = 0, temp = 0;
		while (n != 0) {
			int rem = n % 2;
			n /= 2;
			if (rem == 1) {
				ans = Math.max(ans, temp);
				temp = 0;
			} else
				temp++;
		}
		ans = Math.max(ans, temp);
		return ans;
	}

	public static int solution(int n) {
		// write your code in Java SE 8

		String str[] = Integer.toBinaryString(n).substring(0, Integer.toBinaryString(n).lastIndexOf('1')).split("1");
		int index = 0;
		int max = 0;

		while (index < str.length) {
			max = max > str[index].length() ? max : str[index].length();
			index++;
		}
		return max;
	}

}
