package com.linkedlist;

import java.util.HashSet;

public class DetectLoop {
	static Node head;
	
	public static void main(String[] args) {
		DetectLoop llist = new DetectLoop();
		llist.push(20); 
        llist.push(4); 
        llist.push(15); 
        llist.push(10); 
        
        /*Create loop for testing */
        llist.head.next.next.next.next = llist.head; 
        if (detectLoop(head)) 
            System.out.println("Loop found"); 
        else
            System.out.println("No Loop");
        
        
        if(detectLoop1(head)) {
        	System.out.println("Loop found by two pointer method");
        }
        else {
        	System.out.println("No loop found using two pointer method");
        }
	}
	
	//Using Hashing
	static boolean detectLoop(Node node) {
		
		HashSet<Node> set = new HashSet<>();
		if(node != null) {
			
			while(node != null) {
				if(set.contains(node)) {
					return true;
				}
				set.add(node);
				node = node.next;
			}
		}
		return false;
	}
	
	//Using two Pointers
	// It's called Floyd’s Cycle-Finding Algorithm:
	
	static boolean detectLoop1(Node node) {
		Node fastPtr = node;
		Node slowPtr = node;
		
		while(fastPtr != null && fastPtr.next != null && slowPtr != null) {
			fastPtr = fastPtr.next.next;
			slowPtr = slowPtr.next;
			
			if(fastPtr == slowPtr) {
				return true;
			}
		}
		return false;
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
