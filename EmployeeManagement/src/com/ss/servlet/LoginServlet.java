package com.ss.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet{
protected void service(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException{
	//collect client data
	String unm=req.getParameter("empname");
	String pwd=req.getParameter("password");
	
	//Verifying
	if(unm.equals(pwd)){

		RequestDispatcher req1 = req.getRequestDispatcher("/home.jsp");
		req1.include(req, res);
	}
	else
	{
		RequestDispatcher req1 = req.getRequestDispatcher("/Login.jsp");
		req1.forward(req, res);
	}
}
}
