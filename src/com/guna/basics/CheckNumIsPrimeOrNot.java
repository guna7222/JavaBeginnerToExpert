package com.guna.basics;

import java.util.Scanner;

/*
 * A prime number is a number that is divisible by 1 or number itself 
 * note:- 0 and 1 are not prime numbers
 * examples:- 2,3,5,7, etc., 
 */

public class CheckNumIsPrimeOrNot {

	public void primeNumber() {
		System.out.println("Enter a number to check wheather it is prime or not:- ");
		try (Scanner sc = new Scanner(System.in)) {
			int num = sc.nextInt();
			for (int i = 2; i < num; i++) {
				if (num % i == 0) {
					System.out.println("it is a prime number");
					break;
				} else {
					System.out.println("it is not a prime number");
				}
			}

		}
	}

	// main method
	public static void main(String[] args) {
		CheckNumIsPrimeOrNot prime = new CheckNumIsPrimeOrNot();
		prime.primeNumber();

	}

}
