package com.TreeSet.Que;

import java.util.Scanner;
import java.util.TreeSet;

public class RetriveAndRemove {
	public static void main(String[] args) {
		TreeSet<Integer> set1 = new TreeSet<>();
		Scanner sc = new Scanner(System.in);
		set1.add(1);
		set1.add(2);
		set1.add(8);
		set1.add(9);
		set1.add(3);
		set1.add(11);
		set1.add(14);

		System.out.println("Before:" + set1);
		System.out.println(set1.pollFirst());
		System.out.println(set1.pollLast());
		System.out.println("After poll first and last" + set1);

		set1.clear();
		System.out.println("After clearing:"+set1);
	}

}
