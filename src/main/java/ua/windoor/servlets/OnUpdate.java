package ua.windoor.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import ua.windoor.databaseoperations.*;

public class OnUpdate extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		String sessionLogin = (String) session.getAttribute("sessionLogin");
		if(sessionLogin != null) {
		UpdateProduct updateProduct = new UpdateProduct();
		int height = Integer.parseInt(request.getParameter("height"));
		int width = Integer.parseInt(request.getParameter("width"));
		int depth = Integer.parseInt(request.getParameter("depth"));
		String type = request.getParameter("type");
		String name = request.getParameter("name");
		String supplier = request.getParameter("supplier");
		String color = request.getParameter("color");
		String articule = request.getParameter("articule");
		double price = Double.parseDouble(request.getParameter("price"));
		int productId = Integer.parseInt(request.getParameter("productId"));
		updateProduct.update(productId, articule, color, supplier, price, name, type, height, width, depth);
		response.sendRedirect("/windoor/");
		} else {
			response.sendRedirect("/windoor/login.jsp");
		}
	}
		
}