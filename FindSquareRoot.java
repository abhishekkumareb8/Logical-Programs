package Logical;

import java.util.Scanner;

public class FindSquareRoot {

	public static int findSquareRoot(int n) {
		for (int i = 1; i <= n; i++) {
			if (n / i == i && n % i == 0) {
				return i;
			}
		}
		return 0;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number to find square root");
		int n = scanner.nextInt();
		int sqr = findSquareRoot(n);
		if (sqr != 0) {
			System.out.println("Square root of " + n + " is " + sqr);
		} else {
			System.out.println("Square number is not possible for given number " + n);
		}
	}

}
