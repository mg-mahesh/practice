package com.test;

public class Nesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "(()(())())";
		int res = solution(str);
		System.out.println(res);

	}

	public static int solution(String S) {
		char[] charArray = S.toCharArray();
		char[] stack = new char[charArray.length];
		int stackSize = 0;
		int result = 0;
		for (int i = 0; i < charArray.length-1; i++) {
			if (charArray[i] == '{' || charArray[i] == '(' || charArray[i] == '[') {
				stack[stackSize++] = charArray[i];
			} else {
				if (stackSize == 0) {
					result = 0;
					break;
				}
				char ch = stack[--stackSize];
				if ((charArray[i] == '}' && ch == '{') || (charArray[i] == ']' && ch == '[')
						|| (charArray[i] == ')' && ch == '(')) {
					continue;
				} else {
					result = 0;
					break;
				}
			}
		}
		return stackSize == 0 ? result : 1;

	}
}
