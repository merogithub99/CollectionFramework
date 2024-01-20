package com.Map.Questions;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class CollectionviewOFMap {
	public static void main(String[] args) {
		Map<Integer, String> fruits= new HashMap<>();
		fruits.put(1, "apple");
		fruits.put(2, "banana");
		fruits.put(3, "grapes");
		fruits.put(9, "lemon");
		fruits.put(5, "guava");
		System.out.println(fruits);
		
		Collection<String> myFruit=fruits.values();
		System.out.println(myFruit);
		
		for(int i=0;i<fruits.size();i++) {
			System.out.println(fruits.get(i+1));
		}
	}

}
