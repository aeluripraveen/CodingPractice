package com.aeluri.practice.byteBybyte;

import java.util.Scanner;

/*Output numbers from 1 to x. If the number is divisible by 3, replace it with “Fizz”. 
 * If it is divisible by 5, replace it with “Buzz”. 
 * If it is divisible by 3 and 5 replace it with “FizzBuzz”.
 */

public class FizzBuzz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number n: ");
		int n= sc.nextInt();
		printFizzBuzz(n);

	}

	private static void printFizzBuzz(int n) {
		for(int i=1;i<=n;i++) {
			if(i%3==0 && i%5==0)
				System.out.println("FizzBuzz");
			else if(i%3==0)
				System.out.println("Fizz");
			else if(i%5==0)
				System.out.println("Buzz");
			else
				System.out.println(i);
		}
	}

}
