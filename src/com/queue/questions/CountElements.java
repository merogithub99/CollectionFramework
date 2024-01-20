package com.queue.questions;

import java.util.PriorityQueue;

public class CountElements {
	public static void main(String[] args) {
		PriorityQueue<String> colors = new PriorityQueue<>();
		colors.offer("Red");
		colors.offer("Yellow");
		colors.offer("Green");
		colors.offer("Grey");
		colors.offer("Black");
		System.out.println(colors);
		
		System.out.println("size of the queue:"+colors.size());
		
		System.out.println("retrive and remove");
		System.out.println(colors.remove());
		
		System.out.println(colors);
		
	}

}
