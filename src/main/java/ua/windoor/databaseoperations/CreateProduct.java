package ua.windoor.databaseoperations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class CreateProduct {
	private static String connectionUrl="jdbc:sqlserver://localhost;database=Windoor";
	private static String connectionLogin="Smally";
	private static String connectionPassword="12345678";
	
	public void create(String inpArticule, int inpUserId, String inpColor, String inpSupplier, double inpPrice, String inpName, String inpType, int inpHeight, int inpWidth, int inpDepth) {
		String query = "INSERT INTO Product (articule, userId, color, supplier, price, name, type, height, width, depth) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").getDeclaredConstructor().newInstance();
			Connection conn = DriverManager.getConnection(connectionUrl, connectionLogin, connectionPassword);
			try {
				PreparedStatement prepStat = conn.prepareStatement(query);
				prepStat.setString(1, inpArticule);
				prepStat.setInt(2, inpUserId);
				prepStat.setString(3, inpColor);
				prepStat.setString(4, inpSupplier);
				prepStat.setDouble(5, inpPrice);
				prepStat.setString(6, inpName);
				prepStat.setString(7, inpType);
				prepStat.setInt(8, inpHeight);
				prepStat.setInt(9, inpWidth);
				prepStat.setInt(10, inpDepth);
				prepStat.executeUpdate();
				System.out.println("--Product created!");
			} catch(Exception ex) {
				System.out.println(ex);
			} finally {
				conn.close();
			}
		} catch(Exception ex) {
			System.out.println(ex);
		} finally {}
	}
}