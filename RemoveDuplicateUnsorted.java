package Logical;

import java.util.Scanner;

public class RemoveDuplicateUnsorted {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter the lenth of the array");
		int len= scanner.nextInt();
		int arr[]= new int [len];
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the array elements");
			arr[i]=scanner.nextInt();
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length-1;j++) {
				if(arr[j]>arr[i+1]) {
					int temp=arr[i+1];
					arr[i+1]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int k=0;k<arr.length;k++) {
			System.out.println(arr[k]);
		}
	}

}
