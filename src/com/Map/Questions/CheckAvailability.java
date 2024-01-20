package com.Map.Questions;

import java.util.HashMap;
import java.util.Map;

public class CheckAvailability {
	public static void main(String[] args) {
		Map<Integer, Integer> hm= new HashMap<>();
		hm.put(1, 100);
		hm.put(2, 200);
		hm.put(3, 300);
		hm.put(4, 400);
		hm.put(5, 500);
		hm.put(6, 100);
		hm.put(4, 500);
		hm.put(1, 200);
		
		System.out.println(hm);
		
		System.out.println("key 1?????    "+hm.containsKey(1));
		System.out.println("Value 200:?????   "+hm.containsValue(200));
		
	}

}
