package Logical;

import java.util.HashMap;
import java.util.Map;

public class NoOfChar {
	public static void main(String[] args) {
	String s="apple";
	Map<Character,Integer> map=new HashMap<>();
	for(int i=0;i<s.length();i++) {
		Character c= s.charAt(i);
		Integer in=map.get(i);
		if(in==null) {
			map.put(c, in);
		}else
			map.put(c, in+1);
	}
	System.out.println(map);
	}
}
