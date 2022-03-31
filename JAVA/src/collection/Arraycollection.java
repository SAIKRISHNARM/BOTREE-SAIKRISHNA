package collection;
import java.util.ArrayList;
public class Arraycollection
{
	public static void main(String[] args) {
	ArrayList<String> arr = new ArrayList<String>();
	arr.add("ram");
	arr.add("krish");
	for(String i:arr) {
		System.out.println(i);
	}
	ArrayList<Integer> arr1 = new ArrayList<Integer>();
	arr1.add(100);
	arr1.add(1000);
//	arr1.remove(100);
	for(Integer i:arr1) {
		System.out.println(i);
	}
	
	}
	}
