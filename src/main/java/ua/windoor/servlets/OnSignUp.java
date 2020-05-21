package ua.windoor.servlets;

import java.io.IOException;

import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ua.windoor.databaseoperations.*;
import ua.windoor.database.*;

public class OnSignUp extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String login = request.getParameter("login");
		String password = request.getParameter("password");
		String passwordRepeat = request.getParameter("repeatPassword");
		String eMail = request.getParameter("eMail");
		String phoneNumber = request.getParameter("phoneNumber");
		String firstName = request.getParameter("firstName");
		String secontName = request.getParameter("secondName");
		CreateUser createUser = new CreateUser();
		GetUsers getUsers = new GetUsers();
		ArrayList<Users> userByLogin = getUsers.getUserByLogin(login);
		ArrayList<Users> userByEMail = getUsers.getUserByEMail(eMail);
		ArrayList<Users> userByPhoneNumber = getUsers.getUserByPhoneNumber(phoneNumber);
		try {
			if (login.length() >= 4) {
				if (password.length() >= 6) {
					if (eMail.matches("(.*)@(.*).(.*)")) {
						if (userByEMail.size() == 0) {
							if (phoneNumber.matches("(\\+)\\d{12}")) {
								if (userByPhoneNumber.size() == 0) {
									if (password.equals(passwordRepeat)) {
										if (userByLogin.size() == 0) {
											createUser.create(login, password, eMail, phoneNumber, firstName,
													secontName);
											response.sendRedirect("/windoor/successfulRegistration");
										} else {
											response.sendRedirect("/windoor/userExist");
										}
									} else {
										response.sendRedirect("/windoor/passwordMismatch");
									}
								} else {
									response.sendRedirect("/windoor/phoneNumberExist");
								}
							} else {
								response.sendRedirect("/windoor/phoneNumberNotValid");
							}
						} else {
							response.sendRedirect("/windoor/eMailExist");
						}
					} else {
						response.sendRedirect("/windoor/eMailNotValid");
					}
				} else {
					response.sendRedirect("/windoor/passwordLength");
				}
			} else {
				response.sendRedirect("/windoor/loginLength");
			}
		} catch (Exception ex) {
			System.out.println(ex);
		} finally {
		}

	}

}
