package com.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
	

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
			Collections.sort(people, ( p1,  p2) -> p1.getFirstName().compareTo(p2.getFirstName()));		// Step 2
			printCondition(people, p -> true);
			// Step 3:
			printCondition(people, p -> p.getFirstName().startsWith("C"));
			
			Predicate<String> predicate = (s) -> s.startsWith("H");
			System.out.println(predicate.test("Haniel"));
			
		}

		private static void printCondition(List<Person> people, Predicate<Person> condition) {
			for(Person p: people) {
				if(condition.test(p)) {
					System.out.println(p);
				}
			}
			
		}
}
