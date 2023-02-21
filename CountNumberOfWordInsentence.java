package Logical;

import java.util.Scanner;

public class CountNumberOfWordInsentence {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter the sentence");
		String str= scanner.nextLine();
		String [] arrs= str.trim().split(" ");
		System.out.println("Totel number in Sentence is "+arrs.length);
		for(int i=0;i<=arrs.length-1;i++) {
			System.out.println(arrs[1]);
		}
	}

}
