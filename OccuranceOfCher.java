package Logical;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class OccuranceOfCher {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Word");
		String word = scanner.next();
		Set<Character> set = new TreeSet<>();
		for (int i = 0; i < word.length(); i++) {
			set.add(word.charAt(i));
		}
		for (Character c : set) {
			int count = 0;
			for (int i = 0; i < word.length(); i++) {
				if (c == word.charAt(i)) {
					count++;
				}
			}
			System.out.println(count);
		}

	}

}
