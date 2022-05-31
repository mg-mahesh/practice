package com.test;

import java.util.ArrayList;
import java.util.List;

public class StringDemo {

	//first repeated character
	static String res = "";
	public static void main(String[] args) {
		
		String str = "abbcbbccgdha";
		
		
		System.out.println(doFind(str));
		
	}
	
	public static String doFind(String str) {
		
		List<Character> clist = new ArrayList<>();
		for(int i = 0; i < str.length(); i++) {
			if(!clist.contains(str.charAt(i))) {
				clist.add(str.charAt(i));
			}else {
				res = Character.toString(str.charAt(i));
				break;
			}
		}
		return res;
	}

}
