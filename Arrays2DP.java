package Logical;

import java.util.Scanner;

public class Arrays2DP {

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
		System.out.println("Enter the key to search");
		int key=s.nextInt();
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				if(number[i][j]==key) {
					System.out.println(key +" present at "+i+" row and "+j+" column ");
				}else {
					System.out.println(key+" not present in the arrays");
					break;
				}
			}
			System.out.println();
		}
	}

}
