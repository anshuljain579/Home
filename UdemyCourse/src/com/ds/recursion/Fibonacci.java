package com.ds.recursion;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int n = sc.nextInt();
		
		int fib = getNthFibonacciNo(n);
		System.out.println("Fib Number is : " + fib);
	}
	
	static int getNthFibonacciNo(int n) {
		//Base case
		if(n < 1) {
			return -1;
		}
		else if(n == 1 || n == 2)
			return n-1;
		else
			return getNthFibonacciNo(n-1) + getNthFibonacciNo(n-2);
	}
}
