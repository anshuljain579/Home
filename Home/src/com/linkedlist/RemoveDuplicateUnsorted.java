package com.linkedlist;

import java.util.HashSet;

public class RemoveDuplicateUnsorted {
	static Node head;
	public static void main(String[] args) {
		RemoveDuplicateUnsorted llist = new RemoveDuplicateUnsorted();
		
		llist.push(10);
		llist.push(13);
		llist.push(13);
		llist.push(12);
		llist.push(11);
		llist.push(13);
		llist.push(10);
		llist.push(11);
		llist.push(15);
		
		System.out.println("Before Removing duplicate");
		llist.printList();
		System.out.println("\n==============");
		
		System.out.println("Before Removing duplicate");
		llist.removeDuplicate();
		llist.printList();
		System.out.println("\n==============");
	}
	
	void removeDuplicate() {
		HashSet<Integer> h = new HashSet<>();
		
		Node curr = head;
		Node prev = null;
		while(curr != null) {
			if(h.contains(curr.data)) {
				prev = curr.next;
			}
			else {
				h.add(curr.data);
				prev= curr;
			}
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
