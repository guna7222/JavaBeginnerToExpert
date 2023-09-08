package com.guna.basics;

import java.util.Scanner;

public class WelcomeMsgWithUserName {

	// method to ask user name
	public String setUserName() {
		System.out.println("Enter Name:- ");
		Scanner sc = new Scanner(System.in);
		String userName = sc.nextLine();
		return userName;
	}

	public static void main(String[] args) {
		WelcomeMsgWithUserName name = new WelcomeMsgWithUserName();
		String uName = name.setUserName(); // assigning to local variable
		System.out.println("Welcome " + uName);
		System.out.println("welcome to the git course");
	}

}
