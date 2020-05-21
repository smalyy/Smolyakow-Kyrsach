package ua.windoor.databaseoperations;

import java.util.ArrayList;
import java.sql.*;

import ua.windoor.database.*;

public class GetProduct {
	private String url = "jdbc:sqlserver://localhost;database=Windoor";
	private String login = "Smally";
	private String password = "123456";
	
	public ArrayList<Product> getProductByArticule(String inpArticule) {
		ArrayList<Product> products = new ArrayList<Product>();
		String inquery = "SELECT * FROM Product WHERE articule=?";
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").getDeclaredConstructor().newInstance();
			Connection conn = DriverManager.getConnection(url, login, password);
			try {
				PreparedStatement prepStat = conn.prepareStatement(inquery);
				prepStat.setString(1, inpArticule);
				ResultSet resultSet = prepStat.executeQuery();
				while(resultSet.next()) {
					int productId = resultSet.getInt(1);
					String articule = resultSet.getString(2);
					int userId = resultSet.getInt(3);
					String color = resultSet.getString(4);
					String supplier = resultSet.getString(5);
					double price = resultSet.getDouble(6);
					String name = resultSet.getString(7);
					String type = resultSet.getString(8);
					int height = resultSet.getInt(9);
					int width = resultSet.getInt(10);
					int depth = resultSet.getInt(11);
					Product product = new Product(productId, articule, userId, color, supplier, price, name, type, height, width, depth);
					products.add(product);
				}
			} catch(Exception ex) {
				System.out.println(ex);
			} finally {
				conn.close();
			}
		} catch(Exception ex) {
			System.out.println(ex);
		} finally {
			System.out.println("--Successfuly get product by articule!");
		}
		return products;
	}
	
	public ArrayList<Product> getProductByUserId(int inpUserId) {
		ArrayList<Product> products = new ArrayList<Product>();
		String inquery = "SELECT * FROM Product WHERE userId=?";
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").getDeclaredConstructor().newInstance();
			Connection conn = DriverManager.getConnection(url, login, password);
			try {
				PreparedStatement prepStat = conn.prepareStatement(inquery);
				prepStat.setInt(1, inpUserId);
				ResultSet resultSet = prepStat.executeQuery();
				while(resultSet.next()) {
					int productId = resultSet.getInt(1);
					String articule = resultSet.getString(2);
					int userId = resultSet.getInt(3);
					String color = resultSet.getString(4);
					String supplier = resultSet.getString(5);
					double price = resultSet.getDouble(6);
					String name = resultSet.getString(7);
					String type = resultSet.getString(8);
					int height = resultSet.getInt(9);
					int width = resultSet.getInt(10);
					int depth = resultSet.getInt(11);
					Product product = new Product(productId, articule, userId, color, supplier, price, name, type, height, width, depth);
					products.add(product);
				}
			} catch(Exception ex) {
				System.out.println(ex);
			} finally {
				conn.close();
			}
		} catch(Exception ex) {
			System.out.println(ex);
		} finally {
			System.out.println("--Successfuly get product by userId!");
		}
		return products;
	}
	
	public ArrayList<Product> getProductByType(String inpType) {
		ArrayList<Product> products = new ArrayList<Product>();
		String inquery = "SELECT * FROM Product WHERE type=?";
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").getDeclaredConstructor().newInstance();
			Connection conn = DriverManager.getConnection(url, login, password);
			try {
				PreparedStatement prepStat = conn.prepareStatement(inquery);
				prepStat.setString(1, inpType);
				ResultSet resultSet = prepStat.executeQuery();
				while(resultSet.next()) {
					int productId = resultSet.getInt(1);
					String articule = resultSet.getString(2);
					int userId = resultSet.getInt(3);
					String color = resultSet.getString(4);
					String supplier = resultSet.getString(5);
					double price = resultSet.getDouble(6);
					String name = resultSet.getString(7);
					String type = resultSet.getString(8);
					int height = resultSet.getInt(9);
					int width = resultSet.getInt(10);
					int depth = resultSet.getInt(11);
					Product product = new Product(productId, articule, userId, color, supplier, price, name, type, height, width, depth);
					products.add(product);
				}
			} catch(Exception ex) {
				System.out.println(ex);
			} finally {
				conn.close();
			}
		} catch(Exception ex) {
			System.out.println(ex);
		} finally {
			System.out.println("--Successfuly get product by userId!");
		}
		return products;
	}
	
	public ArrayList<Product> getProductAll() {
		ArrayList<Product> products = new ArrayList<Product>();
		String inquery = "SELECT * FROM Product";
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").getDeclaredConstructor().newInstance();
			Connection conn = DriverManager.getConnection(url, login, password);
			try {
				PreparedStatement prepStat = conn.prepareStatement(inquery);
				ResultSet resultSet = prepStat.executeQuery();
				while(resultSet.next()) {
					int productId = resultSet.getInt(1);
					String articule = resultSet.getString(2);
					int userId = resultSet.getInt(3);
					String color = resultSet.getString(4);
					String supplier = resultSet.getString(5);
					double price = resultSet.getDouble(6);
					String name = resultSet.getString(7);
					String type = resultSet.getString(8);
					int height = resultSet.getInt(9);
					int width = resultSet.getInt(10);
					int depth = resultSet.getInt(11);
					Product product = new Product(productId, articule, userId, color, supplier, price, name, type, height, width, depth);
					products.add(product);
				}
			} catch(Exception ex) {
				System.out.println(ex);
			} finally {
				conn.close();
			}
		} catch(Exception ex) {
			System.out.println(ex);
		} finally {
			System.out.println("--Successfuly get products!");
		}
		return products;
	}
}
