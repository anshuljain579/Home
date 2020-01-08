package com.recursion;

import java.util.Scanner;

public class factorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		
		int fact = fact(n);
		System.out.println("Factorial of given number is : " + fact);
	}
	
	static int fact(int n) {
		if(n<=0)
			return 1;
		
		return n* fact(n-1);
	}
}
