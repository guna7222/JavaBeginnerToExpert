package com.guna.basics;

public class NumberPalindrome {
	public void palindromeNumber() {
		int num=121;
		int remainder;
		int s = 0;
		int temp = num;
		while(num > 0) {
			remainder = num % 10; // 1 //2 //1
			num = num / 10; //12 //1 //0
			s = s * 10 + remainder; // 1 //12 // 121
		}
		System.out.println(s);
		
		if (temp == s) {
			System.out.println("palindrome");
		}else {
			System.out.println("not a palindrome");
		}
	}
	public static void main(String[] args) {
		NumberPalindrome number = new NumberPalindrome();
		number.palindromeNumber();
	}

}
