package com.kata.practice;

 
/**
 * Description: Implement int sum(int[] numbers) that returns the sum of an integer array.
 * Skills: arrays, loops, accumulation.
 */
public class SumOfArray {

	public static void main(String[] args) {
		
		int[] numbers = {1,2,3,4};
		
		System.out.println("Sum of Integer array is: "+ sum(numbers));
		
		System.out.println("Sum of Integer array using Streams is: "+ sumUsingStreams(numbers));
		
	}

	// Clean and conventional
	private static int sum(int[] numbers) {
		int sum = 0;
		for (int number : numbers) {
			sum += number;
		}
		return sum;

	}
	
	// Using streams Java 8
	// More concise, leverages built-in stream API.
	
	private static int sumUsingStreams(int[] numbers) {
	 return java.util.Arrays.stream(numbers).sum();
	}

}
