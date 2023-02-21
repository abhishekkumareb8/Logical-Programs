package Logical;

import java.util.Scanner;

public class ReverseNumber {
	
	
	public static void reve(int a) {
		
		int reverse=0;
		while(a!=0) {
			int rem= a%10;
			reverse=reverse*10+rem;
			a=a/10;
		}
		System.out.println(reverse);
	}
	
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the number");
		int a=s.nextInt();
		reve(a);
	}
}
