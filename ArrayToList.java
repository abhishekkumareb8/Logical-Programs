package Logical;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToList {
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6};
		List l= new ArrayList<>();
		
		for(int i=0;i<arr.length;i++) {
			l.add(arr[i]);
		}
		System.out.println(l);
	}
}
