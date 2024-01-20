package com.Map.Questions;

import java.util.HashMap;
import java.util.Map;

public class RemoveItems {
	public static void main(String[] args) {
		Map<Integer, Integer> hm= new HashMap<>();
		hm.put(1, 100);
		hm.put(2, 200);
		hm.put(10, 300);
		hm.put(4, 400);
		hm.put(5, 500);
		
		System.out.println(hm);
		
		hm.remove(3);
		System.out.println("removing 3:");
		System.out.println(hm);
		
		hm.remove(10);
		System.out.println("removing 10:");
		System.out.println(hm);

	}

}
