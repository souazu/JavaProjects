package com.linkedlist;

import java.util.LinkedList;

// find function takes O(n)

public class LinkedListImpl {

	public static void main(String[] args) {
		// Create a linked list
		LinkedList<String> fruitlist = new LinkedList<>();
		
		// Add elements 
		fruitlist.add("Apple");
		fruitlist.add("Banana");
		fruitlist.add("Orange");
	/*	fruitlist.add("Watermelon");
		fruitlist.add("Papaya");
		fruitlist.add("Pomegranate");
		fruitlist.add("Guava");
		fruitlist.add("Mango"); */
		
		//Iterating over the list
		System.out.println(fruitlist.getFirst());
		System.out.println(fruitlist.getLast());
		System.out.println("Size of list:"+fruitlist.size());
		
		// Peek method
		System.out.println(fruitlist.peek());
		System.out.println("Before poping:"+fruitlist.size());
		// Pop method
		System.out.println(fruitlist.pop());
		System.out.println("After poping:"+fruitlist.size());
		System.out.println("Adding element Plum to the first:");
		
		// Adding as the first element
		fruitlist.addFirst("Plum");
		System.out.println("Adding element Rambutan to the last:");
		
		//Adding to the last of the list
		fruitlist.addLast("Rambutan");
		System.out.println(fruitlist);
		
		// Removing the last element of the list
		fruitlist.removeLast();
		System.out.println(fruitlist);
		
		// Removing the first element of the list
		fruitlist.removeFirst();
		System.out.println(fruitlist);
		
		// Using poll
		System.out.println("Using poll:"+fruitlist.poll());
		System.out.println(fruitlist);
		
		// Again using poll will give null
		System.out.println("Using poll:"+fruitlist.poll());
		System.out.println("Using poll:"+fruitlist.poll());
		System.out.println(fruitlist);
		
		// Push pushes first element to the beginning of the list
		fruitlist.push("Apple");
		fruitlist.push("Banana");
		System.out.println(fruitlist);
		
		// Using pop to remove - pop on an empty list will give noelementexception
		fruitlist.pop();
		fruitlist.pop();
	//	fruitlist.pop();
	//	System.out.println(fruitlist);
		
		fruitlist.push("Apple");
		fruitlist.push("Banana");
		fruitlist.push("Orange");
		fruitlist.push("Apple");
		fruitlist.push("Banana");
		System.out.println(fruitlist);
		
		fruitlist.removeFirstOccurrence("Apple");
		System.out.println(fruitlist);
		
		fruitlist.removeLastOccurrence("Banana");
		System.out.println(fruitlist);
	}

}
