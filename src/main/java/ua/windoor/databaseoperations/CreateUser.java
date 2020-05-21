package ua.windoor.databaseoperations;

import java.sql.*;

public class CreateUser {
	private static String connectionUrl="jdbc:sqlserver://localhost;database=Windoor";
	private static String connectionLogin="Smally";
	private static String connectionPassword="123456";
	
	public void create(String inpLogin, String inpPassword, String inpEMail, String inpPhoneNumber, String inpFName, String inpSName) {
		String query = "INSERT INTO Users (login, password, eMail, phoneNumber, FName, SName) VALUES (?, ?, ?, ?, ?, ?)";
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").getDeclaredConstructor().newInstance();
			Connection conn = DriverManager.getConnection(connectionUrl, connectionLogin, connectionPassword);
			try {
				PreparedStatement prepStat = conn.prepareStatement(query);
				prepStat.setString(1, inpLogin);
				prepStat.setString(2, inpPassword);
				prepStat.setString(3, inpEMail);
				prepStat.setString(4, inpPhoneNumber);
				prepStat.setString(5, inpFName);
				prepStat.setString(6, inpSName);
				prepStat.executeUpdate();
				System.out.println("--User created!");
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

