package com.algo;

public class BinarySearch {
	public static void main(String[] args) {
		int []ar = { 2, 3, 4, 10, 40 };
		int n = ar.length;
		int x = 2;
		int result = binarySearch(ar, 0, n, x);
		if(result == -1) {
			System.out.println("Element is not present");
		}
		else {
			System.out.println("Element is present at : " + result);
		}
	}
	
	static int binarySearch(int []ar, int start, int end, int x) {
		
		if(start <= end) {
			int mid = (start+end)/2;
			
			if(ar[mid] == x)
				return mid;
			
			if(ar[mid] > x)
				return binarySearch(ar, start, mid-1, x);
			
			else
				return binarySearch(ar, mid+1, end, x);
			
		}
		return -1;
	}
}
