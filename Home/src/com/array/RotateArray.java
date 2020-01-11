package com.array;

import java.util.Arrays;
import java.util.Scanner;

public class RotateArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of test cases");
		int numOfTestCases = sc.nextInt();
		
		for(int i=0; i< numOfTestCases; i++) {
			System.out.println("Enter size of an array");
			int arraySize = sc.nextInt();
			
			int array[] = new int[arraySize];
			System.out.println("Enter elements of an array");
			for (int j = 0; j < array.length; j++) {
				array[j] = sc.nextInt();
			}
			System.out.println(Arrays.toString(array));
			//leftRotateArray(array, 2);
			
			//System.out.println("Left rotate : " + Arrays.toString(array));
			juggling(array, 2);
		}
	}
	
	
	static void juggling(int arr[], int d) {
		int n = arr.length;
		int g_c_d = gcd(n, d); 
		int j,k;
		for(int i=0; i < g_c_d; i++) {
			int temp = arr[i];
			j = i;
			while(true) {
				k = j + d;
				
				if(k >= n){
					k = k-n;
					
				if(k==i)
					break;
				}
				arr[j] = arr[k];
				j =k;
			}
			arr[j] = temp;
		}
		
		System.out.println("Juggling : " + Arrays.toString(arr));
	}
	
	static int gcd(int a, int b) {
		if(b == 0)
			return a;
		else 
			return gcd(b, a%b);
		
	}
	static void leftRotateArray(int[] arr, int d) {
		for(int j=0; j < d; j++) {
			int temp = arr[0];
			int i;
			for(i=0; i < arr.length-1; i++) {
				arr[i] = arr[i+1];
			}
			arr[i] = temp;
		}
		//System.out.println(Arrays.toString(arr));
	}
}
