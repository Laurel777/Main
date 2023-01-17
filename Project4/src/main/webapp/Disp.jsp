<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% int FP= (int)session.getAttribute("FlightPrice");

int Main= (int)session.getAttribute("Nop");
int MainFP = FP*Main;


 String source=(String)session.getAttribute("sourceog");
 String destination=(String) session.getAttribute("destinationog");
 String doj=(String) session.getAttribute("dojog");
 int nop=(int) session.getAttribute("nopog");
 String airline_name=(String) session.getAttribute("airnameog");
 
 out.print("<br>"+ "Your selected source is " +source +"<br>");
 out.print("<br>"+ "Your selected destination is " +destination +"<br>");
 out.print("<br>"+ "Your selected Date of Journey is " +doj +"<br>");
 out.print("<br>"+ "Your selected Number of Passengers are " +nop +"<br>");
 out.print("<br>"+ "Your selected Air Line Name  is " +airline_name +"<br>");
 out.print("<br>"+ "Your  fare for the trip for 1 passenger is going to be "+ FP +"Rupees"+"<br>");
 out.print("<br>"+ "Your  fare for the trip for " + nop+ " passengers is going to be "+ MainFP +"Rupees"+"<br>");

%><br>
<br>
<form action="Confirm">
<label>Please type confirm to continue the flight booking</label>
<input type="text" name ="username">
<br>
<br>
<input type="submit">
</form>
<br>
<a href= "Logout">To check logout from session click here</a>
<br>
<br>
<br>

</body>
</html>