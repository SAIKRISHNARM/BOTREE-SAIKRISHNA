package Execp;
import java.util.*;

public class logiclas {

	public void number() throws myownexp 
	{
		Scanner s =new Scanner(System.in);
		int nam = s.nextInt();
		if(nam< 18)
	{
		System.out.println("num is "+nam);
		throw new myownexp("Number is less error");
	}
		

	}

	
	
}
