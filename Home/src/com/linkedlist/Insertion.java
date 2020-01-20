package com.linkedlist;

public class Insertion {
	static Node head;
	
	public static void main(String[] args) {
		Insertion list = new Insertion();
		list.head = new Node(1);
		
		Node second = new Node(2);
		Node third = new Node(3);
		Node last = new Node(4);
		
		head.next = second;
		second.next = third;
		third.next = last;
		
		list.printList(head);
		System.out.println("\n================");
		
		//insertion at the front
		list.push(5);
		list.printList(head);
		System.out.println("\n================");
		
		//insertion at the middle of list
		list.insertAfter(head, 7);
		list.printList(head);
		System.out.println("\n================");
		
		list.append(8);
		list.printList(head);
		System.out.println("\n================");
	}
	
	void append(int data) {
		Node newNode = new Node(data);
		
		if(head == null) {
			head = newNode;
			return;
		}
		
		newNode.next =null;
		Node temp = head;
		
		while(temp.next != null) {
			temp = temp.next;
		}
		temp.next = newNode;
	}
	void insertAfter(Node prevNode, int data) {
		
		Node newNode = new Node(data);
		if(prevNode == null) {
			System.out.println("The given previous Node cannot be null");
			return;
			
		}
		newNode.next = prevNode.next;
		prevNode.next = newNode;
	}
	void printList(Node node) {
		Node temp = node;
		/*
		if(temp != null) {
			System.out.print(temp.data +  " ");
			//temp = temp.next;
			printList(temp.next);
		}
		*/
		while(temp != null) {
			System.out.print(temp.data  +  " ");
			temp = temp.next;
		}
	}
	
	void push(int data) {
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
	}
}
