package com.TreeSet.Que;

import java.util.TreeSet;

public class FirstAndLastElement {
public static void main(String[] args) {
	TreeSet<Integer>   ts= new TreeSet<>();
	ts.add(25);
	ts.add(35);
	ts.add(45);
	ts.add(55);
	ts.add(65);
	System.out.println("ts:"+ts);

	System.out.println("First:"+ts.first());
	System.out.println("celeing of 24:"+ts.ceiling(24));
	System.out.println("Last:"+ts.last());
	System.out.println("floor of 36:"+ts.floor(36));
	
}

}
