package com.simpli;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/DetailsPage")
public class Details extends HttpServlet {
@Override
protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	HttpSession session = req.getSession();
	 String name =req.getParameter("name");
	 	 String s1=req.getParameter("phone_no");
	 	 int phoneno=Integer.parseInt(s1);
String city=	req.getParameter("city");
	String s2= req.getParameter("pincode");
	int pincode=Integer.parseInt(s2);
	session.setAttribute("name", name);
	session.setAttribute("phoneno", phoneno);
	session.setAttribute("city", city);
	session.setAttribute("pincode", pincode);
	resp.sendRedirect("/Project4/Payment.html");
	}
}
