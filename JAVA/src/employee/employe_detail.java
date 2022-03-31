package employee;
import java.util.*;
class employe_detail {
	public static void main(String args[]) {
		emplynamedetail arr[]=new emplynamedetail[6];
		arr[0] = new emplynamedetail("sai","krishna",1,576,67);
		arr[1] = new emplynamedetail("sai","krishna",2,454,56);
		arr[2] = new emplynamedetail("sai","krishna",3,576,67);
		arr[3] = new emplynamedetail("sai","krishna",4,576,67);
		
		List<emplynamedetail> arrli =new LinkedList<emplynamedetail>();
		arrli.add(arr[0]);
		arrli.add(arr[1]);
		arrli.add(arr[2]);
		arrli.add(arr[3]);
		for(emplynamedetail i:arrli) {
			System.out.println(i);
		}
		Iterator<emplynamedetail> arrlis= arrli.iterator();
		while (arrlis.hasNext()) {
			System.out.println(arrlis.next());
		}
		String str = arrli.toString();
		System.out.println(str);
		
		
		Emplmpl emp1 =new Emplmpl();
		emp1.last();
	}
}
