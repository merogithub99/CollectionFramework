package com.TreeSet.Que;

import java.util.Scanner;
import java.util.TreeSet;

public class StrictlyGreaterThanOrEqual {
	public static void main(String[] args) {
		TreeSet<Integer> number= new TreeSet<>();
		Scanner sc= new Scanner(System.in);
		number.add(1);
		number.add(2);
		number.add(8);
		number.add(9);
		number.add(3);
		number.add(11);
		number.add(14);
		number.add(6);
		number.add(15);
		number.add(18);
		number.add(22);
		System.out.println(number);
		
		System.out.println("Tailset greater than 5:"+number.tailSet(5));
		System.out.println("strictly higher than 4:"+number.higher(4));
		System.out.println("strictly less than 4:"+number.lower(4));
		
		
		
	}

}
