package arrayListPrac.com.que;

import java.util.ArrayList;
import java.util.Collections;

public class SortArray {
	
	
	public static void main(String[] args) {
		ArrayList<Integer> al= new ArrayList<>();
		al.add(10);
		al.add(6);
		al.add(7);
		al.add(8);
		al.add(4);
		al.add(1);
		System.out.println(al);
		Collections.sort(al);
		System.out.println("After sorting:"+al);
		
		
		
		
		
		
	}

}
