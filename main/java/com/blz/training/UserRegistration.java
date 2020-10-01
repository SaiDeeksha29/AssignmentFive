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

		System.out.println("Enter your email");
		String email = sc.next();
		boolean e = email.matches("^[a-z]{3,}(.([a-z]{3,}))?@[a-z]{2,}.[a-z]{2,}.in$");

		// Validating Email
		if (e == true) {
			System.out.println("Your Email is : " + email);
		} else {
			System.out.println("Email does not match the requirements");
		}

		System.out.println("Enter your mobile number");
		String mobile = sc.nextLine();
		boolean m = mobile.matches("^[0-9]{2}[' '][6-9][0-9]{9}$");

		// Validating Mobile Number
		if (m == true) {
			System.out.println("Your Mobile number is : " + mobile);
		} else {
			System.out.println("Mobile number does not match the requirements");
		}

		System.out.println("Enter your password");
		String password = sc.next();
		Boolean p = password.matches("[a-z]{8,}");

		// Validating password using Rule 1
		if (p == true) {
			System.out.println("Your Password is : " + password);
		} else {
			System.out.println("Password does not match the requirements");
		}

		System.out.println("Enter your password");
		String password1 = sc.next();
		boolean p1 = password1.matches("(?=.*[A-Z])([a-zA-Z]|[^a-zA-Z0-9_])(^<>'\"/;`%]){8,}$");

		// Validating password using Rule 2
		if (p1 == true) {
			System.out.println("Your Password is : " + password1);
		} else {
			System.out.println("Password does not match the requirements");
		}

		System.out.println("Enter your password");
		String password2 = sc.next();
		boolean p2 = password2.matches("(?=.*[A-Z])(?=.*\\d)([a-zA-Z0-9_]|[^a-zA-Z0-9_])(^<>'\"/;`%]){8,}$");

		// Validating password using Rule 3
		if (p2 == true) {
			System.out.println("Your Password is : " + password2);
		} else {
			System.out.println("Password does not match the requirements");
		}

		System.out.println("Enter your password");
		String password3 = sc.next();
		boolean p3 = password3.matches("([<>!@#$%^&*'\"/;`%])(?=.*[A-Z])(?=.*\\d)[a-zA-Z0-9_]{8,}");

		// Validating password using Rule 4
		if (p3 == true) {
			System.out.println("Your Password is : " + password3);
		} else {
			System.out.println("Password does not match the requirements");
		}

		System.out.println("Enter your email sample");
		String emailSample = sc.next();
		boolean e2 = emailSample.matches(
				"^(abc)+(((\\.[0-9])|(\\+[0-9])|(\\-[0-9])|[0-9]){0,})@[a-z0-9]{1,}(.)(([a-z0-9]{2,}(.))|([a-z0-9]{2,}(,)))[a-z0-9]{0,}");

		// Validating email samples
		if (e2 == true) {
			System.out.println("Your email sample is : " + emailSample);
		} else {
			System.out.println("email sample does not match the requirements");
		}
	}

}
