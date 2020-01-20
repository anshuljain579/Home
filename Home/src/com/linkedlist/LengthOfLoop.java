package com.linkedlist;

public class LengthOfLoop {
	
	static class Node  
	{  
	    int data; 
	    Node next; 
	    Node(int data) 
	    { 
	        this.data =data; 
	        next =null; 
	    } 
	} 
	
	public static void main(String[] args) {
		LengthOfLoop llist = new LengthOfLoop();
		
		Node head = newNode(1);  
	    head.next = newNode(2);  
	    head.next.next = newNode(3);  
	    head.next.next.next = newNode(4);  
	    head.next.next.next.next = newNode(5);  
	  
	    /* Create a loop for testing */
	    head.next.next.next.next.next = head.next;  
	    
	    System.out.println( countNodesinLoop(head));  
	}
	
	static int countNodesinLoop(Node node) {
		Node fastPtr = node;
		Node slowPtr = node;
		
		while(fastPtr != null && fastPtr.next != null && slowPtr != null) {
			fastPtr = fastPtr.next.next;
			slowPtr = slowPtr.next;
			
			if(fastPtr == slowPtr) {
				return countNode(slowPtr);
			}
		}
		return 0;
		
	}
	
	static int countNode(Node node) {
		int count = 1;
		Node temp = node;
		while(temp.next != node) {
			count++;
			temp = temp.next;
		}
		return count;
	}
	
	static Node newNode(int data) {
		Node temp = new Node(data);
		return temp;
	}
}
