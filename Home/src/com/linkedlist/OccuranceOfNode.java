package com.linkedlist;

public class OccuranceOfNode {
	static Node head;
	
	public static void main(String[] args) {
		OccuranceOfNode llist = new OccuranceOfNode();
		llist.push(1); 
        llist.push(2); 
        llist.push(1); 
        llist.push(3); 
        llist.push(1); 
		
        /*Checking count function*/
        System.out.println("Count of 1 is " + llist.count(1)); 
	}
	
	int count(int key) {
		int count = 0;
		Node temp = head;
		
		while(temp != null) {
			if(temp.data == key) {
				count++;
			}
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
