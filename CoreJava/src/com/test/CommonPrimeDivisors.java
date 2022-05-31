package com.test;

public class CommonPrimeDivisors {

	public static void main(String[] args) {

		int[] A = {15,10,3};
		int[] B = {75,30,5};
		System.out.println(solution(A, B));
	}
	
	public static int solution(int A[], int B[]) {
        int result = 0;

        for (int i = 0; i < A.length; i++){

            int gcdOfAAndB = gcd(A[i], B[i]);

            if (
                factorsOfRemainderAreTheSameOfGCD(A[i], gcdOfAAndB) &&
                factorsOfRemainderAreTheSameOfGCD(B[i], gcdOfAAndB)
            ) {
                result++;
            }

        }

        return result;
    }

    public static boolean factorsOfRemainderAreTheSameOfGCD(int input, int gcdOfAAndB) {
        int factorsNotInGCD = input / gcdOfAAndB;

        while (gcdOfAAndB % factorsNotInGCD != 0){

            int gcd = gcd(gcdOfAAndB, factorsNotInGCD);

            if (gcd == 1)
                return false;

            factorsNotInGCD /= gcd;

        }

        return true;
    }

    public static int gcd(int a, int b) {
        if (a % b == 0){
            return b;
        }

        return gcd(b, a % b);
    }
}


