package com.array;

import java.util.Arrays;

public class MissingNumber {
	public static void main(String[] args) {
		int []arr = {1,2,3,4,6};
		
		int missingNumber = findMissingNumber(arr);
		System.out.println("Missing number in arr is : " + missingNumber);
		
		int missingNo = byUsingXOR(arr);
		System.out.println("Missing number in arr is : " + missingNo);
	}
	
	public static int findMissingNumber(int[] arr) {
		Arrays.sort(arr);
		int last = arr[arr.length-1];
		int expTotal = (last * (last + 1))/2;
		int actTotal = 0;
		
		for(int n : arr) {
			actTotal = actTotal+n;
		}
		return expTotal - actTotal;
	}
	
	/*
	public static int byUsingXOR(int []arr) {
		int n = arr.length-1;
		int x1 = arr[0];
		int x2 = 1;
		
		//For xor of all the elements in array
		for(int i=1; i<n; i++) {
			x1 = x1^arr[i];
		}
		
		//for xor of all the elements from 1 to n+1
		for(int i=2; i<=n+1; i++) {
			x2 = x2^i;
		}
		return (x1^x2);
	}*/
	
	
	public static int byUsingXOR(int []arr) {
		int n = arr.length-1;
		int x1 = arr[0];
		int x2 = 1;
		
		for(int i=1; i<n; i++) {
			x1 = x1^arr[i];
		}
		
		for (int i = 2; i <= n+1; i++) {
			x2 = x2^i;
		}
		
		return x1^x2;
		
	}
}
