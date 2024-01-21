package treemap.que;

import java.util.TreeMap;

public class Delete {
	public static void main(String[] args) {
		TreeMap<String, Integer> tree = new TreeMap<>();
		tree.put("hello", 1);
		tree.put("Hye", 2);
		tree.put("Morning", 5);
		tree.put("Lasso", 99);
		tree.put("Namaskar", 10);

		System.out.println(tree);

		TreeMap<Integer, String> map = new TreeMap<>();
		map.put(1, "ball");
		map.put(1, "cat");
		map.put(3, "dog");
		System.out.println(map);

		System.out.println("first key of map:" + map.firstKey());
		System.out.println(" first key of tree:" + tree.firstKey());
		System.out.println(map.firstEntry());
		tree.clear();
		System.out.println("After clearing");
		System.out.println(tree);

	}

}
