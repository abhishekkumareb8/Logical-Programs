package Logical;

import java.util.Scanner;

public class WordStartingWithVowel {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Sentence");
		String str = scanner.nextLine();
		int count = 0;
		for (int i = 0; i <= str.length(); i++) {
			int startingIndex=i;
			while (i < str.length() && str.charAt(i) != ' ') {
				i++;
			}
			if (str.charAt(startingIndex) == 'a' || str.charAt(startingIndex) == 'e' || str.charAt(startingIndex) == 'i' || str.charAt(startingIndex) == 'o'
					|| str.charAt(startingIndex) == 'u') {
				count++;
			}else if(str.charAt(startingIndex) == 'A' || str.charAt(startingIndex) == 'E' || str.charAt(startingIndex) == 'I' || str.charAt(startingIndex) == 'O'
			
					|| str.charAt(startingIndex) == 'U')
			{
				
				count++;
			}
			
		}
		System.out.println(count);
	}

}
