package linkedList.com.practise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class ShuffleLinkedList {
	public static void main(String[] args) {
		LinkedList<String> student = new LinkedList<>();
		student.add("Suraj");
		student.add("Sushant");
		student.add("Ribesh");
		student.add("Riwaj");

		ArrayList<String> arrlist = new ArrayList<>(student);
		Collections.shuffle(arrlist);

		System.out.println("shuffled arraylist:"+arrlist);
		
		
		Collections.shuffle(student);
		System.out.println("shuffled linkedList:"+student);

		System.out.println(student.hashCode());
		int has = student.hashCode();
		int has1 = student.hashCode();

		if (has == has1) {
			System.out.println("yes has and has1 are equals");
		} else {
			System.out.println("not equals");
		}

	}

}
