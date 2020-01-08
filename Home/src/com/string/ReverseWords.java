package com.string;

public class ReverseWords {
	public static void main(String[] args) {
		String str = "Welcome to India";
		getReverseStr(str);
		//System.out.println("Reverse Word Str : " + reverseStr);
	}
	
	static void getReverseStr(String s) {
		String reverseStr = "";
		//String reverseWord = "";
		
		String reverse[] = s.split(" ");
		for (int i = 0; i < reverse.length; i++) {
			reverseStr = reverseStr + getReverseWord(reverse[i]) + " ";
		}
		System.out.println(reverseStr.trim());
		
	}
	
	static String getReverseWord(String s) {
		if(s.length() == 0)
			return "";
		
		return "" + s.charAt(s.length()-1) + getReverseWord(s.substring(0, s.length()-1));
	}
}
