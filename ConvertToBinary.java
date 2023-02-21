package Logical;

import java.util.Scanner;

public class ConvertToBinary {

	public static String toBinary(int n) {
		String bin="";
		while(n!=0) {
			int r=n%2;
			bin=r+bin;
			n=n/2;
		}
		return bin;
	}
	
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter the degit to convert to binary");
		int n= scanner.nextInt();
		System.out.println(toBinary(n));	
	}
}
