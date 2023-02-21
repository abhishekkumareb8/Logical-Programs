package Logical;

import java.util.Scanner;

public class Arrays2D {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the row size");
		int row= s.nextInt();
		System.out.println("Enter the column size");
		int col= s.nextInt();
		int [][] number= new int[row][col];
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.println("Enter "+ i +" row "+"and "+ j +" column value");
				number[i][j]=s.nextInt();
			}			
		}
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(number[i][j]+" ");
			}
			System.out.println();
		}
	}

}
