/**
 * Class: Example01.java
 * Author: hector.hernandez
 * Date: Mar 21, 2020
 */
package bootcamp.java.number11;

import java.sql.Connection;
import java.sql.DriverManager;
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
		
		boolean error = true;
		
		try (Connection con = DriverManager.getConnection(url, user, "")) {
			con.setAutoCommit(false);
			String updateAccountOrigin = "UPDATE account_origin SET amount = amount - 400 WHERE account = '12345678'";
			
			String updateAccountTarget = "UPDATE account_target SET amount = amount + 400 WHERE account = '87654321'";
			
			try (Statement stUpdateAccountOrigin = con.createStatement()) {
				
				stUpdateAccountOrigin.execute(updateAccountOrigin);
			
				try (Statement stUpdateAccountTarget = con.createStatement()) {
					
					if (error) {
						throw new RuntimeException("Error");
					}
					
					stUpdateAccountTarget.execute(updateAccountTarget);
				}
			
				con.commit();
			} catch (Exception e) {
				System.out.println("***** Error");
				con.rollback();
			}
			
			System.out.print("OK");
		} catch (SQLException sql) {
			sql.printStackTrace();
		}
	}
}
