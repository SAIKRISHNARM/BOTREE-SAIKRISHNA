package collection;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.LinkedList;

public class Linkedlist {
	public static void main(String[] args) {
		List<Integer> list= new LinkedList<Integer>();
		list.add(200);
		list.add(400);
		list.add(100);
		for (Integer i:list) {
			System.out.println(i);
		}
		list.add(1000);
		list.remove(2);
		System.out.println("list after remove n add");
		for (Integer i:list)
		{
			System.out.println(i);
		}
		Iterator<Integer> li= list.iterator();
		while(li.hasNext())
		{
			System.out.println(li.next());
			
		}
//		Iterator<Integer> lit= list.listIterator();
//		while(lit.hasPrevious())
//		{
//		
//			System.out.println(lit.previous);
//			
//		}
		
		
}}
