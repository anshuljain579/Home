package com.algo;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
		int[] arr = {9, 6, 2, 12, 11, 9, 3, 7};
		int n = arr.length;
		
		//Iterative Method
		bubbleSort(arr, n);
		
		//Recursive Method
		bubbleSortRecursive(arr, n);
		
	}
	
	static void bubbleSort(int []arr, int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					//swap(arr[j], arr[j+1]);
				}
			}
		}
		System.out.println("Iterative method :" + Arrays.toString(arr));
	}
	
	//No breaking condition here 
	//TODO Need to check
	static void bubbleSortRecursive(int[] arr, int n) {
		for (int i = 0; i < n-1; i++) {
			if(arr[i] > arr[i+1]) {
				int temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
			}
			bubbleSortRecursive(arr, n-1);
		}
		
		System.out.println("Recursive method :" + Arrays.toString(arr));
	}
}
