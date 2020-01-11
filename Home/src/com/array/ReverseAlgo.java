package com.array;

import java.util.Arrays;

public class ReverseAlgo {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,};
		
		int n = arr.length;
		int d = 2;
		
		leftRotate(arr,n,d);
	}
	
	static void leftRotate(int []arr, int n, int d) {
		if(d == 0)
			return;
		
		reverseArr(arr, 0, d-1);
		reverseArr(arr, d, n-1);
		reverseArr(arr, 0, n-1);
		
		System.out.println("Arr : " + Arrays.toString(arr));
	}
	
	static void reverseArr(int ar[], int start, int end) {
		int temp;
		while(start < end) {
			temp = ar[start];
			ar[start] = ar[end];
			ar[end] = temp;
			start++;
			end--;
		}
	}
}
