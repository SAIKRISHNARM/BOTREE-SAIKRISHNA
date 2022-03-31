package view;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import Controller.controllerset;
import model.product;

public class finalcall {
	public void display() throws ClassNotFoundException, SQLException {
		Label:
			while(true) {
		Scanner s = new Scanner(System.in);
		System.out.println("ENTER \n 1 FOR INSERT \n 2 FOR UPDATE  \n 3 FOR DELETE \n 4 FOR DISPLAY\n 5 EXIT");
		int key = s.nextInt();
		switch (key) {
		case 1:{
			controllerset.insertshow();
			break;
		}
		case 2:{
			controllerset.updateshow();
			break;
		}
		case 3:{
			controllerset.deleteshow();
			break;
			
		} 
		case 4:
		{
			List<product> prodlist=controllerset.allproduct();
			for (product p:prodlist)
				System.out.println(p);
			//prodlist.forEach(System.out::println);
		 //prodlist.stream().filter(m->m.getPprice()>40000).map(p->p.getPprice()+2).forEach(System.out::println);
			List<product> lis= prodlist.stream().filter(q->q.getPname().contains("la")).collect(Collectors.toList());
			lis.forEach(System.out::println);
		 // prodlist.stream().map(q->q.getPname().contains("la")).forEach(System.out::println);
			break;
		}
		case 5:{
			break Label;
		}
			default:
				System.out.println("INPUT ");
		}
	}
		
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		finalcall fc = new finalcall();
		fc.display();
	}

}
