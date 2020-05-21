package ua.windoor.servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import ua.windoor.database.*;
import ua.windoor.databaseoperations.*;

public class SuccessfulLogin extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		String sessionLogin = (String) session.getAttribute("sessionLogin");
		GetUsers getUsers = new GetUsers();
		if(sessionLogin != null) {
		ArrayList<Users> user = getUsers.getUserByLogin(sessionLogin);
		GetProduct getProduct = new GetProduct();
		ArrayList<Product> products = getProduct.getProductByUserId(1);
		request.setAttribute("products", products);
		request.setAttribute("userPerm", user.get(0).getPermision());
		request.getRequestDispatcher("/index.jsp").forward(request, response);
		} else {
			response.sendRedirect("/windoor/login.jsp");
		}
	}
		

}