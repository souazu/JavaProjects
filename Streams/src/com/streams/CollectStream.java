package com.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectStream {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(10,15,20);
		List<Integer> thriceNumberlist = numbers.stream().map(element->element*3).collect(Collectors.toList());
		
		System.out.println("Original number list");
		numbers.stream().forEach(System.out::println);
		System.out.println("Modified number list");
		thriceNumberlist.stream().forEach(System.out::println);
		

	}

}
