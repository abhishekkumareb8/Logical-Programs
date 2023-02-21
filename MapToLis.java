package Logical;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapToLis {
	
	public static void main(String[] args) {
		
		Map<Integer, String> map= new HashMap<>();
		map.put(1, "kumar");
		map.put(2, "abhi");
		List<Integer> l= new ArrayList<>(map.keySet());
		List<String> l1= new ArrayList<>(map.values());
		
//		for (String string : l1) {
//			System.out.println(string);
//		}
		for(int i=0;i<l.size();i++) {
			System.out.println(l.get(i));
			System.out.println(l1.get(i));
		}
		
	}

}
