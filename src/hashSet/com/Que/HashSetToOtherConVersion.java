package hashSet.com.Que;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.TreeSet;

public class HashSetToOtherConVersion {
	public static void main(String[] args) throws NumberFormatException, IOException {
		HashSet<Integer> hs = new HashSet<>();
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String choice;

		do {
			System.out.println("Add a Integer");
			hs.add(Integer.parseInt(bf.readLine()));
			System.out.println("Want to add more?");
			choice = bf.readLine();

		} while (choice.equalsIgnoreCase("y"));

		System.out.println("iterate over hash set:");

		for (Integer hset : hs) {
			System.out.println(hset);
		}
		Integer[] hs1= hs.toArray(new Integer[5]);
		
		System.out.println("array:");
		for(Integer in: hs1) {
			System.out.println(in);
		}
		
		
		
		System.out.println("to TreeSet:");
		TreeSet<Integer> tset= new TreeSet<>();
		
		for(int num: hs) {
			tset.add(num);
			
		}
		
		System.out.println("treeset datas are :"+tset);
		
		


	}

}
