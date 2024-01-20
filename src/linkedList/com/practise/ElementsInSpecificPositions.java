package linkedList.com.practise;

import java.util.LinkedList;

public class ElementsInSpecificPositions {
	public static void main(String[] args) {
		LinkedList<Integer> ll = new LinkedList<>();
		ll.add(5);
		ll.add(6);
		ll.add(7);
		ll.add(8);
		ll.add(9);
		ll.add(10);

		System.out.println(ll);

		LinkedList<Integer> ll2 = new LinkedList<>();
		ll2.add(1);
		ll2.add(2);
		ll2.add(3);
		ll2.add(4);

		System.out.println(ll2);
		System.out.println("after adding some elements starting from first:");
		ll.addAll(0, ll2);
		System.out.println(ll);

		System.out.println("after adding some elements starting from third:");
		ll.addAll(2, ll2);
		System.out.println(ll);

	}

}
