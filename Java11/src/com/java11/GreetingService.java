package com.java11;

@FunctionalInterface
public interface GreetingService {
	
	void sayMessage(String message);
	
	default void print() {
		System.out.println("Say Hi");
	}
	
	//Stream is a new abstract layer, used to process data in a declarative way
	// Stream represents a sequence of objects from a source, which supports aggregate operations
	// sequence of elements
	// source
	// aggregate operations
	// pipelining
	//automatic iterations
	
	/**
	 * generating streams 1. stream(), 2. parallelStream()
	 * forEach() used to iterate each element of the stream
	 * Random random = new Random();
	 * random.ints().limit(10).forEach(System.out::print);
	 
	 * map() used to map each element to its corresponding result
	 * List<Integer> numbers = Arrays.asList(3,2,2,3,7,3,5);
	 * List<Integer> squareList = numbers.stream().map(i -> i * i).distinct().collect(Collectors.toList();
	 * 
	 * 
	 * filter() -> is used to eliminate elements based on a criteria.
	 * 
	 * List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");
	 * int count = strings.stream().filter(string -> string.isEmpty()).count();
	 * 
	 * limit() -> used to reduce the size of the stream
	 * 
	 */

}
