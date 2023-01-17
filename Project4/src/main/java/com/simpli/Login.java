package com.simpli;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/LoginPage")
public class Login extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		HttpSession session =req.getSession(true);
		
		String username=	req.getParameter("Username");
		String password=	req.getParameter("Password");
		
		session.setAttribute("usernameog", username);
		session.setAttribute("passwordog", password);
			
			ModelLogin m;
			try {
				m = new ModelLogin();
				m.setUsername(username);
				m.setPassword(password);
				
			boolean b=	m.verify();
				
				if (b==true)
				{  session.setAttribute("idog", m.getId());
					resp.sendRedirect("/Project4/Home.html");
					
				}else
				{
					resp.sendRedirect("/Project4/incorrect.html");
				}						
			} catch (Exception e) {
				
				e.printStackTrace();
			}		
	}
}
