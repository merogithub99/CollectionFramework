package treemap.que;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class GetAllKey {
	public static void main(String[] args) {
		Map<Integer, Integer> tm = new TreeMap<>();
		tm.put(1, 100);
		tm.put(2, 200);
		tm.put(10, 300);
		tm.put(4, 400);
		tm.put(5, 500);
		System.out.println(tm);

		System.out.println("keys are:");
		System.out.println(tm.keySet());
		System.out.println("values are:");
		System.out.println(tm.values());

	}

}
