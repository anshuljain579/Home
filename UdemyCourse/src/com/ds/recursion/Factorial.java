package com.ds.recursion;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int n = sc.nextInt();
		int fact = getFactorial(n);
		
		System.out.println("Factorial of given Number :" + fact);
	}
	
	static int getFactorial(int n) {
		if(n <= 1)
			return 1;
		return n * getFactorial(n-1);
	}
}
