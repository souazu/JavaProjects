package com.streams;

import java.util.Arrays;
import java.util.List;

public class ReductionStream {

	public static void main(String[] args) {
		//This method takes two parameters: first – start value, second – an accumulator function.
		//Imagine that you have a List<Integer> and you want to have a sum of all these elements and some initial Integer (in this example 23)
		List<Integer> numbers = Arrays.asList(10,15,20);
		
		Integer reduce = numbers.stream().reduce(23,(a,b)->a+b);
		
		System.out.println("Total sum:"+reduce);
		
		//To find sum of all the integers in the list
		Integer sum = numbers.stream().reduce(0, (a,b)->a+b);
		System.out.println(sum);
		
	}

}
