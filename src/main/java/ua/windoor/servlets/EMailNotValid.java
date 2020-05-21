package ua.windoor.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EMailNotValid extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		boolean eMailNotValid = true;
		request.setAttribute("eMailNotValid", eMailNotValid);
		getServletContext().getRequestDispatcher("/register.jsp").forward(request, response);
	}
		

}