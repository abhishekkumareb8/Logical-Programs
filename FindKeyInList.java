package Logical;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FindKeyInList {
	public static  Map<Integer, String> keyFind(int key) {
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "Abhi");
		map.put(2, "Sahana");
		map.put(3, "Manoj");
		map.put(4, "Karthik");
		map.put(5, "Tharun");
//		for (Map.Entry<Integer, String> entry : map.entrySet()) {
//			if (key < entry.getKey()) {
//				System.out.println(entry.getKey() + entry.getValue());
//			}
//		}
		return map;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the key");
		int key = scanner.nextInt();
		Map<Integer, String> map = keyFind(key);
		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			if (key <= entry.getKey()) {
				System.out.println(entry.getKey() + " " + entry.getValue());
			}

		}
	}

}
