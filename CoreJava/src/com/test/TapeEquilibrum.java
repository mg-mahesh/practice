package com.test;

public class TapeEquilibrum {

	public static void main(String[] args) {
		int[] arr = {3,1,2,4,3};
		System.out.println(solution(arr));
	}
	
	public static int solution(int[] A) {

		long sumright = 0;
		long sumleft = 0;
		long ans;

		for (int i = 1; i < A.length; i++)
			sumright += A[i];

		sumleft = A[0];
		ans = Math.abs(Math.abs(sumright) + Math.abs(sumleft));

		for (int P = 1; P < A.length; P++) {
			if (Math.abs(Math.abs(sumleft) - Math.abs(sumright)) < ans)
				ans = Math.abs(Math.abs(sumleft) - Math.abs(sumright));
			sumleft += A[P];
			sumright -= A[P];
		}
		return (int) ans;
	}
}
