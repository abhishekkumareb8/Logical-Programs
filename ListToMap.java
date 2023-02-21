package Logical;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListToMap {

	private Integer id;
	private String name;

	@Override
	public String toString() {
		return "ListToMap [id=" + id + ", name=" + name + "]";
	}

	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public ListToMap() {
		super();
	}

	public ListToMap(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public static void main(String[] args) {
		List<ListToMap> list= new ArrayList<>();
		list.add(new ListToMap(1,"Abhis"));
		list.add(new ListToMap(2,"Kumar"));
		Map<Integer, String> map= new HashMap<>();
		for(ListToMap m:list) {
			map.put(m.getId(),m.getName());
			System.out.println(m);
		}
		System.out.println(map);
	}

}
