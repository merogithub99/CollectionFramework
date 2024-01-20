package com.TreeSet.Que;

import java.util.TreeSet;

public class NumberLessThan7 {
	public static void main(String[] args) {
		TreeSet<Integer> number= new TreeSet<>();
		number.add(1);
		number.add(2);
		number.add(8);
		number.add(9);
		number.add(3);
		number.add(11);
		number.add(14);
		number.add(6);
		
		System.out.println("Number less than 7 in set:");
		for(Integer num: number) {
			if(num<7) {
				System.out.println(num);
			}
		}
	}

}