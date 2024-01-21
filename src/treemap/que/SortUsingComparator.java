package treemap.que;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class SortUsingComparator {
	public static void main(String[] args) {
		Map<String, Integer> treeMap = new TreeMap<>(new CustomComparator());

		treeMap.put("Banana", 5);
		treeMap.put("Apple", 3);
		treeMap.put("Orange", 8);
		treeMap.put("Grapes", 2);

		System.out.println("Original TreeMap: " + treeMap);

		System.out.println("Sorted TreeMap Keys:");
		for (String key : treeMap.keySet()) {
			System.out.println(key + ": " + treeMap.get(key));
		}
	}

	static class CustomComparator implements Comparator<String> {
		@Override
		public int compare(String key1, String key2) {
			return key2.compareTo(key1);
		}
	}

}
