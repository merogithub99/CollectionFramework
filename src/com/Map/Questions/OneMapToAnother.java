package com.Map.Questions;

import java.util.HashMap;
import java.util.Map;

public class OneMapToAnother {
	public static void main(String[] args) {
		Map<Integer, Integer> hm= new HashMap<>();
		hm.put(1, 100);
		hm.put(2, 200);
		hm.put(3, 300);
		hm.put(4, 400);
		hm.put(5, 500);
		
		System.out.println(hm);
		
		Map<Integer, Integer> hm2= new HashMap<>(hm);
		
		System.out.println(hm2);
		hm2.put(6, 600);
		System.out.println("updated hm2:"+hm2);
		
		
		

		
	}

}
