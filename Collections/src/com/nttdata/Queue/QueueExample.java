package com.nttdata.Queue;
import java.util.ArrayDeque;
import java.util.PriorityQueue;
public class QueueExample {
public static void main(String[] args) {
	PriorityQueue<Integer> queue=new PriorityQueue<>();
	queue.add(45);
	queue.add(35);
	queue.add(21);
	for (Integer integer : queue) {
		System.out.println(integer);
	}
	System.out.println(" after peek and remove");
	System.out.println(queue.peek());
	System.out.println(queue.remove());
	for (Integer integer : queue) {
		System.out.println(integer);
	}
	System.out.println("-------------------------------------");
	PriorityQueue<Book> queue2=new PriorityQueue<>();
	queue2.add(new Book(12,"java",546));
	queue2.add(new Book(17,"c",534));
	queue2.add(new Book(19,"c++",5546));
	queue2.add(new Book(15,"c#",54643));
	for (Book book : queue2) {
		System.out.println(book);
	}
	System.out.println("-----------------------------------------");
	ArrayDeque<Book> queue1=new ArrayDeque<>();
	queue1.add(new Book(12,"java",546));
	queue1.add(new Book(15,"c",534));
	queue1.add(new Book(14,"c++",5546));
	queue1.add(new Book(15,"c#",54643));
	for (Book book : queue1) {
		System.out.println(book);
	}
}
}
