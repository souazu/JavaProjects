package com.lambda;

import java.util.function.BiConsumer;

public class ExceptionHandlingLambda {

	public static void main(String[] args) {
		int numbers[] = {1,2,3,4};
		int key =2;
		
		process(numbers,key,(i,j)-> System.out.println(i+j));
		
		// this block of code results in an exception
		/*key = 0;
		process(numbers,key,(i,j)-> System.out.println(i/j));
		*/
		
		// Catching it with exception
		key = 0;
		process(numbers,key,(i,j)-> {
			try {
				System.out.println(i/j);
			}catch(ArithmeticException e) {
				System.out.println("Arithmetic exception occurred");
			}
		});
		
	}

	private static void process(int[] numbers, int key, BiConsumer<Integer, Integer> consumer) {
		for(int i:numbers) {
			consumer.accept(i, key);
		}
	}

}
