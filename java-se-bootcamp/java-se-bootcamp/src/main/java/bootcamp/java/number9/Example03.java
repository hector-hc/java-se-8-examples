/**
 * Class: Example03.java
 * Author: hector.hernandez
 * Date: Feb 29, 2020
 */
package bootcamp.java.number9;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.util.concurrent.ThreadPoolExecutor.CallerRunsPolicy;

/**
 * @author hector.hernandez
 * @Version 1.0
 */
public class Example03 {

	public static void main(String[] args) {
		String url = "jdbc:postgresql://localhost:5432/quote_manager";
		String user = "quote_manager";
		String password = "";
		String query = "SELECT active, name, id FROM customer ORDER BY id";
		
		String insert = "INSERT INTO customer (name, active) VALUES ('Gabriel', false)";
		
		String update = "UPDATE customer SET active = true";
		
		String delete = "DELETE FROM customer WHERE name = 'Armando'";
		
		String callFunction = "{? = call myextract(?, ?)}";
		
		try (Connection con = DriverManager.getConnection(url, user, null); 
				/*Statement statement = con.createStatement(); 
				ResultSet rs = statement.executeQuery(query)*/CallableStatement callStatement = con.prepareCall(callFunction)) {
			
			callStatement.registerOutParameter(1, Types.INTEGER);
			
			callStatement.setInt(2, 50);
			
			callStatement.setInt(3, 600);
			
			boolean wasExecuted = callStatement.execute();
			
			System.out.println("wasExecuted: " + wasExecuted);
			
			int result = (int) callStatement.getObject(1);
			
			System.out.println("result=" + result);
			
			/*int numRows = statement.executeUpdate(insert);
			
			if (numRows == 1) {
				System.out.println("El insert fue ejecutado correctamente");
			}*/
			
			/*int numRows = statement.executeUpdate(update);
			
			if (numRows > 0) {
				System.out.println("El UPDATE fue ejecutado correctamente, numRows = " + numRows);
			}*/
			
			/*int numRows = statement.executeUpdate(delete);
			
			if (numRows > 0) {
				System.out.println("El DELETE fue ejecutado correctamente, numRows = " + numRows);
			}*/
			
			//boolean wasExecuted = statement.execute(query);
			//System.out.println("se ejecuto la sentencia SQL : " + wasExecuted);
			//if (wasExecuted) {
				///try (ResultSet rs = statement.getResultSet()) {
					/*if (rs != null) {
						System.out.println("ID\t\tNAME\t\tACTIVE");
						while (rs.next()) {
							int id = rs.getInt("id");
							String name = rs.getString("name");
							boolean active = rs.getBoolean("active");
							
							System.out.println(id + "\t\t" + name + "\t\t" + active);
						}
					}*/
				//}
			//}
		} catch (SQLException sql) {
			System.out.println("Hubo un error");
			sql.printStackTrace();
		}
	}
}
