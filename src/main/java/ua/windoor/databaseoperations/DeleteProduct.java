package ua.windoor.databaseoperations;

import java.sql.*;

public class DeleteProduct {
	private String url = "jdbc:sqlserver://localhost;database=Windoor";
	private String login = "Smally";
	private String password = "123456";

	public void delete(int insertedProductId) {
	try {
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").getDeclaredConstructor().newInstance();
		Connection conn = DriverManager.getConnection(url, login, password);
		try {
			Statement statement = conn.createStatement();
			statement.executeUpdate("DELETE FROM Product WHERE productId=" + insertedProductId);
		} catch(Exception ex) {
			System.out.println(ex);
		} finally {
			conn.close();
		}
	} catch(Exception ex) {
		System.out.println(ex);
	} finally {
		System.out.println("--Successfuly deleted product by product Id!");
	}

	}

}
