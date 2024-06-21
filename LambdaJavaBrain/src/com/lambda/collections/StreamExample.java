package com.lambda.collections;

import java.util.Arrays;
import java.util.List;

import com.lambda.Person;

public class StreamExample {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("Charles","Dickens",60),
				new Person("Om","Henry",40),
				new Person("William","Shakespeare",58),
				new Person("Carolyne","Bronson",39),
				new Person("Tom","Hanks",53)
				);
		
		people.stream().filter(p -> p.getFirstName().startsWith("C")).forEach(System.out::println);

	}

}
