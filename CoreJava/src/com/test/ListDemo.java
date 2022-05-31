package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListDemo {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		
		
		List<String> list = new ArrayList<String>();
		list.add("Java");
		list.add("Oracle");
		list.add("Java");
		list.add("C");
		list.add("Java");
		list.add("Oracle");
		
		Map<String, Integer> map = new HashMap<>();
		
		for(String s : list) {
			if(map.containsKey(s)) {
				map.put(s, map.get(s) + 1);
			}
			else map.put(s, 1);
		}
		System.out.println(map);
		
		//list.stream().filter(str -> str == )
		
		String str = "Integral";
		String str1 = "Triangle";
		
		int len = str.length();
		int len1 = str1.length();
		
		if(len == len1) {
			char[] ch = str.toCharArray();
			char[] ch1 = str1.toCharArray();
			
			String temp = "";
			
			for(int i = 0; i < ch.length-1; i++  ) {
				
			}
			
		}else
			System.out.println("Not an Anagram");
		
		
		
		
		/*
		 * ListDemo demo = new ListDemo(); // load the class , create instance
		 * 
		 * Class c =Class.forName("ListDemo");// load clsass ListDemo demo1 =(ListDemo)
		 * c.newInstance();// creating obj
		 */		
		List<Integer> listOfInt = new ArrayList<>();
		listOfInt.add(10);
		listOfInt.add(15);
		listOfInt.add(16);
		listOfInt.add(20);
		listOfInt.add(30);
		List<Integer> res = listOfInt.stream().filter(i -> i.toString().startsWith("1")).collect(Collectors.toList());
		System.out.println(res);
		
	
	}
	
}
