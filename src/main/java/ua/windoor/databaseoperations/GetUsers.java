package ua.windoor.databaseoperations;

import java.util.ArrayList;
import java.sql.*;

import ua.windoor.database.*;

public class GetUsers {
	private String url = "jdbc:sqlserver://localhost;database=Windoor";
	private String login = "Smally";
	private String password = "123456";
	
	public ArrayList<Users> getUserById(int inpUserId) {
		ArrayList<Users> users = new ArrayList<Users>();
		String inquery = "SELECT * FROM Users WHERE userId=?";
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").getDeclaredConstructor().newInstance();
			Connection conn = DriverManager.getConnection(url, login, password);
			try {
				PreparedStatement prepStat = conn.prepareStatement(inquery);
				prepStat.setInt(1, inpUserId);
				ResultSet resultSet = prepStat.executeQuery();
				while(resultSet.next()) {
					int userId = resultSet.getInt(1);
					String login = resultSet.getString(2);
					String password = resultSet.getString(3);
					String eMail = resultSet.getString(4);
					String phoneNumber = resultSet.getString(5);
					String fName = resultSet.getString(6);
					String sName = resultSet.getString(7);
					int permision = resultSet.getInt(8);
					Users user = new Users(userId, login, password, eMail, phoneNumber, fName, sName, permision);
					users.add(user);
				}
			} catch(Exception ex) {
				System.out.println(ex);
			} finally {
				conn.close();
			}
		} catch(Exception ex) {
			System.out.println(ex);
		} finally {
			System.out.println("--Successfuly get user by id!");
		}
		return users;
	}
	
	public ArrayList<Users> getUserByLogin(String inpLogin) {
		ArrayList<Users> users = new ArrayList<Users>();
		String inquery = "SELECT * FROM Users WHERE login=?";
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").getDeclaredConstructor().newInstance();
			Connection conn = DriverManager.getConnection(url, login, password);
			try {
				PreparedStatement prepStat = conn.prepareStatement(inquery);
				prepStat.setString(1, inpLogin);
				ResultSet resultSet = prepStat.executeQuery();
				while(resultSet.next()) {
					int userId = resultSet.getInt(1);
					String login = resultSet.getString(2);
					String password = resultSet.getString(3);
					String eMail = resultSet.getString(4);
					String phoneNumber = resultSet.getString(5);
					String fName = resultSet.getString(6);
					String sName = resultSet.getString(7);
					int permision = resultSet.getInt(8);
					Users user = new Users(userId, login, password, eMail, phoneNumber, fName, sName, permision);
					users.add(user);
				}
			} catch(Exception ex) {
				System.out.println(ex);
			} finally {
				conn.close();
			}
		} catch(Exception ex) {
			System.out.println(ex);
		} finally {
			System.out.println("--Successfuly get user by login!");
		}
		return users;
	}
	
	public ArrayList<Users> getUserByEMail(String inpEMail) {
		ArrayList<Users> users = new ArrayList<Users>();
		String inquery = "SELECT * FROM Users WHERE EMail=?";
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").getDeclaredConstructor().newInstance();
			Connection conn = DriverManager.getConnection(url, login, password);
			try {
				PreparedStatement prepStat = conn.prepareStatement(inquery);
				prepStat.setString(1, inpEMail);
				ResultSet resultSet = prepStat.executeQuery();
				while(resultSet.next()) {
					int userId = resultSet.getInt(1);
					String login = resultSet.getString(2);
					String password = resultSet.getString(3);
					String eMail = resultSet.getString(4);
					String phoneNumber = resultSet.getString(5);
					String fName = resultSet.getString(6);
					String sName = resultSet.getString(7);
					int permision = resultSet.getInt(8);
					Users user = new Users(userId, login, password, eMail, phoneNumber, fName, sName, permision);
					users.add(user);
				}
			} catch(Exception ex) {
				System.out.println(ex);
			} finally {
				conn.close();
			}
		} catch(Exception ex) {
			System.out.println(ex);
		} finally {
			System.out.println("--Successfuly get user by eMail!");
		}
		return users;
	}
	
	public ArrayList<Users> getUserByPhoneNumber(String inpPhoneNumber) {
		ArrayList<Users> users = new ArrayList<Users>();
		String inquery = "SELECT * FROM Users WHERE phoneNumber=?";
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").getDeclaredConstructor().newInstance();
			Connection conn = DriverManager.getConnection(url, login, password);
			try {
				PreparedStatement prepStat = conn.prepareStatement(inquery);
				prepStat.setString(1, inpPhoneNumber);
				ResultSet resultSet = prepStat.executeQuery();
				while(resultSet.next()) {
					int userId = resultSet.getInt(1);
					String login = resultSet.getString(2);
					String password = resultSet.getString(3);
					String eMail = resultSet.getString(4);
					String phoneNumber = resultSet.getString(5);
					String fName = resultSet.getString(6);
					String sName = resultSet.getString(7);
					int permision = resultSet.getInt(8);
					Users user = new Users(userId, login, password, eMail, phoneNumber, fName, sName, permision);
					users.add(user);
				}
			} catch(Exception ex) {
				System.out.println(ex);
			} finally {
				conn.close();
			}
		} catch(Exception ex) {
			System.out.println(ex);
		} finally {
			System.out.println("--Successfuly get user by phone number!");
		}
		return users;
	}
}
