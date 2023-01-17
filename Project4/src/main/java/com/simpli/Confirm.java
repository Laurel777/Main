package com.simpli;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/Confirm")
public class Confirm extends HttpServlet{
@Override
protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String use =req.getParameter("username");
	String a ="confirm";
	
	if(use.equalsIgnoreCase(a))
	{
		resp.sendRedirect("/Project4/Details.html");
	}else
	{
		resp.sendRedirect("/Project4/index.html");
	}
}
}
