package Logical;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListToArrays {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		int[] arr = new int[list.size()];
		for (int i = 0; i < arr.length; i++) {

			arr[i]=list.get(i);
		}
		for (int i = 0; i < arr.length; i++) {

			System.out.println(arr[i]);
		}
	}

}
