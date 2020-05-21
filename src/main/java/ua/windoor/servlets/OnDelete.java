package ua.windoor.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ua.windoor.databaseoperations.DeleteProduct;

public class OnDelete extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
		int productId = Integer.parseInt(request.getParameter("productId"));
		DeleteProduct deleteProduct = new DeleteProduct();
		deleteProduct.delete(productId);
		response.sendRedirect("/windoor/");
	} catch(Exception ex) {
	} finally {
		
	}
}
}