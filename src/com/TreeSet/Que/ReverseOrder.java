package com.TreeSet.Que;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class ReverseOrder {
	public static void main(String[] args) {
		TreeSet<Integer> myset= new TreeSet<>();
		myset.add(1);
		myset.add(2);
		myset.add(3);
		myset.add(4);
		myset.add(5);
		
		System.out.println(myset);

		System.out.println(myset.descendingSet());	
		
		
		Set<Integer> myset1= myset.descendingSet();
		System.out.println(myset1);

	
		
	}

}
