package com.test;

public class MinFrag {

	public static void main(String[] args) {
		System.out.println(solution(10, 85,	30));
	}
	
	 public static int solution(int X, int Y, int D) {
	        if (X >= Y) return 0;

	        if (D == 0) return -1;

	        int minJump = 0;

	        if ((Y - X) % D == 0) {
	            minJump = (Y - X) / D;
	        } else minJump= (Y - X) / D +1;

	        return minJump;
	    }
}
