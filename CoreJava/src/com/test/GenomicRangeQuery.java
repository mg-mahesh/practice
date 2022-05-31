package com.test;

public class GenomicRangeQuery {
	
	public static void main(String[] args) {
		String str = "GGGGGG";
		int[] P = {2,5,0};
		int[] Q = {4,5,6};
		int[] res = solution(str, P, Q);
		for(int i : res) {
			System.out.print(i + " ");
			
		}
	}

	public static int[] solution(String S, int[] P, int[] Q) {
        final  char c[] = S.toCharArray();
        final int answer[] = new int[P.length];
        int tempAnswer;
        char tempC;

        for (int iii = 0; iii < P.length-1; iii++) {
            tempAnswer = 4;
            for (int zzz = P[iii]; zzz <= Q[iii]; zzz++) {
                tempC = c[zzz];
                if (tempC == 'A') {
                    tempAnswer = 1;
                    break;
                } else if (tempC == 'C') {
                    if (tempAnswer > 2) {
                        tempAnswer = 2;
                    }
                } else if (tempC == 'G') {
                    if (tempAnswer > 3) {
                        tempAnswer = 3;
                    }

                }
            }
            answer[iii] = tempAnswer;
        }

        return answer;
    }
}
