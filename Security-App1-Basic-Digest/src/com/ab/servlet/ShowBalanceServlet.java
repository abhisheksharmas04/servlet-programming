package com.ab.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(description = "This will give the balance information", urlPatterns = { "/showbalance" })
public class ShowBalanceServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter writer = response.getWriter();
		response.setContentType("text/html");
		writer.println("<h1 style='color:red'>Authentication Mode: " + request.getAuthType() +"</h1>");
		writer.println("<h1 style='color:red'>UserName: " + request.getUserPrincipal() + "</h1>");
		
		//write business logic
		writer.println("<br><h1 style='color:red'>UserName: " + new Random().nextInt(20000) + "</h1>");
		
		response.getWriter().append(" <br> Served at: ").append(request.getContextPath());
		
		writer.close();
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
