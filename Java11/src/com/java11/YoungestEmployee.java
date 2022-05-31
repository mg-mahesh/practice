package com.java11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Random;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class YoungestEmployee {

	public static void main(String[] args) {
		
		List<Employee> empList = Arrays.asList(
				new Employee(111, "XYZ", 45),
				new Employee(222, "ABC", 34),
				new Employee(333, "DEF", 20),
				new Employee(444, "PQR", 27));
		
		Employee youngest = empList.stream().min(Comparator.comparing(Employee::getAge)).get();
		System.out.println(youngest);
		
		System.out.println();
		
		Comparator<Employee> myComparator = Comparator.comparing(Employee::getAge);
		
		Employee minAge = empList.stream().min(myComparator).get();
		System.out.println("Youngest Employee: "+ minAge);
		
		System.out.println();
		Employee maxAge = empList.stream().max(myComparator).get();
		
		System.out.println("Elder Employee: "+ maxAge);
		
		Stream<Integer> randomNumbers = Stream.generate(() -> (new Random()).nextInt(100));
		
		//randomNumbers.limit(20).forEach(System.out::println);
		
		List<Integer> numbers = new ArrayList<>();
		for(int i = 1; i <= 20; i++) {
			numbers.add(i);
		}
		
		Integer[] evenNumbers =numbers.stream().filter(e -> e % 2 == 0).toArray(Integer[]::new);
		System.out.println(evenNumbers.length);
		for(int en : evenNumbers) {
			System.out.print(en + " ");
		}
		
		//nthest age
		System.out.println();
		Optional<Employee> emp = empList.stream().sorted(Comparator.comparing(Employee::getAge)).skip(2).findFirst();
		System.out.println(emp.get());
		
		List<Employee> nthestSal = (List<Employee>) empList.stream().sorted(Comparator.comparing(Employee::getAge).reversed());
		System.out.println(nthestSal.get(2));
		
		//char count
		
		String[] str = {"India","US","India","UK","UK","UAE","US","India","India"};

		Map<String, Long> charCount  = 
		Arrays.asList(str).stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println();
		System.out.println(charCount);
		    
		
		
	}

}



