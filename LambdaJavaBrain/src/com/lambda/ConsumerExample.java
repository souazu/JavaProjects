package com.lambda;

import java.util.function.Consumer;

public class ConsumerExample {

	public static void main(String[] args) {
		Consumer<Integer> consumer = i -> System.out.println("value of i:"+i);;  
		consumer.accept(1000);
		
		Consumer<String> consumerStr = s -> System.out.println("value of s:"+s);;  
		consumerStr.accept("Hello Functional interface");

	}

}
