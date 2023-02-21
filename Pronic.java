package Logical;

import java.util.Scanner;

public class Pronic {
	
	public static boolean isPronic(int a) {
		for (int i = 0; i < a; i++) {
			if(i*(i+1)==a) {
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter the number");
		int a = scanner.nextInt();
		boolean res= isPronic(a);
		if(res) {
			System.out.println(a+" is pronic number");
		}
		else
			System.out.println(a+" is not pronic number");
	}

}
