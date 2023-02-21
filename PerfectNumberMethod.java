package Logical;

import java.util.Scanner;

public class PerfectNumberMethod {
	public static boolean isPrefect(int n) {
		int sum = 1;
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				sum = sum + i;
			}
		}
		return sum == n;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the range");
		int n = scanner.nextInt();
		boolean res = isPrefect(n);
		if (res) {
			System.out.println("Perfect numver");
		}else {
			System.out.println("Not perfect number");
		}
	}

}
