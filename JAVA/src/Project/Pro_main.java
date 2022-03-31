package Project;

import java.lang.reflect.Array;
import java.util.*;

public class Pro_main {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("WELCOME TO SUMMA SHOPPING ");

		for (int i = 0; i < 3; i++) {
			
			System.out.println("Enter the product id:");
			int id = s.nextInt();
			System.out.println("Enter the product name:");
			String nam = s.next();
			System.out.println("Enter the product detail:");
			String det = s.next();
			System.out.println("Enter the product price:");
			int pri = s.nextInt();

			Pro_price pro2 = new Pro_price();

			ArrayList<Pro_detail> pro1 = new ArrayList<Pro_detail>();
			pro1.add(new Pro_detail(id, nam, det, pri));
			for (Pro_detail p : pro1) {

			System.out.println(pro1);
				pro2.check(p);
				pro2.pay();
				//pro2.emi();

			}
		}
	}
}
