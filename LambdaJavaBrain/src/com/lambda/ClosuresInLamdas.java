package com.lambda;

public class ClosuresInLamdas {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		// Using the local variable b in the lambda expression.
		Process p = (i) -> System.out.println(b*i);
		p.doProcess(1000);
		
		// when we use the local variable in lambda expression, it cannot be modified 
		// as it is final. Uncomment the b=30; statement to get the error.
		//b = 30;
		//p.doProcess(1000);
	}
	
	

}

interface Process{
	void doProcess(int i);
}
