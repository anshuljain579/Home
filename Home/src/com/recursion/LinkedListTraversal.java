package com.recursion;

import javax.print.event.PrintJobAttributeListener;

class Node{
	int data;
	Node next;
	
	Node(int data){
		this.data = data;
		next = null;
	}
}
public class LinkedListTraversal {
	public static void main(String[] args) {
		LinkedListTraversal list = new LinkedListTraversal();
		Node first = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		Node last = new Node(4);
		
		first.next = second;
		second.next = third;
		third.next = last;
		
		list.printList(first);
		
		System.out.println("\n===================");
		list.printList1(first);
	}
	
	void printList(Node head) {
		if(head != null) {
			System.out.print(head.data + " ");
			printList(head.next);
		}
	}
	
	void printList1(Node head) {
		if(head != null) {
			printList1(head.next);
			System.out.print(head.data + " ");
		}
	}
}
