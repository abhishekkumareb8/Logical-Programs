package Logical;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the length of the arrays");
		int l=s.nextInt();
		int arr[]= new int[l];
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the "+(i+1)+" number");
			arr[i]=s.nextInt();
		}
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j]<arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
//		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
	}
}
