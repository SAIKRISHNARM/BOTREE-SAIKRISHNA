package corejava;
import java.util.Scanner;
class Example
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);

	    System.out.println("Enter name, age and salary:");

	    
	    String name = s.nextLine();

	    int age = s.nextInt();
	    s.nextLine();
	    double salary = s.nextDouble();
	    System.out.println("Name: " + name); 
	    System.out.println("Age: " + age); 
	    System.out.println("Salary: " + salary); 
		
		}
	}

