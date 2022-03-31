package corejava;

class dayone 
{
	public static void dec(int a,int b)
	{
		if(a<b)
		{
		System.out.println(a+b);
		}
		else
		{
			System.out.println(a*b);
		}
	}
	public static void profile()
	{
		System.out.println("My Name is sai");
		System.out.println("Age is 20");
	}
	public static void passing()
	{
		int pass_mark=50,sai_mark=60;
	    if (sai_mark>=pass_mark)
	    {
	    System.out.println("sai passed");
	    
	    } 
	    else 
	    {
	    System.out.println("sai failed");
	    }  
	}
	public static void  res()
	{
		for (int i=0;i<=5;i++)
				{
					System.out.println(i);
				}
	}
	
	
	public static void main (String args[])
	{
		dec(5,4);
		passing();
		profile();
		res();
		
	}

}
