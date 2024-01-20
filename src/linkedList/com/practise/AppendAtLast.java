package linkedList.com.practise;

import java.util.LinkedList;
import java.util.List;

public class AppendAtLast {
	public static void main(String[] args) {
		LinkedList<Integer> list= new LinkedList<>();
		list.add(5);
		list.add(100);
		list.add(500);
		list.add(22);
		System.out.println(list);
		System.out.println("after apending 6 at last");
		list.addLast(6);
		System.out.println(list);
		System.out.println("1 at first");
		list.addFirst(1);
		System.out.println(list);
		
	
		
	}

}
