package com.algo;

public class LinearSearch {
	public static void main(String[] args) {
		int arr[] = { 2, 3, 4, 10, 40 }; 
		int x = 2;
		
		int result = linearSearch(arr, x);
		if(result == -1) {
			System.out.println("Element is not present");
		}
		else {
			System.out.println("Element is present at : " + result);
		}
	}
	
	static int linearSearch(int[] arr, int x) {
		int result = -1;
		
		for(int i=0; i< arr.length; i++) {
			if(arr[i] == x) {
				result = i;
				break;
			}
		}
		return result;
	}
}
