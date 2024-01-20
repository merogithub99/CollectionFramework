package linkedList.com.practise;

import java.util.LinkedList;

public class AddAtRandomPosition {
	public static void main(String[] args) {
		LinkedList<String> ll= new LinkedList<>();
		ll.add("sandhya");
		ll.add("ganesh");
		ll.add("rita");
		ll.add("gyani");
		ll.add("ShivaMaya");
		
		System.out.println(ll);
		
		System.out.println("Adding lama at random(second) position");
		
		ll.add(1, "lama");
		
		System.out.println(ll);
		
		System.out.println("subList:   "+ll.subList(1, 3));
	}

}
