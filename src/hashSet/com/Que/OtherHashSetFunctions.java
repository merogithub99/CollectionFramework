package hashSet.com.Que;

import java.util.HashSet;

public class OtherHashSetFunctions {
	public static void main(String[] args) {
		HashSet<Integer> numbers = new HashSet<>();
		numbers.add(1);
		numbers.add(4);
		numbers.add(5);
		numbers.add(7);
		numbers.add(8);
		numbers.add(1);
		System.out.println("Numbers:"+numbers);

		HashSet<Integer> number = new HashSet<>();
		number.add(1);
		number.add(11);
		number.add(17);
		number.add(18);
		number.add(4);
		number.add(5);
		System.out.println("Number:"+number);

		number.addAll(numbers);
		System.out.println("after Union:" + number);
		
		numbers.removeAll(number);
		System.out.println("Afte remove all method, numbers:"+numbers);
		

	}

}
