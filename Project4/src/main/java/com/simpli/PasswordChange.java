package com.simpli;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/PasswordChange")
public class PasswordChange extends HttpServlet {
private PrintWriter writer;
private PreparedStatement pstmt;
private Connection con;

@Override
protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	HttpSession session = req.getSession();
String newuse=	req.getParameter("NewUse");
String newpass=	req.getParameter("NewPass");
	
 int id1=(int)session.getAttribute("idog");
	
	try {
		String url1 = "jdbc:mysql://localhost:3306/simpli_check12";
		String username1 = "root";
		 String password1 = "root";
		Class.forName("com.mysql.jdbc.Driver");
	con =	DriverManager.getConnection(url1, username1, password1);
	
	String sql = "update admin set username=? , password=? where id=?";
	pstmt =	con.prepareStatement(sql);
	pstmt.setString(1, newuse);
	pstmt.setString(2, newpass);
	pstmt.setInt(3, id1);
	
		int x = pstmt.executeUpdate();
		if(x>0)
		{resp.sendRedirect("/Project4/PasswordUpdated.html");
			
		}else {
			System.out.println("not updated");
			writer.print("updated");
		}
		
		
		
		
		
		
		
	} catch ( Exception e) {
		e.printStackTrace();
	}
}
}
