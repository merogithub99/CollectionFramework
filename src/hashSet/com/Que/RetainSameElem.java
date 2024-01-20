package hashSet.com.Que;

import java.util.HashSet;

public class RetainSameElem {
	public static void main(String[] args) {
		HashSet<String> hashset= new HashSet<>();
		hashset.add("guava");
		hashset.add("banana");
		hashset.add("orange");
		hashset.add("mango");
		System.out.println("first:"+hashset);
		
		HashSet<String> hashset1= new HashSet<>();
		hashset1.add("banana");
		hashset1.add("apple");
		hashset1.add("orange");
		hashset1.add("grapes");
		System.out.println("second:"+hashset1);
		
		hashset.retainAll(hashset1);
		System.out.println(hashset);
		
		
		
	}

}
