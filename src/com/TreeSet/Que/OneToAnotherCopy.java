package com.TreeSet.Que;

import java.util.TreeSet;

public class OneToAnotherCopy {
	public static void main(String[] args) {
		TreeSet<Integer> numSet= new TreeSet<>();
		numSet.add(1);
		numSet.add(2);
		numSet.add(3);
		numSet.add(4);
		numSet.add(5);
		
		System.out.println("numset:"+numSet);
		
		TreeSet<Integer> roll= new TreeSet<>();
		
		for(Integer num:numSet) {
			roll.add(num);
		}
		
		System.out.println("roll:"+roll);
	}

}
