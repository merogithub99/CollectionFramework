package treemap.que;

import java.util.Map;
import java.util.NavigableSet;
import java.util.TreeMap;

import treemap.que.SortUsingComparator.CustomComparator;

public class NavigableSetView {
	public static void main(String[] args) {
		TreeMap<String, Integer> treeMap = new TreeMap<>(new CustomComparator());

		treeMap.put("Banana", 5);
		treeMap.put("Apple", 3);
		treeMap.put("Orange", 8);
		treeMap.put("Grapes", 2);
		
		NavigableSet<String> navigableKeySet=treeMap.navigableKeySet();
		
		for(String keySet: navigableKeySet) {
			System.out.println(keySet);
		}
		
		System.out.println(navigableKeySet);
		System.out.println(navigableKeySet.ceiling("ban"));
	}

}
