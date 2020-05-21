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

public class OnSignIn extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String login = request.getParameter("login");
		String password = request.getParameter("password");
		GetUsers getUsers = new GetUsers();
		ArrayList<Users> user = getUsers.getUserByLogin(login);
		HttpSession session = request.getSession();
		try {
			if(user.size() > 0) {
				if(user.get(0).getPassword().equals(password)) {
					session.setAttribute("sessionLogin", login);
					response.sendRedirect("/windoor/successfulLogin");
				} else {
					response.sendRedirect("/windoor/wrongLoginOrPassword");
				}
			} else {
				response.sendRedirect("/windoor/wrongLoginOrPassword");
			}
		} catch(Exception ex) {
			System.out.println(ex);
		} finally {}

}

}