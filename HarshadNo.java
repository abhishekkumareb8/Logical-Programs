package Logical;

import java.util.Scanner;

public class HarshadNo {
	public static boolean isHarshad(int number) {
		int sum=0;
		int temp=number;
		while(number!=0) {
			int rem= number%10;
			sum+=rem;
			number/=10;
		}
		if(temp%sum==0) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter the Number to check");
		int number= scanner.nextInt();
		if(isHarshad(number) && number >9) {
			System.out.println(number+" is Harshad number");
		}
		else {
			System.out.println(number+" is not Harshad number");
		}
	}
}
