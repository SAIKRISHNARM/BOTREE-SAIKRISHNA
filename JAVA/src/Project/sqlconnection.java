package Project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class sqlconnection {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection co = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "root");
		Statement sta = co.createStatement();
		PreparedStatement pst;
		ResultSet rs = sta.executeQuery("select * from produ_t;");
		Scanner s = new Scanner(System.in);
		System.out.println("ENTER \n 1 FOR INSERT \n 2 FOR UPDATE  \n 3 FOR DELETE \n 4 FOR DISPLAY");
		int key = s.nextInt();
		switch (key) {
		case 1: {
			String query1 = "insert into produ_t(p_id,p_name,p_detail,p_price)values(?,?,?,?)";
			pst = co.prepareStatement(query1);
			System.out.println(" ENTER PRODUCT ID, NAME, DETAIL, PRICE ");

			pst.setInt(1, s.nextInt());
			pst.setString(2, s.next());
			pst.setString(3, s.next());
			pst.setInt(4, s.nextInt());
			int row = pst.executeUpdate();
			System.out.println("Row Inserted " + row);
			break;
		}
		case 2: {
			System.out.println("ENTER PRODUCT DETAIL AND ID TO UPDATE");
			String quer2 = ("update produ_t set p_detail=? where p_id =?");
			pst = co.prepareStatement(quer2);
			pst.setString(1, s.nextLine());
			pst.setInt(2, s.nextInt());
			int ro = pst.executeUpdate();
			System.out.println("Row Update" + ro);
			break;
		}
		case 3: {
			System.out.println("ENTER PRODUCT ID TO DELETE");
			String quer3 = ("delete from produ_t where p_id=?");
			pst = co.prepareStatement(quer3);
			pst.setInt(1, s.nextInt());
			int ro = pst.executeUpdate();
			System.out.println("Row Delete" + ro);

		}
		case 4: {
			while (rs.next()) {

				System.out.println(rs.getInt("P_id") + "   " + rs.getString("p_price") + "  " + rs.getString("p_name")
						+ "   " + rs.getInt("p_price"));
			}
		}
		}

		sta.close();
		co.close();

	}

}
