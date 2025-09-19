package com.kata.practice;

import java.util.OptionalInt;

/**
 * Description: Implement int max(int[] numbers) 
 * that returns the largest element in an integer array.
 * 
 * Skills: arrays, comparisons.
 */
public class MaximumInArray {

	public static void main(String[] args) {

		int[] numbers = {3,88,7,98};
		
		System.out.println("Maximum in Integer array is: "+ max(numbers));
	}

	// Java 8
	// throws exception if array is empty
	
	
	private static int max(int[] numbers) {

		return java.util.Arrays.stream(numbers).max()
				.orElseThrow(() -> new IllegalArgumentException("Array must not be empty"));

	}
	
    //Conventional
	private static int max2(int[] numbers) {
		if (numbers == null || numbers.length == 0) {
	        return 0; // or Integer.MIN_VALUE depending on your use case
	    }
		int max = numbers[0]; // if Array is empty returns first element
		
		for(int number : numbers) {
			if(number > max)
				max = number;
		}
		return max;
	}
	
}
