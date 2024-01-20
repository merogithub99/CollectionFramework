package com.Map.Questions;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class SetViewOfMap {
	public static void main(String[] args) {
		Map<Integer, String> fruits= new HashMap<>();
		fruits.put(1, "apple");
		fruits.put(2, "banana");
		fruits.put(3, "grapes");
		fruits.put(4, "lemon");
		fruits.put(5, "guava");
		System.out.println(fruits);
		
		Set<Map.Entry<Integer, String>>  myset= fruits.entrySet();
		
		for(Map.Entry<Integer, String> set: myset) {
			System.out.println(set.getKey()+":"+set.getValue());
		}
		
		
		

}
}
