package com.queue.questions;

import java.util.PriorityQueue;

public class PqToString {
	public static void main(String[] args) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		pq.offer(5);
		pq.offer(7);
		pq.offer(10);
		pq.offer(78);
		pq.offer(70);
		System.out.println("printing pq:"+pq);
		
		String strings=pq.toString();
		
		System.out.println("printing strings:"+strings);
		
		if(strings instanceof String) {
			System.out.println("data type is string");
		}
	}
	

}
