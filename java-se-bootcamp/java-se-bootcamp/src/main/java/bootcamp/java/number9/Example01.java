/**
 * Class: Example01.java
 * Author: hector.hernandez
 * Date: Feb 29, 2020
 */
package bootcamp.java.number9;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author hector.hernandez
 * @Version 1.0
 */
public class Example01 {

	public static void main(String[] args) {
		
		String url = "jdbc:postgresql://localhost:5432/quote_manager";
		String user = "quote_manager";
		String password = "";
		String query = "SELECT * FROM customer";
		Connection con = null;
		try {
			
			con = DriverManager.getConnection(url, user, null);
			
			Statement statement = con.createStatement();
			
			boolean wasExecuted = statement.execute("SELECT active, name, id FROM customer ORDER BY id");		
			
			System.out.println("se ejecuto la sentencia SQL : " + wasExecuted);
			
			if (wasExecuted) {
				ResultSet rs = statement.getResultSet();
				if (rs != null) {
					System.out.println("ID\t\tNAME\t\tACTIVE");
					while (rs.next()) {
						int id = rs.getInt("id");
						String name = rs.getString("name");
						boolean active = rs.getBoolean("active");
						
						System.out.println(id + "\t\t" + name + "\t\t" + active);
					}
				}
			}
			
			con.close();
			
			System.out.println("Se logro conectar a Postgres");
		} catch (SQLException sqle) {
			
			System.out.println("Hubo un error");
			
			sqle.printStackTrace();
			
			if (con != null) {
				try {
					con.close();
				} catch (SQLException sqle1) {
					sqle1.printStackTrace();
				}
			}
			
		}
		
	}
}
