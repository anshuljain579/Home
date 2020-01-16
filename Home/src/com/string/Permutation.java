package com.string;

public class Permutation {
	public static void main(String[] args) {
		String str = "ABC";
		int n = str.length();
		
		permute(str, 0, n);
	}
	
	static void permute(String str, int l, int r) {
		if(l == r) {
			System.out.println(str);
		}
		else {
			for (int i = l; i <= r; i++) {
				str = swap(str, l, i);
				permute(str, l+1, r);
				str = swap(str, l, i);
			}
		}
	}
	
	static String swap(String s, int i, int j) {
		char temp;
		char []ch = s.toCharArray();
		
		temp = ch[i];
		ch[i] = ch[j];
		ch[j] = temp;
		return String.valueOf(ch);
	}
	
}
