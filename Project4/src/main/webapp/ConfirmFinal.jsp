<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String source=(String)session.getAttribute("sourceog");
String destination=(String) session.getAttribute("destinationog");
String doj=(String) session.getAttribute("dojog");
int nop=(int) session.getAttribute("nopog");
String airline_name=(String) session.getAttribute("airnameog");
int FP= (int)session.getAttribute("FlightPrice");
String name=(String)session.getAttribute("name");


int Main= (int)session.getAttribute("Nop");
int MainFP = FP*Main;
out.print("<br>"+"YOU HAVE SUCCESSFULLY BOOKED YOUR FLIGHT TICKET"+"<br>");
out.print("<br>"+"YOUR FLIGHT TICKET DETAILS ARE AS FOLLOWS"+"<br>");
out.print("<br>"+ "Name of passenger is " +name +"<br>");
out.print("<br>"+ "Your selected source is " +source +"<br>");
out.print("<br>"+ "Your selected destination is " +destination +"<br>");
out.print("<br>"+ "Your selected Date of Journey is " +doj +"<br>");
out.print("<br>"+ "Your selected Number of Passengers are " +nop +"<br>");
out.print("<br>"+ "Your selected Air Line Name  is " +airline_name +"<br>");

out.print("<br>"+ "Your  fare for the trip for " + nop+ " passengers is going to be "+ MainFP +"Rupees"+"<br>");

%>
<br>
<a href= "Logout">To  logout from session click here</a>
<br>
<br>
</body>
</html>