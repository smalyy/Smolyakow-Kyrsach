package ua.windoor.databaseoperations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UpdateProduct {
	private static String url="jdbc:sqlserver://localhost;database=Windoor";
	private static String login="Smally";
	private static String password="123456";
	
	public void update(int inpProductId, String inpArticule, String inpColor, String inpSupplier, double inpPrice, String inpName, String inpType, int inpHeight, int inpWidth, int inpDepth) {
		String query = "UPDATE Product SET articule=?, color=?, supplier=?, price=?, name=?, type=?, height=?, width=?, depth=? WHERE productId=?";
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").getDeclaredConstructor().newInstance();
			Connection conn = DriverManager.getConnection(url, login, password);
			try {
				PreparedStatement prepStat = conn.prepareStatement(query);
				prepStat.setString(1, inpArticule);
				prepStat.setString(2, inpColor);
				prepStat.setString(3, inpSupplier);
				prepStat.setDouble(4, inpPrice);
				prepStat.setString(5, inpName);
				prepStat.setString(6, inpType);
				prepStat.setInt(7, inpHeight);
				prepStat.setInt(8, inpWidth);
				prepStat.setInt(9, inpDepth);
				prepStat.setInt(10, inpProductId);
				prepStat.executeUpdate();
				System.out.println("--Product updated!");
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