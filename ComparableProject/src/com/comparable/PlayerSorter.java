package com.comparable;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PlayerSorter {

	public static void main(String[] args) {
		List<Player> list = Arrays.asList(
				new Player(12,"John",30),
				new Player(10,"Tom",25),
				new Player(14,"Lee",27)
				);
		System.out.println("Before sorting:"+list);
		Collections.sort(list);
		System.out.println("After sorting:"+list);
		
		System.out.println("Before sorting age wise:"+list);
		Collections.sort(list, new AgeComparator());
		System.out.println("After sorting age wise:"+list);
		
		
		System.out.println("Before sorting name wise:"+list);
		Collections.sort(list, new NameComparator());
		System.out.println("After sorting name wise:"+list);
	}

}
