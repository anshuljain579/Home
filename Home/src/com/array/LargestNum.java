package com.array;

public class LargestNum {
	public static void main(String[] args) {
		int[] arr = {1,6,5,3,8,15,0,12,4,9};
		
		int largestNum = byUsingIterative(arr);
		System.out.println("Largest Num : " + largestNum);
		
		
		byUsingRecursion(arr);
	}
	
	static int byUsingIterative(int []arr) {
		int largest = arr[0];
		for(int i=1; i <= arr.length-1; i++) {
			if(arr[i] > largest) {
				largest=arr[i];
			}
		}
		return largest;
	}
	
	static void byUsingRecursion(int arr[]) {
		System.out.println("Highest Num is :" + largeNum(arr, arr.length-1, Integer.MIN_VALUE));
	}
	
	static int largeNum(int []arr, int n, int highest) {
		
		if(n == -1)
			return highest;
		else {
			if(arr[n] > highest)
				highest = arr[n];
		}
		return largeNum(arr, n-1, highest);
			
		
	}
}
