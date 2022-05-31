package com.java11;

public class MethodExcecutionTest {
	public static void main(String[] args) {
		C c = new C();
		c.m1(123.34);
		c.m1(124L);
		c.m1(124);
		System.out.println();
		
		C1 c1 = new C1();
		c1.m1();// CE no parameter
		c1.m1(1,2); //varargs version
		c1.m1(1);
		c1.m1("");// string version
		//c1.m1(null);// string version
	}
	
}

	
class P {
	public void m1(Number n) {
		System.out.println("number");
	}
}

class C extends P {
	public void m1(Integer n) {
		System.out.println("Integer");
	}
}

class P1 {
	void m1(Object... args) {
		System.out.println(" vargs version");
	}

	void m1(Object args) {
		System.out.println(" object version");
	}
}

class C1 extends P1 {
	void m1(String s) {
		System.out.println("string version");
	}
}

