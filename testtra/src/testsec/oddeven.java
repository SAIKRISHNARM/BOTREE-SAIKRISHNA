package testsec;

import java.util.Scanner;

public class oddeven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int N = sc.nextInt();
		if(N%2 == 1 || N>= 6 && N<=20)
	          System.out.println("Weird");
	        
	        else if  (N%2 == 0 || N >= 2 && N<= 5)
	        
	            System.out.println( "Not Weird");      
	        
	        else
	           System.out.println("Not Weird"); 
		sc.close();
	        
	        

	       

	}

}
