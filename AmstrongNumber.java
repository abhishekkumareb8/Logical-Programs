package Logical;

import java.util.Scanner;

public class AmstrongNumber {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter the number");
		int n=scanner.nextInt();
		System.out.println(Amstr(n));
		
		
	}
	
	
	public static int Amstr(int n) {
		int copy=n;
		int sum=0;
		while(n!=0) {
			int rem=n%10;
			sum+=rem*rem*rem*rem;
			n=n/10;
		}
		if(copy==sum) {
			int sum1=0;
			while(copy!=0) {
				int rem=copy%10;
				if(rem%2==0) {
					sum1=sum1+rem;
				}
				copy=copy/10;
			}
			return sum1;
		}
		
		else {
			int sum1=0;
			
			while(copy!=0) {
				int rem=copy%10;
				if(rem%2==1) {
					sum1=sum1+rem;
				}
				copy=copy/10;
			}
			return sum1;
		}
			
		
	}

}
