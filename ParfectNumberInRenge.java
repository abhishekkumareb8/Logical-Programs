package Logical;

import java.util.Scanner;

public class ParfectNumberInRenge {

	public static boolean isPrefect(int n) {
		int sum = 0;
		for (int i = 1; i < n; i++) {
			if (n % i == 0) {
				sum = sum + i;
			}
		}
		return sum == n;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = scanner.nextInt();
		for (int i = 2; i <= n; i++) {
			boolean res = isPrefect(i);
			if (res) {
				System.out.println(i);
			} 
		}
	}

}
