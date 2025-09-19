
package com.kata.practice;

/*Description: Print numbers from 1 to 100.
 *For multiples of 3 print "Fizz", 
 *for multiples of 5 print "Buzz", 
 *and for multiples of both "FizzBuzz".
 *
Skills: loops, conditionals, modular arithmetic.*/


public class Fizzbuzz {
 public static void main(String[] args) {
	 
	 int n = 100;
	 
	 for( int i=1; i<= n; i++) {
		 if(i % 5 == 0 && i % 3 == 0)
			 System.out.println("Fizzbuzz");
		 else if (i % 5 == 0)
			 System.out.println("Buzz");
		 else if (i % 3 == 0)
			 System.out.println("Fizz");
		 else
			 System.out.println(i + " ");
	 }
	 
	
}
}
