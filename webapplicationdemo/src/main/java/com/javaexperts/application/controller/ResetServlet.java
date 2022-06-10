package com.javaexperts.application.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.javaexperts.application.service.UserService;

public class ResetServlet  extends HttpServlet {
	
	//private static final long serialVersionUID=
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1642875801955653497L;

	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		  res.setContentType("text/html");  
	        PrintWriter out=res.getWriter(); 
		UserService userservice = new UserService();
		System.out.println("Reset-Servlet Service");
		
		int x=0;
	
		String result="";
		//String un = req.getParameter("username");
		String pw = req.getParameter("password");
		String pw1 = req.getParameter("password");
		
		HttpSession session = req.getSession(false);
				  
		String un=(String)session.getAttribute("UN");  
        
		
		//session.setAttribute("UN", un);
	
		if(pw==pw1) {
			System.out.println("Reset-Servlet inside"+un+pw);
			 x=userservice.UpdateUser(un, pw);
			 System.out.println(x);
		
		}
		
		
		if(x==1){
			session.invalidate();
			
		//result="del.jsp";
		//String sub = "Reset Pasword Suceessfully";
		String msg = "Login aagin using new password";
		req.setAttribute("MSG", msg);
		result="home.jsp";
		
		}
		else{
			session.invalidate();
			String msg = "Reset Pasword Suceessfully";
			req.setAttribute("MSG", msg);
			//out.print("Reset Pasword Suceessfully");
			result="index.jsp";
		}
		//int x=userservice.deleteuser(un,pw);
		RequestDispatcher rd=req.getRequestDispatcher(result);
		rd.forward(req,res);
		
	}

}
