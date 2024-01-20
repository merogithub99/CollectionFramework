package linkedList.com.practise;

import java.util.Collections;
import java.util.LinkedList;

public class SwapTwoElements {
	public static void main(String[] args) {
		LinkedList<Integer> ll= new LinkedList<>();
		ll.add(5);
		ll.add(6);
		ll.add(7);
		ll.add(8);
		ll.add(9);
		ll.add(10);
		System.out.print("before swapping:");
		System.out.println(ll);
		
		
		Collections.swap(ll, 0, 5);
		System.out.print("after swapping:");
		System.out.println(ll);
	}

}
