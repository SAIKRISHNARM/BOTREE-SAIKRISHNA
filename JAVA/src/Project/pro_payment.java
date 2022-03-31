package Project;
import java.util.*;

public class pro_payment {
	

 public void pay() {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("\nDO YOU WANT TO PAY");
	 System.out.println("\nYES/NO");
	 String s =sc.nextLine();
	 if (s.equals("YES")||s.equals("yes")) {
		 System.out.println("ENTER THE CARD DETAILS");
		 int i= sc.nextInt();
		 //System.out.printf("%06%n",i);
		 System.out.println(i);
		 System.out.println("Payment is done");
		 
		 
	 }
	 else if(s.equals("no")||s.equals("NO"))
	 {
		 System.out.println("\nTHANK YOU");
		
	 }
	
 }
// public void emi(Pro_detail pro1) {
//	 Scanner em = new Scanner(System.in);
//	 System.out.println("\nDO YOU NEED EMI OPTION");
//	 System.out.println("\n YES /NO ");
//	 String ec = em.next();
//	 if (ec.equals("YES")||ec.equals("yes")) {
//		 int emi ;
//		 pro1.P_price.
//		 
//	 }
//	 else if(ec.equals("no")||ec.equals("NO")) {
//		 System.out.println("\nTHANK YOU");
//	 }
//	 
//	 
//	
// }
}
