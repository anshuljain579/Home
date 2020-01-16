package com.array;

import java.util.HashMap;
import java.util.Map;

public class SubArrayOfGivenSum {
	public static void main(String[] args) {
		int arr[] = {1, 4, 20, 3, 10, 5};
		int sum = 33;
		
		//For Non negative Number
		//Naive Method
		//subArraySum(arr, arr.length, sum);
		
		//Efficient Way
		//Handle Negative Number
		//Using Map
		int[] arr1 = {10, 2, -2, -20, 10}; 
        int n = arr.length-1; 
        int sum1 = 50; 
        
        subArraySum1(arr1, n, sum1); 
        
	}
	
	
	static void subArraySum1(int[]arr, int n, int sum) {
		int curr_sum =0;
		int start = 0;
		int end = -1;
		
		Map<Integer, Integer> map = new HashMap<>();
		for(int i =0; i< n; i++) {
			curr_sum = curr_sum + arr[i];
			
			int value = curr_sum - sum;
			if(map.containsKey(value)) {
				start = map.get(value) + 1;
				end = i;
				break;
			}
			
			if(value == 0) {
				start = 0;
				end = i;
				break;
			}
			map.put(curr_sum, i);
		}
		
		if(end == -1) {
			System.out.println("Sum cannot be found in given array");
		}
		else {
			System.out.println("Sum found in array between indexes " + start + " to " + end);
		}
	}
	
	
	static int subArraySum(int[] arr, int n, int sum) {
		int curr_sum, i, j;
		
		//pick a starting point
		for(i =0; i < n; i++) {
			curr_sum = arr[i];
			
			//try all subarrays with i
			for(j = i+1; j <=n; j++) {
				if(curr_sum == sum) {
					int p = j-1;
					System.out.println("Sum found between indexes " + i + " and " + p);
					return 1;
				}
				
				if(curr_sum > sum || j == n)
					break;
				
				curr_sum = curr_sum + arr[j];
			}
		}
		System.out.println("No SubArray found");
		return 0;
	}
}
