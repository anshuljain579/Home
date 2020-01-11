package com.string;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class RemoveDuplicates {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		
		String str = sc.next();
		System.out.println("String after remove duplicate : " + removeDup(str));
	}
	
	
	static String removeDup(String s) {
		if(s.length() == 0)
			return "";
		
		//Using Hashing
		LinkedHashSet<Character> set = new LinkedHashSet<>();
		StringBuffer sb = new  StringBuffer();
		for (int i = 0; i < s.length(); i++) {
			set.add(s.charAt(i));
		}
		
		for(Character c : set) {
			sb = sb.append(c);
		}
		return sb.toString();
	}
}
