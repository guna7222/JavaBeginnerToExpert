package com.guna.basics;

public class Factorial {
	/*
	 * logic for factorial 5! = 5*4*3*2*1
	 */
	public static void main(String[] args) {

		int fact = 5;
		int temp = 1;
		for (int i = 1; i <= fact; i++) {
			temp = temp * i;

		}
		System.out.println("Factorial of " + fact + " is " + temp);

	}

}
