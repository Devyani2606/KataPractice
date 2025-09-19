package com.kata.practice;


/**
 * Description: Implement boolean isAnagram(String a, String b)
 * that returns true if both words are made of the same letters (ignoring spaces/case).
 * 
 * Skills: strings, sorting, character arrays.
 * 
 */
public class AnagramChecker {

	public static void main(String[] args) {
		String a = "abc";
		String b = "cab";
		
		System.out.println(isAnagram(a,b));

	}

	private static boolean isAnagram(String a, String b) {
		if(a.length() != b.length()) 
			return false;
		
		// Create array of 26 alphabets, keep reducing ASCII Value of 'a' from each alphabet, will result in 0 or 1
		int[] char_counts = new int[26];
		for(int i=0; i < a.length(); i++) {
			char_counts[a.charAt(i) - 'a']++;
			//char_counts[b.charAt(i) - 'a']--;
		}
		
		for(int count : char_counts) {
			if(count != 0)
				return false;
		}
		return true;
	}

}
