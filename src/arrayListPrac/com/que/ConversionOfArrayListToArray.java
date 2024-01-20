package arrayListPrac.com.que;

import java.util.ArrayList;



public class ConversionOfArrayListToArray {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(5);
		al.add(6);
		al.add(7);
		al.add(9);
		al.add(4);
		
		System.out.println("arrayList elements");
		System.out.println(al);

		System.out.println("converting arraylist to array:");
		Integer[] arr = al.toArray(new Integer[al.size()]);
		
		

		System.out.println("Arrays elements by loop:");
		for (Integer num : arr) {
			System.out.println(num);
		}

		

	}

}
