package ua.windoor.servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import ua.windoor.database.Users;
import ua.windoor.databaseoperations.*;

public class OnAddProduct extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		String sessionLogin = (String) session.getAttribute("sessionLogin");
		System.out.println("--Session user login: " + sessionLogin);
		CreateProduct createProduct = new CreateProduct();
		GetUsers getUser = new GetUsers();
		String articule = request.getParameter("articule");
		ArrayList<Users> users = getUser.getUserByLogin(sessionLogin);
		int userId = users.get(0).getUserId();
		String supplier = request.getParameter("supplier");
		String color = request.getParameter("color");
		double price = Double.parseDouble(request.getParameter("price").toString());
		String name = request.getParameter("name");
		String type = request.getParameter("type");
		int height = Integer.parseInt(request.getParameter("height"));
		int width = Integer.parseInt(request.getParameter("width"));
		int depth = Integer.parseInt(request.getParameter("depth"));
		createProduct.create(articule, userId, color, supplier, price, name, type, height, width, depth);
			response.sendRedirect("/windoor/add");
	}
		
}