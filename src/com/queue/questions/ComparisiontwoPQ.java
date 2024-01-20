package com.queue.questions;

import java.util.PriorityQueue;

public class ComparisiontwoPQ {

	public static void main(String[] args) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		pq.offer(5);
		pq.offer(7);
		pq.offer(10);
		pq.offer(78);
		pq.offer(70);
		System.out.println(pq);

		PriorityQueue<Integer> pq2 = new PriorityQueue<>();
		pq2.add(1);
		pq2.add(5);
		pq2.add(7);
		pq2.add(9);
		pq2.add(10);
		System.out.println(pq2);
		System.out.println("Compare:"+pq.containsAll(pq2));

	}

}
