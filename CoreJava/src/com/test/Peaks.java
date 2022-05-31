package com.test;

import java.util.ArrayList;

public class Peaks {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 3, 4, 1, 2, 3, 4, 6, 2 };
		System.out.println(solution(arr));
	}

	 public static int solution(int[] A) {
	        
	        int N = A.length;
	        
	        ArrayList<Integer> peaksIndices = new ArrayList<>();
	        for(int i = 1; i < N-1; i++){
	            if(A[i-1] < A[i] && A[i] > A[i+1]){ 
	                peaksIndices.add(i);
	            }
	        }
	        
	        for(int numBlocks = N; numBlocks >= 1; numBlocks--){
	                 
	            if( N % numBlocks != 0){
	                continue;
	            } else{   
	            
	                int blockSize = N / numBlocks; 
	                int numBlocksWithPeak = 0;  

	                for(int peaksIndex : peaksIndices){
	                    if( (int)(peaksIndex/blockSize) == numBlocksWithPeak){ 
	                        numBlocksWithPeak++;
	                    }else{
	                        continue;
	                    }
	                }   
	                
	                if(numBlocksWithPeak == numBlocks){
	                    return numBlocks;
	                }
	            }
	        }   
	        return 0;
	    }

}
