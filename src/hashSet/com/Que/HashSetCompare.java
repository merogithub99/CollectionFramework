package hashSet.com.Que;

import java.util.HashSet;

public class HashSetCompare {
public static void main(String[] args) {
	HashSet<String> hashset= new HashSet<>();
	hashset.add("String");
	hashset.add("Number");
	hashset.add("Alphabets");
	hashset.add("Character");
	System.out.println(hashset);
	
	HashSet<String> hashset1= new HashSet<>();
	hashset1.add("banana");
	hashset1.add("apple");
	hashset1.add("orange");
	System.out.println(hashset1);
	System.out.println("these hash set equals?"+hashset.containsAll(hashset1));
	
	
	
	
	

	
}
}
