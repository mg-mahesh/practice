package com.test;

public class RandomNumber {

	public static void main(String[] args) {
		System.out.println(findDigit(2324252, 2));
		System.out.println(findDigit(2324252, 5));
		System.out.println(findDigit(2324252, 9));
		
		getAllPrimeNumber(20);
		
		

	}
	
	static int findDigit(int random, int digit) {
		
		int count = 0;
		
		while(random > 0) {
			int rem = random % 10;
			
			if(rem == digit) {
				count++;
			}
			
			random = random / 10;
		}
		
        // random = 2324252, digit = 2, return -> 4
        // random = 2324252, digit = 5, return -> 1
        // random = 2324252, digit = 9, return -> -1
		if(count == 0)
			return 0;
		else return count;
    }
	
	
		
	

	static void getAllPrimeNumber(int n) {
		
		//if(n <2) return null;
		
		for(int i = 2; i < n; i++) {
			if(i%2 == 1)
				System.out.println(i);
			
		}
		
		// all prime no between 0 to n
		// n =20
		// [1,2,3,5,7,11,13,17,19]
		//return null;
	}

}
