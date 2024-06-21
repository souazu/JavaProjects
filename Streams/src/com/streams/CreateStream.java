package com.streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class CreateStream {

	public static void main(String[] args) {
		//1.Creating an empty stream
		System.out.println("Creating an empty stream");
		Stream<Integer> emptyStream =  Stream.empty();
		emptyStream.forEach(System.out::println);
		// Usage of empty stream
		List<Integer> emptyList = new ArrayList<Integer>();
		Stream<Integer> emptystream = (emptyList==null || emptyList.isEmpty())? Stream.empty():emptyList.stream(); 
		
		//2. Creating list from Array
		System.out.println("Creating stream from an array");
		Integer[] intArr = {18,28,38,25};
		//Creating a stream from an array
		Stream<Integer> intstream = Arrays.stream(intArr);
		intstream.forEach(System.out::println);
		
		//3. Using stream.of to create a stream
		System.out.println("Creating stream using stream.of");
		Stream<String> daysStream = Stream.of("Mon", "Tue", "Fri");		
		daysStream.forEach(System.out::println);
		
		//4.Creating a stream using collection.
		System.out.println("Creating stream from a collection");
		List<String> nameList = new ArrayList<>(Arrays.asList("John","Mary","Kevin"));
		Stream<String> nameStream = nameList.stream();
		nameStream.forEach(System.out::println);
		
		//5.Creating a stream using Stream.builder()
		System.out.println("Creating stream using a stream builder");
		Stream<String> builderStream = Stream.<String>builder().add("Apple").add("Banana").add("Watermelon").build();
		builderStream.forEach(System.out::println);
		
		//6.Creating a stream using Stream.generate()
		// generate() method takes Supplier<T> for element generation
		// a size must be mentioned, else, the resulting stream will be infinite.
		System.out.println("Creating a stream using a Stream.generate()");
		Stream<String> dayStream = Stream.generate(()->"day").limit(5);
		dayStream.forEach(System.out::println);
		
		//7.Creating a stream using Stream.iterate()
		//first element of the resulting stream is the first parameter of the iterate() method.
		System.out.println("Creating a stream using Stream.iterate()");
		Stream<Integer> streamIterate =  Stream.iterate(40, n->n+2).limit(5);
		streamIterate.forEach(System.out::println);
		
		//8. Creating a stream of primitives
		System.out.println("Creating a stream of primitives");
		IntStream intStream = IntStream.range(1, 8);
		intStream.forEach(System.out::println);
		
		//rangeClosed - the upper bound is also included
		System.out.println("Creating a stream of primitives with rangeClosed");
		LongStream longStream = LongStream.rangeClosed(1, 8);
		longStream.forEach(System.out::println);
		
		//Random
		System.out.println("Creating a stream of Integer using Random");
		Random random = new Random();
		IntStream randomStream = random.ints(8);
		randomStream.forEach(System.out::println);
		
		//9.Java NIO class Files allows us to generate a Stream<String> of a text file through the lines() method. 
		//Every line of the text becomes an element of the stream: 
		System.out.println("Creating a stream of Strings from a file");
		Path path = Paths.get("D:\\Soumya-Work\\Baeldung\\Streams\\src\\com\\streams\\readme.txt");
		try {
			Stream<String> streamOfStrings = Files.lines(path);
			streamOfStrings.forEach(System.out::println);
			streamOfStrings.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
