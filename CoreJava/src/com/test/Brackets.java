package com.test;

import java.util.ArrayDeque;
import java.util.Deque;

public class Brackets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(solution("([)()]"));

	}
	
	public static  int solution(String S) {
        Deque<Character> stack = new ArrayDeque<Character>();

        for(int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);

            switch (c) {
                case ')':
                    if (stack.isEmpty() || stack.pop() != '(')
                        return 0;
                    break;
                case ']':
                    if (stack.isEmpty() || stack.pop() != '[')
                        return 0;
                    break;
                case '}':
                    if(stack.isEmpty() || stack.pop() != '{')
                        return 0;
                    break;
                default:
                    stack.push(c);
                    break;
            }
        }

        return stack.isEmpty() ? 1 : 0;
    }

}
