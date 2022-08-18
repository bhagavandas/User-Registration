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

		// validating last name
		System.out.println("Enter your Last Name should have one Caps and 3 minimum characters :");
		String last_Name = input.next();
		if (lastName(last_Name))
			System.out.println("Last Name is : " + last_Name);
		else
			System.out.println("Entered Last Name is invalid.Please check it! ");

		// validating email - abc.xyz@bl.co.in
		System.out.println("Enter your Email should has 3 mandatory parts(abc,bl & co) & 2 optional (xyz and in) :");
		String valid_Email = input.next();
		if (email(valid_Email))
			System.out.println("Last Name is : " + valid_Email);
		else
			System.out.println("Entered Last Name is invalid.Please check it! ");

		// validating email - abc.xyz@bl.co.in
		System.out.println("Enter your mobile number  :");
		String mob_Num = input.next();
		if (mobileNumber(mob_Num))
			System.out.println("Mobile Number is : " + mob_Num);
		else
			System.out.println("Entered Mobile Number is invalid.Please check it! ");

		// validating Password
		System.out.println("Enter your Password, it shuld have minimum 8 characters  :");
		String pwd = input.next();
		if (passwordRule_1(pwd))
			System.out.println("Entered Password is : " + pwd);
		else
			System.out.println("Entered Password is invalid.Please check it! ");

	}

	// validate first name
	public static boolean firstName(String firstName) {
		return firstName.matches("[A-Z]{1}[a-z]{3,}+$");
	}

	// validate last name
	public static boolean lastName(String last_Name) {
		return last_Name.matches("[A-Z]{1}[a-z]{3,}+$");
	}

	// validate Email
	public static boolean email(String valid_Email) {
		return valid_Email.matches("[abc+](.+)?[a-z](@)?[bl+](.+)[co+](.+)[a-z]{2}$");
	}

	// validate Email
	public static boolean mobileNumber(String mob_Num) {
		return mob_Num.matches("[0-9]{2}( )[0-9]{10}$");
	}

	// validate Email
	public static boolean passwordRule_1(String pwd) {
		return pwd.matches("[a-z]{8,}+$");
	}

}
