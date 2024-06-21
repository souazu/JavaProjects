package com.comparable;

import java.util.Comparator;

public class AgeComparator implements Comparator<Player> {

	@Override
	public int compare(Player o1, Player o2) {
	
		return Integer.compare(o1.getAge(), o2.getAge());
	}

}
