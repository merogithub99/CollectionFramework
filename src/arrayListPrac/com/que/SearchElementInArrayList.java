package arrayListPrac.com.que;

import java.util.ArrayList;
import java.util.Scanner;

public class SearchElementInArrayList {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> al= new ArrayList<>();
		al.add(5);
		al.add(6);
		al.add(7);
		al.add(8);
		
		System.out.println("want to search ?");
		int num= scanner.nextInt();
		
		
		if(al.contains(num)) {
			System.out.println("yes"+num +"is available in the list");
		}
		else {
			System.out.println("sorry");
		}
		
	}

}
