package treemap.que;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Searching {
	public static void main(String[] args) {
		Map<Integer, String> fruits= new TreeMap<>();
		fruits.put(1, "apple");
		fruits.put(2, "banana");
		fruits.put(3, "grapes");
		fruits.put(9, "lemon");
		fruits.put(5, "guava");
		System.out.println(fruits);
		
		System.out.println("search key 9........"+fruits.containsKey(9));
		System.out.println("search value mango........"+fruits.containsValue("mango"));
	}

}
