package com.test;

import java.util.Arrays;

public class CyclicRotaion {

	public static void main(String[] args) {
		
		int[] arr = {3, 8, 9, 7, 6};
		
		System.out.println(solution(arr, 3));
	}
	
	public static int[] solution (int[] arr, int K){

        int firstElement = 0;

        int[] result = arr;

        int x = 0;

        

        while (x < K && x < arr.length){

        	firstElement = result[result.length - 1];

            Arrays.copyOfRange(result, 0, result.length);

            result = Arrays.copyOf(result, result.length);

            System.arraycopy(result, 0, result, 1, result.length - 1);

            result[0] = firstElement;

            System.err.println( x + " : " + Arrays.toString(result) + " - " + firstElement);

            x++;

        }

        return result;

    }

}
