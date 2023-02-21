package Logical;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class RemoveVowels {

//	public static void main(String[] args) {
//	        Scanner scanner = new Scanner(System.in);
//	        System.out.println("Enter the word");
//	         String str = scanner.nextLine();
//	         List<Character> list = Arrays.asList('a','e','i','o','u','A','E','I','O','U');
//	         char c[] = str.toCharArray();
//	         StringBuffer sb = new StringBuffer();
//	         for(Character newchar : c ){
//	             if(!list.contains(newchar)){
//	                 sb.append(newchar);
//	             }
//	         }
//	        System.out.println(sb);
//	    
//	}
	
//	public static void main(String[] args) {
//		String s="abhishek";
//		String s1="";
//		s1=s.replaceAll("[aeiouAEIOU]", "");
//		System.out.println(s1);
//	}
	
	public static void main(String[] args) {
		String s1="abhishek";
		String s2="";
		for(int i=0;i<s1.length();i++) {
			if(s1.charAt(i)!='a' && s1.charAt(i)!='e' && s1.charAt(i)!='i' && s1.charAt(i)!='o' && s1.charAt(i)!='u') {
				s2=s2+s1.charAt(i);
			}
			
		}
		System.out.println(s2);
	}

}
