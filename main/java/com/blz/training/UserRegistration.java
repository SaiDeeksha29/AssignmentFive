package com.blz.training;

import java.util.Scanner;

import java.util.regex.*;

public class UserRegistration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your First Name");
		String firstName = sc.next();
		boolean fName = firstName.matches("^[A-Z][a-zA-Z]{2,}$");

		// Validating First Name
		if (fName == true) {
			System.out.println("Your First Name is : " + firstName);
		} else {
			System.out.println("First Name does not match the requirements");
		}

		System.out.println("Enter your Last Name");
		String lastName = sc.next();
		boolean lName = lastName.matches("^[A-Z][a-zA-Z]{2,}$");

		// Validating Last Name
		if (lName == true) {
			System.out.println("Your Last Name is : " + lastName);
		} else {
			System.out.println("Last Name does not match the requirements");
		}
	}

}