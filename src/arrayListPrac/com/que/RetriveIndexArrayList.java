package arrayListPrac.com.que;

import java.util.ArrayList;

public class RetriveIndexArrayList {
	public static void main(String[] args) {
		ArrayList<Integer> list= new ArrayList<>();
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		
		System.out.println("Retriving specific index using lidt.get(index)");
		System.out.println(list.get(3));
	}

}
