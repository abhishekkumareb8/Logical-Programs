package Logical;

import java.util.Scanner;

public class PrimeNumberInGivenRange {
	
	public static boolean isPrimeNumber(int n) {
		int count=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				count++;
			}
		}
		if(count==2) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter the number");
		int number= scanner.nextInt();
		for(int i=1;i<=number;i++) {
			boolean result= isPrimeNumber(i);
			if(result) {
				System.out.println(i);
			}
		}
	}

}
