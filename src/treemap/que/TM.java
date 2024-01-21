package treemap.que;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TM {
	public static void main(String[] args) {
		TreeMap<Integer, String>  tm= new TreeMap<>();
		tm.put(1, "Banyan");
		tm.put(5, "Peepal");
		tm.put(3, "Salla");
		tm.put(4, "Mango");
		tm.put(2, "litchi");
		
		System.out.println("Keys in treemap are sorted naturally");
		for(Integer key: tm.keySet()) {
			System.out.println(key);
		}
		
		Set<Map.Entry<Integer, String>> set= tm.entrySet();
		
		for(Map.Entry<Integer, String> myset: set) {
			System.out.println(myset);
		}
		System.out.println(tm.values());
		
		
		System.out.println(tm.keySet());
		
		
	}

}
