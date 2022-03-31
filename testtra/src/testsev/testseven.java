package testsev;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class testseven {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection co = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");

		Statement sta = co.createStatement();
		ResultSet rs = sta.executeQuery("select * from product_test;");
	
		while (rs.next()) {


			System.out.println(rs.getInt("Product_id") + "   " + rs.getString("Product_Name") + "  " + rs.getInt("Price")
					+ "   " + rs.getInt("Stock_Available")+" "+rs.getDate("Manufactured_Date"));
		}
		sta.close();
		co.close();
	}

}
