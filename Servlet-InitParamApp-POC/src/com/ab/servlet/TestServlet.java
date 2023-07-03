package com.ab.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TestServlet extends HttpServlet{

	private static final long serialVersionUID = 1L; 
	private ServletConfig config;
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("Driver Init Param Value: " + config.getInitParameter("driver"));
		System.out.println("UserName Init Param Value: " + config.getInitParameter("dbuser"));
		this.config = config;
		
		ServletContext ctx = config.getServletContext();
		ctx.
		System.out.println("Ctx Path: " + ctx.getContextPath());
		System.out.println("Driver Init ServletContext: " + config.getServletContext());
		System.out.println("Driver Init Param Value: " + config.getServletName());
		System.out.println("UserName Init Param Value: " + config.getInitParameter("dbuser"));
	}
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter pw = resp.getWriter();
		resp.setContentType("text/html");
		
		pw.println("Driver Init Param Value: " + config.getInitParameter("driver"));
		pw.println("UserName Init Param Value: " + config.getInitParameter("dbuser"));
		
		pw.close();
	}
	
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}

}
