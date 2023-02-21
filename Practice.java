package Logical;

import java.util.Arrays;

public class Practice {

	public static boolean check(int a[], int b[]) {
		int count = 0;
		Arrays.sort(a);
		Arrays.sort(b);
		String s1=Arrays.toString(a);
		String s2=Arrays.toString(b);
//		if (a.length == b.length) {
//			for (int i = 0; i < a.length; i++) {
//				if (a[i] == b[i]) {
//					count++;
//				}
//			}
//			if (count == a.length) {
//				return true;
//			} else {
//				return false;
//			}
//		}
//		return false;
		if(s1.equals(s2)) {
			return true;
		}else {
			return false;
		}
	}
	public static void main(String[] args) {
		int []a= {0,2,1,4,5};
		int [] b= {0,4,1,5,4};
		System.out.println(check(a, b));
		
	}

}
