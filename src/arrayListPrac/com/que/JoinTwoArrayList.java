package arrayListPrac.com.que;

import java.util.ArrayList;

public class JoinTwoArrayList {
	public static void main(String[] args) {
		ArrayList<String> list1= new ArrayList<>();
		list1.add("sandesh");
		list1.add("ganesh");
		list1.add("pitaji");
		list1.add("gita");
		System.out.println(list1);
		
		ArrayList<String> list2= new ArrayList<>();
		list2.add("sita");
		list2.add("sushant");
		list2.add("hari");
		System.out.println(list2);
		
		list1.addAll(list2);
		System.out.println("After joining two list:");
		System.out.println("List 1 :"+list1);
		
	}

}
