package com.linkedlist;

public class Deletion {
	static Node head;
	
	public static void main(String[] args) {
		Deletion list = new Deletion();
		list.push(7);
		list.push(1);
		list.push(3);
		list.push(2);
		
		list.printList();
		System.out.println("\n================");
		list.deleteNode(1);
		
		list.printList();
		System.out.println("\n================");
	}
	
	void deleteNode(int key) {
		Node temp = head;
		Node prev = null;
		
		if(temp != null && temp.data == key) {
			temp= temp.next;
			return;
		}
		
		if(head == null) {
			return;
		}
		
		while(temp != null && temp.data != key) {
			prev = temp;
			temp = temp.next;
		}
		
		prev.next = temp.next;
	}
	
	void push(int data) {
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
	}
	
	void printList() {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}
}
