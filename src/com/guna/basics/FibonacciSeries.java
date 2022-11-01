package com.guna.basics;

import java.util.Scanner;

/*
 * FibonacciSeries
 * sum of previous two numbers
 * Ex:- 011235
 */
public class FibonacciSeries {

	public void fiboSeriesMethod() {
		System.out.println("Enter a number to calculate fibonacci upto that number:- ");
		try (Scanner sc = new Scanner(System.in)) {
			int range = sc.nextInt();
			int a = 0;
			int b = 1;
			int sum;
			System.out.println(a);
			System.out.println(b);

			for (int i = 2; i <= range; i++) {
				sum = a + b;
				a = b;
				b = sum;
				System.out.println(sum);
			}
		}

	}

	public static void main(String[] args) {
		FibonacciSeries fibo = new FibonacciSeries();
		fibo.fiboSeriesMethod();

	}

}
