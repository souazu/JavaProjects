package com.comparable;

import java.util.Comparator;

public class NameComparator implements Comparator<Player> {

	@Override
	public int compare(Player arg0, Player arg1) {
		return arg0.getName().compareTo(arg1.getName());
	}

}
