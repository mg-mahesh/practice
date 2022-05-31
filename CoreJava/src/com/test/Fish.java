package com.test;

import java.util.ArrayDeque;
import java.util.Deque;

public class Fish {

	public static void main(String[] args) {
		int[] A = { 4, 3, 2, 1, 5 };
		int[] B = { 0, 1, 0, 0, 0 };
		System.out.println(solution(A, B));
	}

	public static int solution(int[] A, int[] B) {

		int numFishes = A.length;

		if (numFishes == 0)
			return 0;

		Deque<Integer> downstreams = new ArrayDeque<Integer>();

		for (int i = 0; i < A.length; i++) {

			if (B[i] == 1) {
				downstreams.push(A[i]);
			} 
			else {
				while (!downstreams.isEmpty()) {
					if (downstreams.peek() > A[i]) {
						numFishes--;
						break;
					} 
					else if (downstreams.peek() < A[i]) {
						numFishes--;
						downstreams.pop();
					}
				}
			}
		}

		return numFishes;
	}
}
