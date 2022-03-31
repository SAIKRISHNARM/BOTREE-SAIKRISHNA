package Controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class jdconnection {

	public static Connection setDBconection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection co = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "root");

		System.out.println("connection done ");
		return co;

	}

	public static ResultSet getresultset(String query) throws SQLException, ClassNotFoundException {
		Connection co = setDBconection();
		Statement sta = co.createStatement();
		ResultSet rs = sta.executeQuery(query);
		return rs;

	}
	public static int insert(String query) throws ClassNotFoundException, SQLException
	{
		Connection co = setDBconection();
		//Statement sta = co.createStatement();
		PreparedStatement pst=co.prepareStatement(query);
		Scanner s = new Scanner(System.in);
		System.out.println(" ENTER PRODUCT ID, NAME, DETAIL, PRICE ");
		pst.setInt(1, s.nextInt());
		pst.setString(2, s.next());
		pst.setString(3, s.next());
		pst.setInt(4, s.nextInt());
		int row = pst.executeUpdate();
		System.out.println("Row Inserted " + row);
		return row ;
		
	}
	public static int update(String query) throws SQLException, ClassNotFoundException {
		Connection co = setDBconection();
		PreparedStatement pst=co.prepareStatement(query);
		Scanner s = new Scanner(System.in);
		System.out.println("ENTER PRODUCT DETAIL AND ID TO UPDATE");
		pst = co.prepareStatement(query);
		pst.setString(1, s.nextLine());
		pst.setInt(2, s.nextInt());
		int row = pst.executeUpdate();
		System.out.println("Row Update" + row);
		return row;
		
		
	}
	public static int delete(String query) throws SQLException, ClassNotFoundException {
		Connection co = setDBconection();
		PreparedStatement pst=co.prepareStatement(query);
		Scanner s = new Scanner(System.in);
		System.out.println("ENTER PRODUCT ID TO DELETE");
		String quer3 = ("delete from produ_t where p_id=?");
		pst = co.prepareStatement(quer3);
		pst.setInt(1, s.nextInt());
		int row = pst.executeUpdate();
		System.out.println("Row Delete" + row);

		return 0;
		
	}
}
