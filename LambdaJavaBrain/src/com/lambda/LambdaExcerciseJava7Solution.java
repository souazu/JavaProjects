package com.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaExcerciseJava7Solution {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("Charles","Dickens",60),
				new Person("Om","Henry",40),
				new Person("William","Shakespeare",58),
				new Person("Carolyne","Bronson",39),
				new Person("Tom","Hanks",53)
				);
		
		//Step 1: Sort list by first name
		// Step 2: Create a method that prints all the elements in the list
		// Step 3: Create a method that prints all the people whose first name starts with C
		
		// Step 1:
		Collections.sort(people, new Comparator<Person>(){

			@Override
			public int compare(Person o1, Person o2) {
				return o1.getFirstName().compareTo(o2.getFirstName());
			}
			
		});
		// Step 2
		printAll(people);
		// Step 3:
		printCondition(people, new Condition() {

			@Override
			public boolean testCondition(Person p) {
				return p.getFirstName().startsWith("C");
			}
			
		});
		
	}

	private static void printCondition(List<Person> people, Condition condition) {
		for(Person p: people) {
			if(condition.testCondition(p)) {
				System.out.println(p);
			}
		}
		
	}

	private static void printAll(List<Person> people) {
		for(Person p: people)
		{
			System.out.println(p);
		}
	}
	
}

interface Condition{
	boolean testCondition(Person p);
}
