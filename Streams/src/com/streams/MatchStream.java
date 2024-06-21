package com.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

public class MatchStream {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(5,10,15,20,25,30,35);
		
		boolean isDivisibleBy5 = numbers.stream().allMatch(element-> element%5==0);
		System.out.println("Are all numbers in array divisible by 5?"+isDivisibleBy5);
		
		// numbers array has at least 1 element which is divisible by 3. So, the below code should return true
		boolean isDivisbleBy3 = numbers.stream().anyMatch(element->element%3==0);
		System.out.println("Are there any numbers in array divisible by 3?"+isDivisbleBy3);
		
		// numbers array has at least 1 element which is divisible by 3. So, the below code should return false
		boolean isDivisibleBy3_2 = numbers.stream().noneMatch(element->element%3==0);
		System.out.println("Does no number"+isDivisibleBy3_2);
		
		// numbers array do not have any number divisible by 11. So, the below code should return true
		boolean isDivisibleBy11 = numbers.stream().noneMatch(element->element%11==0);
		System.out.println(isDivisibleBy11);
		
		// numbers array do not have any number divisible by 11. So, the below code should return false
		boolean isDivisibleBy11_2 = numbers.stream().anyMatch(element->element%11==0);
		System.out.println(isDivisibleBy11_2);
		
		//For empty streams, the allMatch() method with any given predicate will return true:
		System.out.println(Stream.empty().allMatch(Objects::nonNull)); // true
		
		//the anyMatch() method always returns false for empty streams:
		System.out.println(Stream.empty().anyMatch(Objects::nonNull)); // false
		
	}

}
