package linkedList.com.practise;

import java.util.LinkedList;

public class FirstAndLastOccurence {
public static void main(String[] args) {
	LinkedList<String> ll= new LinkedList<>();
	ll.add("krishna");
	ll.add("ganesh");
	ll.add("shiva");
	ll.add("parbati");
	
	System.out.println("Checking first and last occurence");
	
	System.out.println("at first:"+ll.getFirst());
	System.out.println("at last: "+ll.getLast());
	
	
}
}
