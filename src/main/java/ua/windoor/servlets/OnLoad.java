package ua.windoor.servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.annotation.*;

import ua.windoor.database.*;
import ua.windoor.databaseoperations.*;

@WebServlet("")
public class OnLoad extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		String sessionLogin = (String) session.getAttribute("sessionLogin");
		if(sessionLogin != null) {
		GetUsers getUsers = new GetUsers();
		ArrayList<Users> user = getUsers.getUserByLogin(sessionLogin);
		int userPerm = user.get(0).getPermision();
		GetProduct getProduct = new GetProduct();
			if(userPerm != 1) {
			ArrayList<Product> products = getProduct.getProductByUserId(1);
			request.setAttribute("userPerm", userPerm);
			request.setAttribute("products", products);
			request.getRequestDispatcher("/index.jsp").forward(request, response);
			} else {
				ArrayList<Product> products = getProduct.getProductAll();
				request.setAttribute("userPerm", userPerm);
				request.setAttribute("products", products);
				request.getRequestDispatcher("/index.jsp").forward(request, response);
			}
		} else {
			response.sendRedirect("/windoor/login.jsp");
		}
	}
		
}