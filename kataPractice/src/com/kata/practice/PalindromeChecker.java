package com.kata.practice;

import java.util.Scanner;

/**
 * Description: Write a method boolean isPalindrome(String word)
 * that returns true if the input reads the same 
 * forwards and backwards.
   Skills: strings, loops, conditionals.
 * 
 */
public class PalindromeChecker {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your String:");
		
		String str = sc.next();
		String org_str = str;
		
		// Reverse the String
		
		String rev_str = "";
		
		int length = str.length();
		
		for(int i=length-1; i>=0; i--) {
			rev_str= rev_str + str.charAt(i);
		}
		
		 //Check for Palindrome
		if(org_str.equals(rev_str)) {
			System.out.println( org_str + " is a Palindrome");
		}
		else {
			System.out.println( org_str + " is not a Palindrome");
		}

	}

}
