package com.lambda;

public class RunnableLambda {
	public static void main(String[] args) {
		Thread myThread = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("In the run method of the Runnable interface");
			}
		});
		myThread.run();
		Thread myLambda = new Thread(()-> System.out.println("In the lambda expression"));
		myLambda.run();
	}
}
