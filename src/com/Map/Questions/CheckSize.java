package com.Map.Questions;

import java.util.HashMap;
import java.util.Map;

public class CheckSize {
	public static void main(String[] args) {
Map<Integer, String> hm= new HashMap<>();
		
		hm.put(1, "Sushant");
		hm.put(2, "Kamal");
		hm.put(3, "Sashita");
		hm.put(4, "Sarala");
		hm.put(5, "Rohit");
		hm.put(6, "Prerana");
		hm.put(7, "Rajendra");
		hm.put(8, "Gyanu");
		System.out.println("Key:value=>"+hm);
		
		System.out.println("Size of my family:"+hm.size());
	}

}
