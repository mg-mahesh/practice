package com.test;

public class CountFactors {

	public static void main(String[] args) {

		
        
            System.out.println(24 + " has " + count_factors(24) + " factor(s)");
        
	}
	
	public static int count_factors(int N)
    {
        int result = 0;
        final int sqrtN = (int) Math.sqrt(N);
        for (int i = 1; i <= sqrtN; i++)
        {
            if (N % i == 0)
            {
                // We found 2 factors: i and N/i.
                result += 2;
            }
        }
        if (sqrtN * sqrtN == N)
        {
            // We counted sqrtN twice.
            result--;
        }
        return result;
    }

}
