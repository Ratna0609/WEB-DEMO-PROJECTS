package com.javaexperts.application.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.javaexperts.application.service.UserService;


public class DeleteServlet extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5680208923609693140L;

	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		UserService userservice=new UserService();
		String un=req.getParameter("username");
		String pw=req.getParameter("password");
		//int x=userservice.verfiyUser(un,pw);
		//System.out.println(x);
		String result="";
	
			int x=userservice.deleteuser(un,pw);
			if(x==1){
			
			result="del.jsp";
			}
			else{
		result="delete.jsp";
			}
	
		
		RequestDispatcher rd=req.getRequestDispatcher(result);
		rd.forward(req,res);
		
	}

}
