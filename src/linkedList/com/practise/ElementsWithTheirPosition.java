package linkedList.com.practise;

import java.util.LinkedList;

public class ElementsWithTheirPosition {
	public static void main(String[] args) {
	LinkedList<String>  fruitList= new LinkedList<>();
	fruitList.add("apple");
	fruitList.add("banana");
	fruitList.add("orange");
	fruitList.add("pineapple");
	
//	for(Integer fruits: fruitList) {
//		System.out.println(fruitList.get);
//	}
	
	for(int i=0; i<fruitList.size();i++) {
		System.out.println((i+1)+"st Position"+ ":" +fruitList.get(i));
	}
	
	
	}

}
