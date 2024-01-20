package arrayListPrac.com.que;

import java.util.ArrayList;
import java.util.Scanner;

public class PortionExtract {
	public static void main(String[] args) {
		ArrayList<Integer> al= new ArrayList<>();
		al.add(99);
		al.add(5);
		al.add(88);
		al.add(72);
		al.add(78);
		
		Scanner sc= new Scanner(System.in);
		System.out.println("give index to extract portion of arraylist this-to-this");
		System.out.println("start Index");
		int startindex=sc.nextInt();
		System.out.println("end index");
		int endindex=sc.nextInt();
		int i;
		System.out.println("printing your choice:");
		for(i=startindex;i<=endindex;i++) {
			System.out.println(al.get(i));
		}
		
		
		
	}

}
