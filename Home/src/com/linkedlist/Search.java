package com.linkedlist;

public class Search {
	static Node head;
	
	public static void main(String[] args) {
		Search list = new Search();
		list.push(10);
		list.push(30);
		list.push(11);
		list.push(12);
		list.push(14);
		list.push(21);
		
		//Iterative Method
		boolean isExist = list.search(14);
		if(isExist) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
		
		//Recursive Method
		boolean isAvailable = list.searchByRecur(head, 14);
		if(isAvailable) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}
	
	
	boolean searchByRecur(Node head, int key) {
		return searchByRec(head, key);
	}
	
	boolean searchByRec(Node node, int key) {
		
		if(node == null)
			return false;
		
		if(node.data == key)
			return true;
		
		return searchByRec(node.next, key);
	}
	boolean search(int key) {
		Node curr = head;
		while(curr != null) {
			if(curr.data == key) {
				return true;
			}
			curr = curr.next;
		}
		return false;
	}
	void push(int data) {
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
	}
}
