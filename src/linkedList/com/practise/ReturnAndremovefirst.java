package linkedList.com.practise;

import java.util.LinkedList;

public class ReturnAndremovefirst {
	
	public static void main(String[] args) {
		LinkedList<Integer> ll= new LinkedList<>();
		ll.add(100);
		ll.add(200);
		ll.add(300);
		ll.add(400);
		ll.add(500);
		ll.add(600);
		System.out.println(ll);
		
		System.out.println("poll retrives and remove but peek only retrives not remove");
		
		System.out.println(ll.pollFirst());
		System.out.println("after polling");
		System.out.println(ll);
		
		System.out.println(ll.peekFirst());
		System.out.println("after peek");
		System.out.println(ll);
		
		
		
	}

}
