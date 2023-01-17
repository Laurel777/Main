package com.simpli;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ModelHome {
	public String url1 = "jdbc:mysql://localhost:3306/simpli_check12";
	public 	String username1 = "root";
		public String password1 = "root";
	
	
String airline_name;
public String getAirline_name() {
	return airline_name;
}
public void setAirline_name(String airline_name) {
	this.airline_name = airline_name;
}


String Source;
String Destinaton;
String Doj;
int Nop;
int Id;
int Flightprice;
private Connection con;
public int getId() {
	return Id;
}
public void setId(int id) {
	Id = id;
}
public int getFlightprice() {
	return Flightprice;
}
public void setFlightprice(int flightprice) {
	Flightprice = flightprice;
}
public String getSource() {
	return Source;
}
public void setSource(String source) {
	Source = source;
}
public String getDestinaton() {
	return Destinaton;
}
public void setDestinaton(String destinaton) {
	Destinaton = destinaton;
}
public String getDoj() {
	return Doj;
}
public void setDoj(String doj) {
	Doj = doj;
}
public int getNop() {
	return Nop;
}
public void setNop(int nop) {
	Nop = nop;
}
public ModelHome() throws Exception
{
	Class.forName("com.mysql.jdbc.Driver");
con =	DriverManager.getConnection(url1 , username1, password1);
}


public boolean fetch() throws Exception {
String sql ="Select * from flights where source=? and destination=? and AirlineName=?";
 PreparedStatement pstmt =con.prepareStatement(sql);
 pstmt.setString(1, Source);
 pstmt.setString(2, Destinaton);
 pstmt.setString(3, airline_name);
 
 ResultSet set = pstmt.executeQuery();

 if(set.next()==true)
 {  Id =set.getInt(1);
 Flightprice =set.getInt(5);
 	return true;
 }else
 {
 	return false;
 }
	
}
}
