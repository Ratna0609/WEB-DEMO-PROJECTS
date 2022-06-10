package com.javaexperts.application.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.javaexperts.application.service.UserService;

public class LogoutServlet extends HttpServlet {

	private static final long serialVersionUID = 1728117496735948056L;

	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		UserService userservice = new UserService();
		System.out.println("Logout-Servlet Service");
		String un = req.getParameter("username");
		String pw = req.getParameter("password");
		int x = userservice.verfiyUser(un, pw);
		System.out.println(x);
		HttpSession session = req.getSession();
		//session.getSessionContext();
		String result = "";
		if (x == 1) {
			session.setAttribute("UN", un);
			result = "home.jsp";
		} else {
			
			String msg = "Logout successfully  ";
			req.setAttribute("MSG", msg);
			result = "index.jsp";
		}
		RequestDispatcher rd = req.getRequestDispatcher(result);
		rd.forward(req, res);

	}
}
