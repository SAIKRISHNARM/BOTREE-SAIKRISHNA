package corejava;

public class stringc {
	public static void main(String[] args) {
	String str1="sai ";
	System.out.println(str1);
	String str2 =new String("krishna");
	String str3= str1+str2;
	System.out.println(str3);
	
	StringBuffer str4=new StringBuffer("e36ga");
	
	
	str4.delete(1,3);
	str4.reverse();
	str4.append(" 20");
	
	System.out.println(str4);
	
	
	}

}
