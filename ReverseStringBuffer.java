package Logical;

public class ReverseStringBuffer {

	public static void main(String[] args) {
		String str = "hello";
		String str1 = str;
		StringBuffer buffer = new StringBuffer();
		buffer.append(str1);
		String n = buffer.reverse().toString();
		if (n.equals(str)) {
			System.out.println("yes");
		}
		else {
			System.out.println("no");
		}
		System.out.println(n);
	}

}
