package Logical;

import java.util.Scanner;

public class FirstLetterToCap {

	public static String toUppder(String str1, String str2) {
		String string = str1.toUpperCase();
		return str2.replace(str1.charAt(0), string.charAt(0));

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the 1st String");
		String s = scanner.next();
		String s1=s.toLowerCase();
		System.out.println("Enter the 2nd String");
		String si = scanner.next();
		String s2=si.toLowerCase();
		if(s1.equals(s2)) {
		System.out.println("Converted String is "+toUppder(s1, s2));
		}else
		System.out.println("String is not same");
	}

}
