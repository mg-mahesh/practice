package com.test;

import java.util.ArrayList;
import java.util.List;

public class CountSemiprimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int[] solution(int N, int[] P, int[] Q) {

        Integer[] primes = sieve(N/2+1);

        int[] temp = new int[N+1];
        for (int i = 0; i < primes.length; i++) {
            for (int j = 0; j < primes.length; j++) {
                int semiPrime = primes[i] * primes[j];
                if(semiPrime <= N)
                    temp[semiPrime] = 1;
            }
        }

        int[] prefix = new int[N+1];
        for (int i = 1; i < temp.length; i++) {
            prefix[i] = temp[i] + prefix[i-1];
        }

        int[] retVal = new int[P.length];
        for (int i = 0; i < retVal.length; i++) {
            retVal[i] = prefix[Q[i]] - prefix[P[i]-1];
        }

        return retVal; 
    }


    public Integer[] sieve(int n) {

        boolean[] temp = new boolean[n+1];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = true;
        }
        temp[0] = temp[1] = false;

        int i = 2;
        while (i * i <= n) {
            removeProducts( temp, i );
            i++;
        }

        List<Integer> ret = new ArrayList<>();
        for (int j = 0; j < temp.length; j++) {
            if(temp[j])
                ret.add( j );
        }

        return ret.toArray( new Integer[ret.size()] );
    }

    private void removeProducts(boolean[] temp, int i) {
        for (int j = i*i; j < temp.length; j++) {
            if(temp[j] && j % i == 0) {
                temp[j] = false;
            }
        }
    }

}
