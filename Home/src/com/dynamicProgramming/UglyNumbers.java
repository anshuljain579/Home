package com.dynamicProgramming;

import java.util.Arrays;

public class UglyNumbers {
	public static void main(String[] args) {
		int n = 7;
		UglyNumbers obj = new UglyNumbers();
		
		System.out.println(obj.getNthUglyNumber(n));
	}
	
	int getNthUglyNumber(int n) {
		int ugly[] = new int[n];
		
		ugly[0] = 1;
		int i2 = 0, i3 = 0 ,i5 = 0;
		int next_multiply_of_2 = 2;
		int next_multiply_of_3 = 3;
		int next_multiply_of_5 = 5;
		
		int next_ugly_number = 1;
		
		for (int i = 1; i < n; i++) {
			next_ugly_number = Math.min(next_multiply_of_2, Math.min(next_multiply_of_3, next_multiply_of_5));
			
			ugly[i] = next_ugly_number;
			System.out.println(Arrays.toString(ugly));
			if(next_ugly_number == next_multiply_of_2) {
				i2 = i2+1;
				next_multiply_of_2 = ugly[i2]*2;
			}
			if(next_ugly_number == next_multiply_of_3) {
				i3 = i3+1;
				next_multiply_of_3 = ugly[i3]*3;
			}
			if(next_ugly_number == next_multiply_of_5) {
				i5 = i5+1;
				next_multiply_of_5 = ugly[i5]*5;
			}
		}
		return next_ugly_number;
		
	}
}