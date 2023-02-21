package Logical;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the year to check");
		int y= s.nextInt();
		if(y%100==0 && y%400==0 || y%100!=0 && y%4==0) {
			System.out.println("Its a leap Year");
		}else
		{
			System.out.println("Not a leap yaer");
		}
	}

}
