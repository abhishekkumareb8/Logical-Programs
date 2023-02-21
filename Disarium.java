package Logical;

import java.util.Scanner;

public class Disarium {

	public static int noOfCount(int number) {
		int count=0;
		while(number!=0) {
			int r= number%10;
			count++;
			number= number/10;
		}
		return count;
	}
	
	public static boolean isDisarium(int number) {
		int power=noOfCount(number) ;
		int sum=0;
		int n1=number;
		while(number!=0) {
			int r=number%10;
			sum+=Math.pow(r, power);
			power--;
			number/=10;
		}
		if(sum==n1) {
			return true;
		}
		return false;
	} 
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter the number");
		int number= scanner.nextInt();
		if(isDisarium(number)) {
			System.out.println(number+" is disarium number");
		}else {
			System.out.println(number+" is not disarium number");
		}
	}
	
}
