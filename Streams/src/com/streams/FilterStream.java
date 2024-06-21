package com.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FilterStream {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(9,10,12,15,17,18,15,21,27,17,19,21, 27,28,30,31);
		
		List<Integer> subList = list.subList(3, list.size());
		System.out.println(subList);
		
		
		// A simple stream which prints the numbers of the list
		list.stream().forEach(System.out::println);;
		
		// the stream uses a lambda expression to filter elements divisible by 3,
		// gets the distinct elements
		// and prints them	
		list.stream()
		.filter(element->(element%3)==0)
		.distinct()
		.forEach(System.out::println);
		
	}

}
