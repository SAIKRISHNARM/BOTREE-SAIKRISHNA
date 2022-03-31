package Project;

public class Pro_price extends pro_payment{
	 public void check(Pro_detail pro1) { 
		 if (pro1.P_detail.equals("HP")||pro1.P_detail.equals("MSI")||pro1.P_detail.equals("DELL")&&pro1.P_price>100000)
		 {
			 System.out.println("DIS 60%");
			 
		 }
		 else if (pro1.P_detail.equals("HP")||pro1.P_detail.equals("MSI")||pro1.P_detail.equals("DELL")||pro1.P_name.equals("LAPTOP")||pro1.P_name.equals("MOBILE")||pro1.P_name.equals("BALL")) 
			 System.out.println("DIS 10%");
		 else 
		 {
			 System.out.println("DIS 5%");
		 }

}
}