package model;

public class product {
	private int pid;
    private String pname;
	private String pdetail;
	private int pprice;
	public product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public product(int pid, String pname, String pdetail, int pprice) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.pdetail = pdetail;
		this.pprice = pprice;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPdetail() {
		return pdetail;
	}
	public void setPdetail(String pdetail) {
		this.pdetail = pdetail;
	}
	public int getPprice() {
		return pprice;
	}
	public void setPprice(int pprice) {
		this.pprice = pprice;
	}
	@Override
	public String toString() {
		return "pid=" + pid + "\t pname=" + pname + "\t  pdetail=" + pdetail + "\t pprice=" + pprice ;
	}
	
	  
	
	
}
