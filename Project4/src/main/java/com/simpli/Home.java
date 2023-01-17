package com.simpli;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/HomePage")
public class Home extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
HttpSession session = req.getSession();
		
		String source=req.getParameter("source");
		String destination=req.getParameter("destination");
		String doj=req.getParameter("doj");
		String s1=req.getParameter("nop");
		int nop = Integer.parseInt(s1);
		String airname= req.getParameter("airline_name");
	
		if(source.equalsIgnoreCase("pune")| destination.equalsIgnoreCase("delhi")| destination.equalsIgnoreCase("mumbai")| destination.equalsIgnoreCase("bangalore")|destination.equalsIgnoreCase("goa")| airname.equalsIgnoreCase("air asia") | (airname.equalsIgnoreCase("indigo")) )
		{	
		session.setAttribute("sourceog", source);
		session.setAttribute("destinationog", destination);
		session.setAttribute("dojog", doj);
		session.setAttribute("nopog", nop);
		session.setAttribute("airnameog", airname);
		ModelHome m;
		try {
			m = new ModelHome();
			m.setSource(source);
			m.setDestinaton(destination);
			m.setDoj(doj);
			m.setNop(nop);
			m.setAirline_name(airname);
		boolean b =	m.fetch();
		if (b==true)
		{session.setAttribute("FlightPrice", m.getFlightprice());	
		session.setAttribute("Nop", nop);
		session.setAttribute("id", m.getId());
		System.out.println(m.getFlightprice());
		resp.sendRedirect("/Project4/Disp.jsp");
		}else
		{resp.sendRedirect("/Project4/Compulsory.html");
			
		}		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}}
		else			
		{
			resp.sendRedirect("/Project4/Compulsory.html");
		}	
	}	
}
