package com.linkedlist;

public class LinkedList {
	static Node head;
	
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.head = new Node(1);
		
		Node second = new Node(2);
		Node third = new Node(3);
		Node last = new Node(4);
		
		list.head.next = second;
		second.next = third;
		third.next = last;
		
		list.printList(head);
	}
	
	void printList(Node node) {
		Node temp = node;
		if(temp != null) {
			System.out.print(temp.data + " ");
			//tail recursion
			printList(node.next);
		}
	}
}