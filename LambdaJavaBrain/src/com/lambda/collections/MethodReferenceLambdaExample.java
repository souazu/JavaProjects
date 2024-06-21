package com.lambda.collections;

public class MethodReferenceLambdaExample {
	public static void main(String[] args) {
		Thread t = new Thread(()->printMessage());
		t.start();
		// Using method reference
		Thread t1 = new Thread(MethodReferenceLambdaExample::printMessage);
		t1.start();
	}
	private static void printMessage() {
		System.out.println("Hello Method");
	}
}
