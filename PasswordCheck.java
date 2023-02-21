package Logical;

import java.util.Scanner;

public class PasswordCheck {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the password");
		String pass = scanner.next();
		int count = 0;
		if (pass.length() >= 8 && pass.endsWith("#"))
			for (int i = 0; i < pass.length(); i++) {
				if (pass.charAt(i) >= 48 && pass.charAt(i) <= 57) {
					count++;
				}
				if(pass.charAt(i)>=65 && pass.charAt(i)<=90) {
					count++;
				}
				if(pass.charAt(i)>=97 && pass.charAt(i)<=122) {
					count++;
				}
			}

		if (count > 0) {
			System.out.println("Correct password");
		} else {
			System.out.println("Incorrect password");
		}
	}

}
