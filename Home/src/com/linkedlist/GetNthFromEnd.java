package com.linkedlist;

public class GetNthFromEnd {
	static Node head;
	
	public static void main(String[] args) {
		GetNthFromEnd llist = new GetNthFromEnd();
		
		llist.push(20); 
        llist.push(4); 
        llist.push(15); 
        llist.push(35); 
        
        llist.printNthFromLast(4); 
		llist.printNodeFromLast(4);
	}
	
	//Iterative Method
	void printNthFromLast(int pos) {
		int len = getLengthOfList();
		int posToFind = (len - pos + 1);
		Node temp = head;
		
		for(int i=1; i < posToFind; i++) {
			temp = temp.next;
		}
		
		System.out.println("Node at given pos is : " + temp.data);
	}
	
	//Using Two Pointer
	void printNodeFromLast(int pos) {
		// Idea is ==> 
		// Maintain two pointers – reference pointer and main pointer. 
		// Initialize both reference and main pointers to head. 
		// First, move reference pointer to n nodes from head. 
		// Now move both pointers one by one until the reference pointer reaches the end. 
		// Now the main pointer will point to nth node from the end. Return the main pointer.
		
		Node mainPtr = head;
		Node refPtr = head;
		
		for(int i=1; i<=pos; i++) {
			refPtr = refPtr.next;
		}
		
		while(refPtr != null) {
			mainPtr = mainPtr.next;
			refPtr = refPtr.next;
		}
		
		System.out.println("Requested Node from last is " + mainPtr.data);
	}
	static int getLengthOfList() {
		Node temp = head;
		int count = 0;
		while(temp != null) {
			count++;
			temp = temp.next;
		}
		return count;
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
