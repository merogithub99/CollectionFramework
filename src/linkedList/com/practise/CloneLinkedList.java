package linkedList.com.practise;

import java.util.LinkedList;

public class CloneLinkedList {
	public static void main(String[] args) {
		LinkedList<Integer> ll= new LinkedList<>();
		ll.add(100);
		ll.add(200);
		ll.add(300);
		ll.add(400);
		ll.add(500);
		ll.add(600);
		
		LinkedList<Integer> ll2= new LinkedList<>(ll);
		
		System.out.println("ll2 datas: "+ll2);
		
		@SuppressWarnings("unchecked")
		LinkedList<Integer> cloned=(LinkedList<Integer>)ll.clone();
		System.out.println("Cloned data are :"+cloned);
	   
	     

		
	}

}
