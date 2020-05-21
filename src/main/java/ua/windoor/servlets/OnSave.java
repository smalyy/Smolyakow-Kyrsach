package ua.windoor.servlets;

import java.util.ArrayList;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import ua.windoor.database.*;
import ua.windoor.databaseoperations.*;

public class OnSave extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		String sessionLogin = (String) session.getAttribute("sessionLogin");
		if(sessionLogin != null) {
		GetUsers getUsers = new GetUsers();
		CreateProduct createProduct = new CreateProduct();
		ArrayList<Users> users = getUsers.getUserByLogin(sessionLogin);
		int userId = users.get(0).getUserId();
		int height = Integer.parseInt(request.getParameter("height"));
		int width = Integer.parseInt(request.getParameter("width"));
		int depth = Integer.parseInt(request.getParameter("depth"));
		String type = request.getParameter("type");
		String name = request.getParameter("name");
		String supplier = request.getParameter("supplier");
		String color = request.getParameter("color");
		String articule = request.getParameter("articule");
		double price = Double.parseDouble(request.getParameter("price"));
		createProduct.create(articule, userId, color, supplier, price, name, type, height, width, depth);
		request.getRequestDispatcher("/calculator.jsp").forward(request, response);
		} else {
			response.sendRedirect("/windoor/login.jsp");
		}
	}
		
}