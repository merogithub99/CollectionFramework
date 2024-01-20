package arrayListPrac.com.que;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseList {
	public static void main(String[] args) {
		List<Integer> list= new ArrayList<>();
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		
		System.out.println(list);
	
		Collections.reverse(list);
		
		
		System.out.println(list);
		
	}

}
