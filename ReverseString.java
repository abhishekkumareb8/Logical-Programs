package Logical;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the USer name");
		String u_name = scanner.next();

		if (u_name.length() < 8 || u_name.length() > 30) {
			System.out.println("VALID");
			
		} else {
			System.out.println("INVALID; Username length < 8 characters");
		}
		
		char ch[]= u_name.toCharArray();
		if(ch[0]<48 || ch[0]>57) {
			System.out.println("VALID");
		}else {
			System.out.println("INVALID; Username begins with non-alphabetic character");
		}
	}
}
