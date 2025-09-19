package com.kata.practice;

import java.util.Scanner;

/**
 * Description: 
 * Implement int factorial(int n) 
 * that returns the factorial of a number 
 * (e.g., factorial(5) = 120).
 * 
 * Skills: recursion vs. loops, basic math.
 */
public class FactorialCalculator {

	public static void main(String[] args) {
		
		//Input Number
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no. :");
		int num = sc.nextInt();
		
		
		System.out.println("Factorial of " +num+ " = "+ factorial(num));
	}

	//Method to Calculate Factorial
	private static Integer factorial(int num) {
		int factorial = 1;
		for( int i=1 ; i <= num ; i++) {
			factorial *=i;
		}
		return factorial;
	}

	
	
}
