package Logical;

import java.util.Scanner;

public class BinnaryToDec {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter the binary number");
		int bi= scanner.nextInt();
		int tbi=bi;
		int pow=0;
		int des=0;
		while(tbi>0) {
			int r= tbi%10;
			des= des+r*(int)Math.pow(2,pow);
			pow++;
			tbi=tbi/10;
		}
		System.out.println("Number after conversion is "+des);
	}

}
