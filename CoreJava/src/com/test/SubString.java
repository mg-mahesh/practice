package com.test;

import java.util.Arrays;

public class SubString {
	
public static void main(String[] args) {
		
		String[] S = {"abc", "bca","dbe"};	
		String[] A = {"zzzz","ferz","zdsr","fgtd"};
		String[] B = {"gr","sd","rg"};
		String[] C = {"bdafg","ceagi"};
		SubString obj = new SubString();
		System.out.println("matching index from strings : "+Arrays.toString(obj.solution(S)));
		System.out.println("matching index from strings : "+Arrays.toString(obj.solution(A)));
		System.out.println("matching index from strings : "+Arrays.toString(obj.solution(B)));
		System.out.println("matching index from strings : "+Arrays.toString(obj.solution(C)));
	}
	
	public int[] solution(String[] S) {
		
		for(int i = 0 ;i <S.length ; i++) {
			String s1 = S[i];
			for(int j = i+1; j<S.length ; j++) {
				
				int length = Math.min(S[i].length(), S[j].length());
				int k = 0;
				while( k < length ) {
					if(S[i].charAt(k) == S[j].charAt(k)) {
						return new int[] {i,j,k};
					}
					k++;
				}
				
			}
		}
		int arr[] = {};
		return arr;
		
	}

}
