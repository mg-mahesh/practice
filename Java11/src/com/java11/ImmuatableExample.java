package com.java11;

public class ImmuatableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Mahesh";
		
		str = str.concat("Java Developer");  // Mahaesh  +  Java Developer = str
		
		System.out.println(str);
		
		String first = "AAABBDDDEEEEACCBBB";   // A3B2D3E4A1C2B3
		
		    StringBuffer result = new StringBuffer();
		    int count = 1;
		    for (int i = 1; i < first.length(); i++) {
		        if (first.charAt(i) == (first.charAt(i - 1))) {
		            count++;
		        } else {
		            if (count > 1) {

		                result.append(String.valueOf(count) + first.charAt(i - 1));
		            } else {
		                result.append(first.charAt(i - 1));
		            }
		            count = 1;
		        }
		    }
		    System.out.println("First String is:"+ first);
		    System.out.println("Result is:" + result);
		
		
		
		
		int i = 564789;
		int count1=0;
		while(i != 0) {
			
			i = i /10;
			
			count1 ++;
		}
		System.out.println(count);
		
		
		
			
	}

}
