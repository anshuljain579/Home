package com.linkedlist;

public class DeleteAtPosition {
	static Node head;
	
	public static void main(String[] args) {
		DeleteAtPosition llist = new DeleteAtPosition();
		
		llist.push(7); 
        llist.push(1); 
        llist.push(3); 
        llist.push(2); 
        llist.push(8); 
  
        System.out.println("\nCreated Linked list is: "); 
        llist.printList(); 
  
        llist.deleteNode(4);
	}
	
	void deleteNode(int pos) {
		Node temp = head;
		if(head == null)
			return;
		
		if(pos == 0) {
			head = temp.next;
			return;
		}
		
		for(int i=0; temp!= null && i<pos-1; i++) {
			temp = temp.next;
		}
		
		//get reference of next of next of temp
		Node next = temp.next.next;
		//Link that next to temp
		//that means we basically remove the link of next of temp
		next.next = temp;
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
