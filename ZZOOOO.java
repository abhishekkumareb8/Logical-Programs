package Logical;

import java.util.Scanner;

public class ZZOOOO {
	
	public static void main(String[] args){
		Scanner scanner= new Scanner(System.in);
		System.err.println("Enyter tge jdfvsoi");
		String s= scanner.next();
		int x=0;
		int y=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='z') {
				x++;
			}else if(s.charAt(i)=='o') {
				y++;
			}
		}
		if(2*x==y) {
			System.out.println("yes");
		}else
			System.out.println("no");
	}
	
}
