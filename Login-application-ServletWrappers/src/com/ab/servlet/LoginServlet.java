package com.ab.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/loginurl")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Request Object class Name: " + request.getClass());
		System.out.println("Response Object class Name: " + response.getClass());
		// get printwriter
		PrintWriter pw = response.getWriter();
		response.setContentType("text/html");
		
		String username = request.getParameter("username");
		System.out.println(username);
		String passwrod = request.getParameter("password");
		
		if(username.equalsIgnoreCase("Raja") && passwrod.equalsIgnoreCase("Rani")) {
			pw.println("<h1 style='color:green;text-align:center'> valid User</h1>");
		}else {
			pw.println("<h1 style='color:red;text-align:center'> Invlaid User</h1>");
		}
		
		pw.println("<br> <a href='login.html'></a>");
		pw.close();
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
