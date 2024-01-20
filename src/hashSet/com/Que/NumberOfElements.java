package hashSet.com.Que;

import java.util.HashSet;

public class NumberOfElements {
	public static void main(String[] args) {
		HashSet<Character> letter = new HashSet<>();
		letter.add('a');
		letter.add('b');
		letter.add('c');
		letter.add('d');
		letter.add('e');
		
		int elementCount = 0;

		System.out.println("iterating over Hash set:");
		for (Character ch : letter) {
			System.out.println(ch);
			elementCount++;
		}

		
		
		System.out.println("Number of elements using loop:" + elementCount);
		System.out.println("Number of elements using size:"+letter.size());

	}

}
