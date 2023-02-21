package Logical;

public class Fabonacii {

	public static void main(String[] args) {
		int n1=0;
		int n2=1;
		int f3;
//		System.out.println(n1+" "+n2);
		for(int i=0;i<10;i++) {
			f3=n1+n2;
			System.out.println(f3);
			n1=n2;
			n2=f3;
		}
		
	}

}
