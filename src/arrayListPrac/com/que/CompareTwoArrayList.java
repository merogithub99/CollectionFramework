package arrayListPrac.com.que;

import java.util.ArrayList;

public class CompareTwoArrayList {
	public static void main(String[] args) {
		ArrayList<String> StringList= new ArrayList<>();
		StringList.add("ram");
		StringList.add("shyam");
		StringList.add("hari");
		StringList.add("gita");
		System.out.println(StringList);
		
		ArrayList<String> StringListTwo= new ArrayList<>();
		StringListTwo.add("sita");
		StringListTwo.add("sushant");
		StringListTwo.add("hari");
		System.out.println(StringListTwo);
		
		System.out.println("Comparing StringList with StringListTwo using contains all method");
		System.out.println(StringList.containsAll(StringListTwo));
		
		System.out.println("StringList has hari?\n"+StringList.contains("hari"));
		
		
		

	}

}
