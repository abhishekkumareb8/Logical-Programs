package Logical;

public class StringToIntiger {

	public static void main(String[] args) {

		String str="abhi_1";
		String [] arr=str.trim().split("_");
		int val= Integer.parseInt(arr[1]);
		System.out.println(val+3);
		
	}

}
