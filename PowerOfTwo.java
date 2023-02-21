package Logical;

import java.util.Scanner;

public class PowerOfTwo {
	
	public static boolean checkNumber(int n) {
		if (n == 0)
            return false;
 
        while (n != 1) {
            if (n % 2 != 0)
                return false;
            n = n / 2;
         
        }
        return true;
		
	}
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter the number");
		int n= scanner.nextInt();
		System.out.println(checkNumber(n));
		
	}

}
