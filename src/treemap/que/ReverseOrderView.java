package treemap.que;

import java.util.TreeMap;

public class ReverseOrderView {
	public static void main(String[] args) {
		TreeMap<Integer, String> tm = new TreeMap<>();
		
		
		
		tm.put(1, "Banyan");
		tm.put(5, "Peepal");
		tm.put(3, "Salla");
		tm.put(4, "Mango");
		tm.put(2, "litchi");
		System.out.println(tm);
		
		System.out.println("using Descending map:");
		
		System.out.println("keys are :"+tm.descendingKeySet());

		TreeMap<Integer, String> tm1 = new TreeMap<>(tm.descendingMap());
		
		System.out.println(tm1);
		
		
		
		

	}

}
