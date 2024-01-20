package arrayListPrac.com.que;

import java.util.ArrayList;

public class ArrayToArrayList {
	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4,5};
		for(int ar:arr) {
			System.out.println(ar);
		}
		
		ArrayList<Integer> al= new ArrayList<>();
		
//		for(int i=0;i<arr.length;i++) {
//			al.add(arr[i]);
//		}
		
		
		for(int num:arr) {
			al.add(num);
		}
		System.out.println(al);
		
	}

}
