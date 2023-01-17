package com.simpli;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ModelLogin {
	public String url1 = "jdbc:mysql://localhost:3306/simpli_check12";
public 	String username1 = "root";
	public String password1 = "root";

String username;
String password;
int id;

private Connection con;
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}


public ModelLogin() throws Exception
{
	Class.forName("com.mysql.jdbc.Driver");
con =	DriverManager.getConnection(url1, username1, password1);
}



public boolean verify() throws Exception {
	String sql = "Select * from admin where username=? and password=?";
PreparedStatement pstmt=	con.prepareStatement(sql);
pstmt.setString(1, username);
pstmt.setString(2, password);

ResultSet set = pstmt.executeQuery();

if(set.next()==true)
{  id = set.getInt(1);
	return true;
}else
{
	return false;
}
}
}
