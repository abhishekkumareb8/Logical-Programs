package Logical;

import java.util.Scanner;

public class Factorial {
	public static int findFactorial(int n) {
		int fact = 1;
		for(int i=1;i<=n;i++) {
			fact= fact*i;
		}
		return fact;
	}
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter the number to find factorial");
		int n= scanner.nextInt();
		for(int i=1;i<=n;i++) {
			int res= findFactorial(i);
			System.out.println("factorial of "+i+" is "+res);
		}
	}

}
