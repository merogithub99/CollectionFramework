package com.queue.questions;

import java.util.PriorityQueue;

public class ToArray {
	public static void main(String[] args) {
		PriorityQueue<Integer> pq= new PriorityQueue<>();
		pq.offer(5);
		pq.offer(7);
		pq.offer(10);
		pq.offer(78);
		pq.offer(70);
		System.out.println(pq);
		
		System.out.println("Using poll i get:"+pq.poll());
		System.out.println("after poll"+pq);
		
//		System.out.println(pq.toArray());
//		
		Integer[] arr= pq.toArray(new Integer[0]);
		
		System.out.println("printing array");
		for(Integer arr1: arr) {
			System.out.println(arr1);
		}
		
		System.out.println("length:"+arr.length);
		
		
		
		
		
	}

}
