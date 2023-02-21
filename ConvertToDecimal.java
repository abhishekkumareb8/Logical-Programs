package Logical;

import java.util.Scanner;

public class ConvertToDecimal {

	public static int toDecimal(int n) {
		int pow=0;
		int dec=0;
		while(n!=0) {
			int rem=n%10;
			dec=dec+rem*(int)Math.pow(2, pow);
			pow++;
			n=n/10;
		}
		return dec;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the binary number");
		int n= scanner.nextInt();
		System.out.println(toDecimal(n));
	}

}
