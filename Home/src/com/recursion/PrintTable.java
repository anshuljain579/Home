package com.recursion;

public class PrintTable {
	public static void main(String[] args) {
		int n = 5;
		int i = 1;
		
		printTable(n, i);
	}
	
	static void printTable(int n, int i) {
		if(i == 0 || i > 10)
			return;
		
		System.out.println(n + " * " + i + " = " + (n*i));
		printTable(n, ++i);
	}
}
