package com.java11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test123 {

	public static void main(String[] args) {

		
		List<Integer> list = new ArrayList<>();
		for(int i =1; i <= 100 ; i++) {
			list.add(i);
		}
		//5 9 21 15
	
		List<Integer> divisibleBy7 = list.stream().filter(e -> e % 7 == 0).collect(Collectors.toList());
		System.out.println(" Divisible bY 7: "+ divisibleBy7);
		
		String str = "aaaBBBccccEEEdddkkk";
		Map<String, Long> result = Arrays.stream(str.split(""))
				.map(String::toLowerCase)
				.collect(Collectors.groupingBy(s -> s,
						LinkedHashMap::new, Collectors.counting()));
		System.out.println(result);
		
	}

}
