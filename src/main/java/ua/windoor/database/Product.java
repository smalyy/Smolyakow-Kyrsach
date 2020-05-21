package ua.windoor.database;

import java.io.Serializable;

public class Product implements Serializable {
	private int productId;
	private String articule;
	private int userId;
	private String supplier;
	private String color;
	private double price;
	private String name;
	private String type;
	private int height;
	private int width;
	private int depth;

	private static final long serialVersionUID = 1L;

	public Product() {
	}

	public Product(String articule, int userId, String color, String supplier, double price, String name, String type, int heigth,
			int width, int depth) {
		this.articule = articule;
		this.userId = userId;
		this.supplier = supplier;
		this.color = color;
		this.price = price;
		this.name = name;
		this.type = type;
		this.height = heigth;
		this.width = width;
		this.depth = depth;
	}
	
	public Product(int productId, String articule, int userId, String color, String supplier, double price, String name, String type, int heigth,
			int width, int depth) {
		this.productId = productId;
		this.articule = articule;
		this.userId = userId;
		this.supplier = supplier;
		this.color = color;
		this.price = price;
		this.name = name;
		this.type = type;
		this.height = heigth;
		this.width = width;
		this.depth = depth;
	}

	public String getArticule() {
		return articule;
	}

	public void setArticule(String articule) {
		this.articule = articule;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getDepth() {
		return depth;
	}

	public void setDepth(int depth) {
		this.depth = depth;
	}

	public String getSupplier() {
		return supplier;
	}

	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}

	public int getProductId() {
		return productId;
	}

}
