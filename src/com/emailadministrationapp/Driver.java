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

public class Driver {

	public static void main(String[] args) {
		// get user's first name
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your first name");
		// get user's last name
		String firstName = scanner.next();
		System.out.println("Enter your last name");

		String lastName = scanner.next();
		// create EmailApp class object
		EmailApp emailApp = new EmailApp(firstName, lastName);
		// call show info method by use of emailApp object
		emailApp.ShowInfo();
		// call change password method by use of emailApp object
		emailApp.changePassword();
		scanner.close();
	}

}
