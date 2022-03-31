package corejava;

import java.util.Scanner;

public class Arrcre {
	public static void main(String[] args)
	{
		
		int even[] = new int[10];
		int odd[] = new int[10];
		int prime[] = new int[10];
		int sai[] = { 4, 5, 6 };
		Scanner s = new Scanner(System.in);
		for (int i = 0; i <= 2; i++) 
			System.out.println("sai " + sai[i]);
		
		for (int i = 0; i <= 5; i++) 
			{
			prime[i] = i + 1;
			System.out.println(i);
			
			}
//		
		for (int j = 0; j <= 4; j++)
		{
			//System.out.println("Enter the value for prime array ");
			odd[j] = s.nextInt();
			System.out.println(j);
		}
	}
}