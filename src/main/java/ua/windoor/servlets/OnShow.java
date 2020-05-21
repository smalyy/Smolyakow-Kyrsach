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

public class OnShow extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		String sessionLogin = (String) session.getAttribute("sessionLogin");
		if(sessionLogin != null) {
		String articule = request.getParameter("articule");
		GetUsers getUsers = new GetUsers();
		ArrayList<Users> user = getUsers.getUserByLogin(sessionLogin);
		int userPerm = user.get(0).getPermision();
		GetProduct getProduct = new GetProduct();
		ArrayList<Product> product = getProduct.getProductByArticule(articule);
		request.setAttribute("product", product);
		request.setAttribute("userPerm", userPerm);
		getServletContext().getRequestDispatcher("/show.jsp").forward(request, response);
		} else {
			response.sendRedirect("/windoor/login.jsp");
		}
	}
		
}