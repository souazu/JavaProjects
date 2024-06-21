package com.lambda;

public class LambdaExpressions {

	public static void main(String[] args) {
		
		// Types of Lambda expression
		Greeting greetingFunction = () -> System.out.println("Hello World");
		DoubleNumber doubleFunction = (int n) -> n*2;
		AddInterface addFunction = (int a, int b) -> a+b;
		/*safeDivideFUnction = (int a, int b) -> {
			if(b==0) return 0;
			else return a/b;
		};*/
		StringLengthLambda stringLength = s -> s.length();
		
		// To create a lambda expression, create a interface containing a method with the same arguments 
		// as that of the lambda expression
		// Declare the interface as Type of the LamdaExpression in the executing class
		// If there is already a interface with a single method with the same argument and return type, we can use that as well
		// REMEMBER: Lambda expression interface should have only a single method with the same signature  as that of the lamda expression.
		
		// to execute lambda expression:
		greetingFunction.foo();
		System.out.println(doubleFunction.doubleNum(12));
		DoubleNumber impl = new DoubleNumberImpl();
		System.out.println(impl.doubleNum(12));
		System.out.println(stringLength.getLength("Hello World"));
		
		printStringLength(s->s.length());
		
		}
	public static void printStringLength(StringLengthLambda arg){
	    System.out.println(arg.getLength("Hello LambdaEx"));
	  }

}


interface Greeting{
	void foo();
}

interface AddInterface{
	int add(int a, int b);
}

interface StringLengthLambda {
	int getLength(String s);
}