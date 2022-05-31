package com.java11;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java9Strean {

	public static void main(String[] args) {
		
		List<Optional<String>> list = Arrays.asList(Optional.empty(),
				Optional.of("A"),
				Optional.empty(),
				Optional.of("B"));
		
		List<String> filteredList = list.stream()
				.flatMap(o -> o.isPresent() ? Stream.of(o.get())
						: Stream.empty()).collect(Collectors.toList());
		
		
		System.out.println(filteredList);
		
		List<String> filteredListJava9 = list.stream()
				.flatMap(Optional::stream).collect(Collectors.toList());
		System.out.println(filteredListJava9);
		System.out.println();
		
		Optional<Integer> optional = Optional.of(10);
		optional.ifPresentOrElse(x -> System.out.println("Value: " + x), 
				() -> System.out.println("Not Present"));
		System.out.println("**********************************************");
		Optional<String> optional1 = Optional.of("Mahesh");
		Supplier<Optional<String>> supplierString = () 
				-> Optional.of("Not Present");
				optional1 = optional1.or(supplierString);
				optional1.ifPresent(x -> System.out.println("Value: " + x));
				optional1 = Optional.empty();
				optional1 = optional1.or(supplierString);
				optional1.ifPresent(x -> System.out.println("Value: " + x));

				
				Runnable r1 = () -> {
					System.out.println("runnable");
				};
		
	}

}
