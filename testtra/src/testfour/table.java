package testfour;

import java.util.Scanner;

public class table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int n = sc.nextInt();
		System.out.println(n);

		int i;

		for (i = 1; i <= 10; i++) {
			int res;
			res = n * i;
			System.out.println(n +" * "+ i+" = "+res);
		}

	}

}
