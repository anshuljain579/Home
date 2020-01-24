package com.linkedlist;

import java.util.Stack;

public class Palindrome {
	static Node head;
	public static void main(String[] args) {
		Palindrome llist = new Palindrome();
		llist.push(1);
		llist.push(2);
		llist.push(3);
		llist.push(4);
		llist.push(3);
		llist.push(2);
		llist.push(1);
		
		llist.printList();
		System.out.println("\n=============");
		
		boolean condition = checkPalindrome();
		if(condition) {
			System.out.println("Given LL is Palindrome");
		}
		else {
			System.out.println("Given LL is not a Palindrome");
		}
	}
	
	static boolean checkPalindrome() {
		Node slow = head;
		Stack<Integer> stack = new Stack<>();
		boolean isPalin = false;
		while(slow != null) {
			stack.add(slow.data);
			slow = slow.next;
		}
		
		while(head != null) {
			int i = stack.pop();
			
			if(head.data == i) {
				isPalin = true;
			}
			else {
				isPalin = false;
				break;
			}
			head = head.next;
		}
		return isPalin;
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
