package Project;


public class Pro_detail {
	  public  String  P_name ,P_detail;
	  public Integer P_price,P_id ;
	
	
	
	public Pro_detail() {
		super();
		
	}


	public Pro_detail(Integer p_id, String p_name, String p_detail, Integer p_price) {
		super();
		P_id = p_id;
		P_name = p_name;
		P_detail = p_detail;
		P_price = p_price;
	}


	public Integer getP_id() {
		return P_id;
	}


	public void setP_id(Integer p_id) {
		P_id = p_id;
	}


	public String getP_name() {
		return P_name;
	}


	public void setP_name(String p_name) {
		P_name = p_name;
	}


	public String getP_detail() {
		return P_detail;
	}


	public void setP_detail(String p_detail) {
		P_detail = p_detail;
	}


	public Integer getP_price() {
		return P_price;
	}


	public void setP_price(Integer p_price) {
		P_price = p_price;
	}


	@Override
	public String toString() {
		return " P_id=" + P_id + "\n P_name=" + P_name + "\n P_detail=" + P_detail + "\n P_price=" + P_price+"\n";
	}
	
	
	
}
	

	


	
	
	

