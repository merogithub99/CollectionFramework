package arrayListPrac.com.que;

import java.util.ArrayList;

public class RemoveThirdElement {
	public static void main(String[] args) {
		ArrayList<Integer> al= new ArrayList<>();
		al.add(5);
		al.add(6);
		al.add(7);
		al.add(8);
		System.out.println(al);
		
		System.out.println("Remove third element:");
		al.remove(2);
		System.out.println(al);
		
	}

}
