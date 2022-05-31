package com.test;

public class CountingDivision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solution(6,11,2));

	}
	
	 public static int solution(int A, int B, int K) {        
         int start=0;
         if (B<A || K==0 || K>B )
            return 0;
         else if (K<A)
            start = K * ( A/K +1);
         else if (K<=B)
            start = K;

         return (B-start+1)/K+ 1;
    }

}
