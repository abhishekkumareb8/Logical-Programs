package Logical;

public class DeleteTheDuplicate {

	public static void main(String[] args) {
		int[] a = { 1, 2, 2, 3, 4 };
		int[] b= new int [a.length];
		int j = 0;
		for (int i = 0; i < a.length - 1; i++) {
			if (a[i] != a[i + 1]) {
				b[j++] = a[i];
			}
		}
		b[j++]=a[a.length-1];
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
	}

}
