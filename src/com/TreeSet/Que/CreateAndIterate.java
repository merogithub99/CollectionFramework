package com.TreeSet.Que;

import java.util.TreeSet;

public class CreateAndIterate {
	public static void main(String[] args) {
		TreeSet<String>  colors= new TreeSet<>();
		colors.add("red");
		colors.add("orange");
		colors.add("blue");
		colors.add("green");
		colors.add("grey");
		
		int i=1;
		for(String color: colors) {
			System.out.println((i++)+":"+color);
		}
		
	}

}
