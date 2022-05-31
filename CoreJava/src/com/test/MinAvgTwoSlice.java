package com.test;

public class MinAvgTwoSlice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 4, 2, 2, 5, 1, 5, 8 };
		System.out.println(solution(arr));
		
		//List<Integer> list = Arrays.asList(arr);
	}

	public static int solution(int[] A) {
		int result = 0;
		int N = A.length;
		int[] prefix = new int[N + 1];
		for (int i = 1; i < prefix.length; i++) {
			prefix[i] = prefix[i - 1] + A[i - 1];
		}
		double avg = Double.MAX_VALUE;
		for (int i = 1; i < N; i++) {
			for (int j = i + 1; j <= N; j++) {
				double temp = (double) (prefix[j] - prefix[i - 1]) / (double) (j - i + 1);
				if (temp < avg) {
					avg = temp;
					result = i - 1;
				}
			}
		}
		return result;
	}

}
