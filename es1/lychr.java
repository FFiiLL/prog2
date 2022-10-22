package es;

import java.util.Scanner;

public class lychr {
	
	static String numToString(long n) {
		return n + "";
	}
	
	static long stringToLong(String s) {
		return Long.parseLong(s);
	}
	
	static String reverse(String s) {
		
		if (s.length()>1)
			return s.charAt(s.length()-1) + reverse(s.substring(1,s.length()-1)) + s.charAt(0);
		
		else
			return s;
	}
	
	static boolean isPalindrome(String s) {
	
		
		if (s.length()>1)
			if (s.charAt(0) == s.charAt(s.length()-1))
				return isPalindrome(s.substring(1, s.length()-1));
			else
				return false;
		
		else
			return true;
	
		
	}
	
	static void stampaSeq(long n) {
		
		while (!isPalindrome(numToString(n))){
			System.out.println(n);
			n = n + stringToLong(reverse(numToString(n)));
		}
		
		System.out.println(n);
	}
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("inserire numero: ");
		stampaSeq(in.nextLong());
	}
}
