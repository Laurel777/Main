package com.simpli;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/ChangePassword")
public class ChangePassword extends HttpServlet{
private Connection con;
private PreparedStatement pstmt;
private PrintWriter writer;

@Override
protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	resp.sendRedirect("/Project4/PasswordChange.html");
}
}