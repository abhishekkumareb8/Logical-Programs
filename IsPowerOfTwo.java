package Logical;

import java.util.Scanner;

public class IsPowerOfTwo {

	public static boolean isPowerOfTwo(int n) {
		while(n%2==0) {
			n=n/2;
			if(n==2) {
				return true;
			}
				
		}
		return false;
		
	}
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter the number");
		int number= scanner.nextInt();
		boolean res= isPowerOfTwo(number);
		if(res) {
			System.out.println(number+" number is power of two");
		}else {
			System.out.println(number+" number is not power of two");
		}
	}

}
