package corejava;

public class function {
	public static float add(float a,float b)
	{
		return(a+b);
	}
	public static int sub(int a,int b)
	{
		return(a-b);
	}
	public static void mul(int a,int b)
	{
		System.out.println(a*b);
	}
	public static void div()
	{
		int a=10,b=5;
		System.out.println(a/b);
	}
	
	public static void main(String args[])
	{
		float res=add(3.2f,7.8f);
		System.out.println(res);
		System.out.println(sub(5,2));
		mul(5,2);
		div();
	}

}
