package Logical;

import java.util.Scanner;

public class AbundedNumber {

	public static boolean isAbundent(int a) {
		int sum=0;
		for(int i=1;i<=a/2;i++) {
			if(a%i==0) {
				sum+=i;
			}
		}
		if(sum>a) {
			
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter the number");
		int a= scanner.nextInt();
		boolean res= isAbundent(a);
		if(res) {
			System.out.println(a+" is Abundent number");
		}else {
			System.out.println(a+" is not Abundent number");
		}
	}

}
