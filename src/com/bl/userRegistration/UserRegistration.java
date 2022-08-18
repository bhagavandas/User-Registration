package com.bl.userRegistration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	public static void main(String[] args) {
		System.out.println("Welcome to User Registration Program!");

		//validating First name
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your First Name should have one Caps and 3 minimum characters :");
		String firstName = input.next();
		if (firstName(firstName))
			System.out.println("First Name is : " + firstName);
		else
			System.out.println("Entered First Name is invalid.Please check it! ");

	}

	// validate first name
	public static boolean firstName(String firstName) {
		return firstName.matches("[A-Z]{1}[a-z]{3,}+$");
	}
	
	// validate last name
		public static boolean lastName(String lastName) {
			return lastName.matches("[A-Z][a-z]*");
		}
}
