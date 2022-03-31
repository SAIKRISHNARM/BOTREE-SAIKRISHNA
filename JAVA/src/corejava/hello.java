package corejava;

 class helloData 
{
	String name;
	String lastname;
	int age ;
	long year;
	
	helloData(String name,String lastname)
	{
		this.name=name;
		this.lastname=lastname;
		System.out.println(name+""+lastname);
	
	}
	StringBuffer sb = new StringBuffer("hello");
	public void display() 
	{
		sb.append("s");
		System.out.println(sb);
	}
	helloData(int age,long year)
	{
		this.age=age;
		this.year=year;
		System.out.println(age+" "+year);
	}
   
}
 public class hello {
	public static void main(String args[])
	{
		helloData si =new helloData("sai","krishna");
		helloData si3=new helloData(20,2020);
		helloData si2=new helloData("dee","");
		
		
		
		
	}

}