package com.javaexperts.application.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.javaexperts.application.service.UserService;

public class ForgetServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8194068086486250114L;

	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		UserService userservice = new UserService();
		System.out.println("forget-Servlet Service");
		String un = req.getParameter("username");
		String ph=req.getParameter("phone");
		String email=req.getParameter("email");
		
		int x = userservice.verfiyUser(un,ph,email);
		System.out.println(x);
		HttpSession session = req.getSession();
		String result = "";
		if (x == 1) {
			session.setAttribute("UN", un);
			result = "resetpassword.jsp";
			

		} else {
			String msg = "Invalid UserName &  Email & Phone";
			req.setAttribute("MSG", msg);
			result = "index.jsp";
		}
		RequestDispatcher rd = req.getRequestDispatcher(result);
		rd.forward(req, res);

	}
}
