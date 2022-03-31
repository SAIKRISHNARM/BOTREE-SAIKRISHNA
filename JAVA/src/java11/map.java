package java11;

import java.util.HashMap;
import java.util.Map;

public class map {
	public static void main(String[] args) {
		Map<String,Integer> map1=new HashMap<String,Integer>();
		map1.put("sai", 20);
		map1.put("krishna",1);
		for(Map.Entry E:map1.entrySet()) {
			System.out.println(E.getKey()+""+E.getValue());
		}
		map1.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
	}

}
