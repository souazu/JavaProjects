package com.lambda.collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import com.lambda.Person;

public class CollectionIterationExample {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("Charles","Dickens",60),
				new Person("Om","Henry",40),
				new Person("William","Shakespeare",58),
				new Person("Carolyne","Bronson",39),
				new Person("Tom","Hanks",53)
				);
		// Using for loop and using indices to access the element
		for(int i=0;i<people.size();i++)
			System.out.println(people.get(i));
		
		// Using for loop in Java 7
		for(Person p: people)
			System.out.println(p);
		//Using foreach
		people.forEach(p->System.out.println(p));
		
	}

}
