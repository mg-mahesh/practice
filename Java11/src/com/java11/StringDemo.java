package com.java11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class StringDemo {

	public static void main(String[] args) throws IOException {

		String str = "  Mahesh  ";
		System.out.println("******************************");
		System.out.println(str.repeat(3));
		System.out.println("******************************");
		System.out.println(str.isBlank());
		System.out.println("******************************");
		System.out.println("".isBlank());
		System.out.println("******************************");
		System.out.println("     ".isBlank());
		System.out.println("******************************");
		System.out.println(str.strip());
		System.out.println("******************************");
		System.out.println(str.stripLeading());
		System.out.println("******************************");
		System.out.println(str.stripTrailing());
		System.out.println("******************************");
		System.out.println(" ".isEmpty());
		System.out.println("******************************");
		System.out.println("".isEmpty());

		System.out.println();
		str = "This\nis\nmulti\nline\ntext";
		List<String> lines = new ArrayList<>();
		str.lines().forEach(line -> lines.add(line));
		lines.forEach(line -> System.out.println(line));

		System.out.println();

		List<String> namesList = Arrays.asList("Mahesh", "Naresh", "Sures");
		// old procedure
		String[] names = namesList.toArray(new String[namesList.size()]);
		System.out.println(names.length);

		names = namesList.toArray(String[]::new);
		System.out.println(names.length);
		
		String name = null;
		System.out.println(!Optional.ofNullable(name).isPresent());
		System.out.println(Optional.ofNullable(name).isEmpty());
		
		name = "Mahesh";
		System.out.println(!Optional.ofNullable(name).isPresent());
		System.out.println(Optional.ofNullable(name).isEmpty());
		
		List<String> branches = Arrays.asList("CSE",  "ECE", " ");
		List<String> branch = branches.stream().filter(Predicate.not(String::isBlank)).collect(Collectors.toList());
		branch.forEach(b -> System.out.println(b));
		
		List<String> namess = Arrays.asList("Mahesh", "Naresh", "Suresh");
		String nn = namess.stream()
				.map(n -> n.toUpperCase())
				.collect(Collectors.joining(", "));
		System.out.println(nn);
		
		Set<String> set = Set.of("A", "B", "C");
		System.out.println(set);
		
		List<String> list = List.of("A", "A", "B", "C");
		System.out.println(list);
		
		Map<String, String> map = Map.of("A", "Apple", "B", "Bat", "C", "Cat");
		System.out.println(map);
		
		Stream.of("a","b","c","","e","f").takeWhile(s->!s.isEmpty())
        .forEach(System.out::print);
		
		System.out.println();
		Stream.of("a","b","c","","e","","f").dropWhile(s-> !s.isEmpty())
        .forEach(System.out::print);
		
		System.out.println();
		
		IntStream.iterate(3,  x -> x < 10, x -> x + 3).forEach(System.out::println);
		
		System.out.println();
		long count = Stream.ofNullable(100).count();
		System.out.println(count);
		
		count = Stream.ofNullable(null).count();
		System.out.println(count);
		
		Reader input = new StringReader("test");
		BufferedReader br = new BufferedReader(input);
		try (BufferedReader br1 = br) {
			System.out.println(br1.readLine());
			
		}

		
	}

}
