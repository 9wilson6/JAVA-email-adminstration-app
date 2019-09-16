package com.emailadministrationapp;
/*
 * name:
 *    	 Viswas Vatte              
 * date:
 *     	September 16,2019
 * description:
 * 		this application generates a user email and assigns them a 
 * 		random password.
 * 		the email is based on the users first name last name
 * 		 and the department to which they belong
 * 		the password is generated randomly from this set of characters
 *   	"ABDCEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$"
 * 
 **/
import java.util.Scanner;

public class EmailApp {
	private String firstName, lastName, password, department;
	private int mailboxCapacity = 500;
	private int passwordLength = 10;

	public EmailApp(String firstName, String lastName) {
		this.firstName = firstName.toLowerCase();
		this.lastName = lastName.toLowerCase();
		this.department = setDepartment();
		this.password = randomPassword(passwordLength);

	}

	Scanner scanner = new Scanner(System.in);

	private String setDepartment() {

		System.out.println("Enter your department code");
		System.out.println("* no department : 0\n" 
				+ "* cs(computer scienc): 1\n" 
				+ "* act(accounting): 2\n"
				+ "* ee(electrical engineering): 3");

		int departmentNumber = scanner.nextInt();
		// set department base on entered value
		if (departmentNumber == 0) {
			this.department = "";
		}
		if (departmentNumber == 1) {
			this.department = "cs.";
		}
		if (departmentNumber == 2) {
			this.department = "act.";
		}
		if (departmentNumber == 3) {
			this.department = "ee.";
		}
//		this.department=
		return this.department;
	}

	private String randomPassword(int passlength) {

		// String from which the characters will be randomly selected
		String characterSet = "ABDCEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$";

		// create StringBuffer size of password length
		StringBuffer stringbuffer = new StringBuffer(passlength);
		for (int x = 0; x < passlength; x++) {

			// get a random number within the range of 0 to characterSet length
			int index = (int) (Math.random() * characterSet.length());

			// append Character randomly into the string buffer one by one
			stringbuffer.append(characterSet.charAt(index));
		}
		// assign the value of string buffer to the password variable
		this.password = stringbuffer.toString();
		// return password value
		return this.password;
	}

	public void changePassword() {
		// call the randomPassword method to regenerate a new password.
		System.out.println("Changed password: " + randomPassword(passwordLength));
	}

	public void ShowInfo() {
		// display all the information in a formated manner
		System.out.printf("Email: %s \nPassword: %s\nMail Box Capacity: %d \n",
				this.firstName + "." + this.lastName + "@" + this.department + "saumag.edu", this.password,
				this.mailboxCapacity);
	}
}
