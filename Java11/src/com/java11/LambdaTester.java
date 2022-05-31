package com.java11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * @author mgedepud
 *
 */
public class LambdaTester {

	public static void main(String[] args) {
		
		//Lambda expressions are used primarily to define in line implementation of a functional interface
		//i.e., an interface with a single abstract method only.
		// Using Lambda expression we can refer any final variable
		// Lambda expression throws a compile time error, if a variable is assigned a value the second time.

		GreetingService gs1 = (message) -> System.out.println("Hello " + message);
		GreetingService gs2 = message -> System.out.println("Hello " + message);
		gs1.sayMessage("Mahesh");
		gs2.sayMessage("Good Morning");

		MathOperation add = (a, b) -> a + b;
		MathOperation sub = (int a, int b) -> {
			return a - b;
		};
		MathOperation multiply = (a, b) -> a * b;
		MathOperation div = (int a, int b) -> a / b;

		LambdaTester tester = new LambdaTester();
		System.out.println("10 + 5 = " + tester.operate(10, 5, add));
		System.out.println("10 - 5 = " + tester.operate(10, 5, sub));
		System.out.println("10 * 5 = " + tester.operate(10, 5, multiply));
		System.out.println("10 / 5 = " + tester.operate(10, 5, div));

		
		//Method references help to point to methods by their names, is described usinf :: symbol
		// A method reference can be used to point the below types of methods
		// 1. Static Methods
		// 2. Instance Methods
		// 3. COnstructors using new operator (TreeSet::new)
		
		System.out.println("********************************************");
		List<String> names = new ArrayList<>();
		names.add("Mahesh");
		names.add("Naresh");
		names.add("Suresh");
		names.add("Rupesh");
		names.forEach(System.out::println);
		System.out.println("*************************************************");
		
		// Functional interfaces have a single functionality to exhibit.
		//Predicate<T> interface is a functional interface with a method test(Object) to return a Boolean value
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);
		System.out.println("Print all numbers:");
		eval(numbers, n -> true);
		System.out.println("Print even numbers:");
		eval(numbers, n -> n % 2 == 0);
		System.out.println("Print numbers greater than 3:");
		eval(numbers, n -> n > 3);
		System.out.println("***********************************************");
	}
	
	public static void eval(List<Integer> list, Predicate<Integer> predicate) {
		for(Integer n : list) {
			if(predicate.test(n)) {
				System.out.print(n + " ");
			}
		}
		System.out.println();
	}

	public int operate(int a, int b, MathOperation operation) {
		return operation.operation(a, b);
	}
	

}
