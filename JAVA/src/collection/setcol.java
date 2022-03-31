package collection;
import java.util.*;

public class setcol {

	public static void main(String[] args) {
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		set.add("no");
		set.add("krishna");
		set.add("sai");
		set.add("dee");
		set.add("name");
		for(String i:set) {
			System.out.println(i);
			}
		Set<String> set2 = new LinkedHashSet<String>();
		set.add("yes");
		set.add("ishna");
		set.add("bye");
		set.add("deeksha ");
		set.add("name solu");
//		for(String i:set2) {
//			System.out.println(i);
//			}
		
		Set<String> uni = new TreeSet<String>(set);
		uni.addAll(set2);
		for(String i:uni) {
			System.out.println(i);
			}
		
		

}}
