package com.recursion;

import java.util.Arrays;

public class AddPrevious {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6};
		int size = arr.length;
		
		addPrevious(arr, size);
		System.out.println(Arrays.toString(arr));
	}
	
	static void addPrevious(int[]arr, int size){
		if(size <= 1)
			return;
		
		addPrevious(arr, size-1);
		arr[size-1] = arr[size-1] + arr[size-2];
		
	}
	
}
