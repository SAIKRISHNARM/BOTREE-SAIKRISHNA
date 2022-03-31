
package Controller;

import java.util.*;
import java.sql.*;

import model.product;

public class controllerset {
	public static List<product> allproduct() throws ClassNotFoundException, SQLException {
		List<product> prodlist = new ArrayList<product>();
		String query = "select * from produ_t;";
		ResultSet rs = jdconnection.getresultset(query);

		while (rs.next()) {

			// System.out.println(rs.getInt("P_id") + " " + rs.getString("p_name") + " "
			// +rs.getString("p_detail")+ " " + rs.getInt("p_price"));
			String pname = rs.getString("p_name");
			String pdetail = rs.getString("p_detail");
			int pprice = rs.getInt("p_price");
			int pid = rs.getInt("P_id");
			prodlist.add(new product(pid, pname, pdetail, pprice));

		}

		return prodlist;

	}

	public static int insertshow() throws ClassNotFoundException, SQLException {
		String query = "insert into produ_t(p_id,p_name,p_detail,p_price)values(?,?,?,?)";
		jdconnection.insert(query);
		return 0;

	}

	public static int updateshow() throws ClassNotFoundException, SQLException {

		String query = ("update produ_t set p_detail=? where p_id =?");
		jdconnection.update(query);

		return 0;

	}

	public static int deleteshow() throws ClassNotFoundException, SQLException {
		String query = ("delete from produ_t where p_id=?");
		jdconnection.delete(query);

		return 0;
	}
}
