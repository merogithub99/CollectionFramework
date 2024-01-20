package linkedList.com.practise;

import java.util.LinkedList;

public class IsEmptyAndReplaceElements {
public static void main(String[] args) {
	LinkedList<Integer>  link= new LinkedList<>();
	link.add(9);
	link.add(8);
	link.add(7);
	link.add(6);
	link.add(5);
	
	System.out.println(link);
	System.out.println("Is list empty:"+link.isEmpty());
	
	link.replaceAll(null);
	
}
}
