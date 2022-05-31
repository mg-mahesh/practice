package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PermCheck {

	public static void main(String[] args) {
		
		int[] arr = {4,1,3,2};
		System.out.println(solution(arr));
	}

	public static int solution(int[] A) {
		Arrays.sort(A);

		Set<Integer> set = new HashSet<Integer>();
		for (int i : A) {
			set.add(i);
		}

		List<Integer> list = new ArrayList<>(set);
		int array_size = A.length;
		int value = 1;

		if (array_size != list.size() || list.get(0) != 1 || list.get(list.size() - 1) != array_size)
			value = 0;

		return value;
	}

}
