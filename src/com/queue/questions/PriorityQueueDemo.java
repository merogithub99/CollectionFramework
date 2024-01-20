package com.queue.questions;

import java.util.PriorityQueue;

public class PriorityQueueDemo {
	public static void main(String[] args) {
		PriorityQueue<String> colors = new PriorityQueue<>();
		colors.add("Red");
		colors.add("Yellow");
		colors.add("Green");
		colors.add("Grey");
		colors.add("Black");

		for (String color : colors) {
			System.out.println(color);
		}
		System.out.println("Head of the queue using element:"+colors.element());
		
		colors.offer("Pink");
		System.out.println(colors);

	}

}
