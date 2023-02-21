package Logical;

import java.util.Scanner;

public class meterSqTocentimeter {
	public static double toCentimeter(double meter) {
//		double centimeter;
		return 10000*meter;
		
	}
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter Meter to convert to centimeter");
		double meter= scanner.nextDouble();
		System.out.println(toCentimeter(meter));
	}
}
