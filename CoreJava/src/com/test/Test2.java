package com.test;

public class Test2 {

	public static void main(String[] args) {
		
		returnM();
		
	}
	
	public static int returnM() {
		try {
			System.out.println(1);
			return 1;
			
		}catch(Exception e) {
			
		}finally {
			System.out.println(2);
			return 2;
		}
		//return 10;
	}

}
