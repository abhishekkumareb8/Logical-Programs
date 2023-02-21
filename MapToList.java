package Logical;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapToList {

	public static void main(String[] args) {
		Map<Integer, String> map= new HashMap<>();
		map.put(1, "abh");
		map.put(2, "efg");
//		for(int keyy:map.keySet()) {
//			System.out.println("Key of map is: "+keyy);
//		}
//		for(String val:map.values()) {
//			System.out.println("Value of map is: "+val);
//		}
		List<Integer> list= new ArrayList<>(map.keySet());
		List<String> list2= new ArrayList<>(map.values());
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
			System.out.println(list2.get(i));
		}
	}
	

}
