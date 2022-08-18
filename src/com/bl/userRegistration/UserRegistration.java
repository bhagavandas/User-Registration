package com.bl.userRegistration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	public static void main(String[] args) {
		System.out.println("Welcome to User Registration Program!");
		Scanner input = new Scanner(System.in);
		
		// validating First name
		System.out.println("Enter your First Name should have one Caps and 3 minimum characters :");
		String firstName = input.next();
		if (firstName(firstName))
			System.out.println("First Name is : " + firstName);
		else
			System.out.println("Entered First Name is invalid.Please check it! ");
		
		//validating last name
		System.out.println("Enter your Last Name should have one Caps and 3 minimum characters :");
		String last_Name = input.next();
		if (lastName(last_Name))
			System.out.println("Last Name is : " + last_Name);
		else
			System.out.println("Entered Last Name is invalid.Please check it! ");
		

	}

	// validate first name
	public static boolean firstName(String firstName) {
		return firstName.matches("[A-Z]{1}[a-z]{3,}+$");
	}

	// validate last name
	public static boolean lastName(String last_Name) {
		return last_Name.matches("[A-Z][a-z]*");
	}
}
