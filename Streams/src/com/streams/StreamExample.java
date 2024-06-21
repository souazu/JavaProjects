package com.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(2,4,6,8,10,12,14,16,18,20);
		numbers.stream().forEach(System.out::println);
		System.out.println("Skipping two elements in the beginning");
		numbers.stream().skip(2).forEach(System.out::println);
		
		System.out.print("Collecting numbers that are both divisible by 2&3");
		// map - modifies the values of the stream
		List<Integer> output = numbers.stream().skip(1)
		.map(e->e/2)
		.collect(Collectors.toList());
		System.out.println("\nElements of the list divided by 2:"+output);
		
		//filter - filters out based on the condition.
		//For example, based on the condition if the element is divisible by 2 & 3
		//the stream is filtered stream only contains those elements that are both divisible by 2 &3
		output = numbers.stream().skip(1)
				.filter(ele-> (ele%2==0 && ele%3==0))
				.collect(Collectors.toList());
		System.out.println("Get all elements divisbile by 2 & 3:"+output);
		
		

	}

}
