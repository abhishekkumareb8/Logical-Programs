package Logical;

import java.util.Scanner;

public class CountNoOfCher {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the word");
		String word = scanner.nextLine();
		String [] str = word.split(" ");
		for(int i=0;i<str.length;i++) {
			System.out.println(str[i].length());
		}
		
	}
}
