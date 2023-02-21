package Logical;

public class Frequency {
	public static void main(String[] args) {
		String s= "apple";
		String key="";
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			int count=0;
			if(!key.contains(ch+"")) {
				for(int j=0;j<s.length();j++) {
					if(ch==s.charAt(j)) {
						count++;
					}
					key+=ch;
				}
				System.out.println(ch+" fre "+" "+" "+count);
			}
		}
	}

}
