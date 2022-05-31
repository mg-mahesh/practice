package com.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test1 {

	public static void main(String[] args) {
		
		List<Integer> intList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		//intList.stream().;
		Collections.sort(intList);
		System.out.println(intList.get(intList.size()-2));
		
		int secondLargest = intList.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
		
		System.out.println(secondLargest);
		int max = intList.stream().max(Comparator.comparing(Integer::valueOf)).get();
		
		//To upper case first letter in a word
		String str = "this is technical discussion";
        String words[]=str.split("\\s");
        String capitalizeStr="";
 
        for(String word:words){
            // Capitalize first letter
            String firstLetter=word.substring(0,1);
            // Get remaining letter
            String remainingLetters=word.substring(1);
            capitalizeStr+=firstLetter.toUpperCase()+remainingLetters+" ";
        }
        System.out.println(capitalizeStr);
        
        
        // to count frequency of each element
        
        List<String> list = Arrays.asList("B", "A", "A", "C", "B", "A",  "A");
        
        
        Map<String, Long> countingMap = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        
        System.out.println(countingMap);
        
        int n = 3;
        int sum = 0;

        for(int i =1; i<= n; i++){
          for(int j = 1; j<=n; j++){
          	System.out.print(i + "/"+ j); System.out.print(",");
          	sum += j;
          	
          }
          
        }
        System.out.println();
        System.out.println(sum);

	}

}

