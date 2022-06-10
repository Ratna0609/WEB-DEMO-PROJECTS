package com.javaexperts.application.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.javaexperts.application.dto.UserTO;
import com.javaexperts.application.service.UserService;


public class RegisterServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2989983099615482979L;

	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		UserService userService = new UserService();
		System.out.println("Register Action Servlet");
		String fn = req.getParameter("fname");
		String em = req.getParameter("email");
		String ph = req.getParameter("phone");
		String un = req.getParameter("username");
		String pw = req.getParameter("password");
		long ph1 = Long.parseLong(ph);
		int uid = userService.getNextUserId();
		UserTO uto = new UserTO(uid, fn, em, ph1, un, pw);
		int x = userService.registerUser(uto);
		HttpSession session = req.getSession();
		String result = "";
		if (x == 1) {
			session.setAttribute("UN", un);
			result = "home.jsp";
			String sub = "Registration Suceess";
			req.setAttribute("MSG", sub);

		} else {
			String msg = "Registration Failed";
			req.setAttribute("MSG", msg);
			result = "register.jsp";
		}
		RequestDispatcher rd = req.getRequestDispatcher(result);
		rd.forward(req, res);
	}
}