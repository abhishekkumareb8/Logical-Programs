package Logical;

import java.util.Scanner;

public class DuckNumber {
	
	public static boolean isDuckNumber(int n) {
		while (n!=0) {
			if(n%10==0) {
				return true;
			}
			n=n/10;
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter the number");
		int number= scanner.nextInt();
			boolean res= isDuckNumber(number);
			if(res) {
				System.out.println(number+" Number is Duck Number");
		}else
		{
			System.out.println(number +" Number is not Duck number");
		}
	}

}
