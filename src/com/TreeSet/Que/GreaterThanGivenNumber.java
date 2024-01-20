package com.TreeSet.Que;

import java.util.Scanner;
import java.util.TreeSet;

public class GreaterThanGivenNumber {
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
		
		System.out.println("You want a set greater than which number?");
		int choice=sc.nextInt();
		
		System.out.println("Numbers of your choice:");
		for(Integer num:number) {
			if(num>choice) {
				System.out.println(num);
			}
		}
		
	}

}
