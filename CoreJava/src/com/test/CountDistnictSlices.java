package com.test;

public class CountDistnictSlices {

	public static void main(String[] args) {
		
		int[] A = {3,4,5,5,2};
		System.out.println(solution(6, A));

	}
	
	 public static int solution(int M, int[] A) {
		 boolean[] visited = new boolean[M + 1];

	        int N = A.length;


	        int result = 0;

	        for (int i = 0; i < N; i++) {

	            int k = i;
	            int count = 0;

	            while (i < N && !visited[A[i]]) {

	                count++;
	                visited[A[i]] = true;

	                i++;
	            }

	            i -=1;

	            // 3, 4, 5, 5, 2, 5, 4
	            int j = i;

	            while (j >= k && visited[A[j]]) {

	                visited[A[j]] = false;
	                j--;
	            }

	            result += count * (count + 1) / 2;
	        }

	        return result;
	 }
}
