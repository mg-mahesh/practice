package com.test;

import java.util.ArrayDeque;
import java.util.Deque;

public class StoneWall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] H = { 8, 8, 5, 7, 9, 8, 7, 4, 8 };
		System.out.println(solution(H));

	}

	public static int solution(int[] H) {
		int count = 0;
		Deque<Integer> stack = new ArrayDeque<>();

		for (int a : H) {
			while (!stack.isEmpty() && a < stack.peek()) {
				stack.pop();
			}
			if (stack.isEmpty() || a > stack.peek()) {
				count++;
				stack.push(a);
			}

		}
		return count;
	}

}
