package com.linkedlist;

public class RemoveDuplicateSortedList {
	static Node head;
	public static void main(String[] args) {
		RemoveDuplicateSortedList llist = new RemoveDuplicateSortedList();
		
		llist.push(1);
		llist.push(1);
		llist.push(2);
		llist.push(2);
		llist.push(2);
		llist.push(3);
		llist.push(3);
		llist.push(4);
		llist.push(5);
		
		System.out.println("Before Removing duplicate");
		llist.printList();
		System.out.println("\n==============");
		
		System.out.println("Before Removing duplicate");
		llist.removeDuplicate();
		llist.printList();
		System.out.println("\n==============");
		
		System.out.println("Before Removing duplicate Using Recursion");
		llist.removeDuplicateUsingRecursion(head);
		llist.printList();
		System.out.println("\n==============");
	}
	
	void removeDuplicateUsingRecursion(Node head) {
		//Pointer to store the pointer the node to be deleted
		Node toBeFree;
		
		if(head == null)
			return;
		
		if(head.next != null) {
			
			if(head.data == head.next.data) {
				toBeFree = head.next;
				head.next = head.next.next;
				removeDuplicateUsingRecursion(head);
			}
			else {
				removeDuplicateUsingRecursion(head.next);
			}
		}
	}
	void removeDuplicate() {
		Node curr = head;
		
		while(curr != null) {
			Node temp = curr;
			while(temp != null && temp.data == curr.data) {
				temp = temp.next;
			}
			curr.next = temp;
			curr = curr.next;
		}
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
