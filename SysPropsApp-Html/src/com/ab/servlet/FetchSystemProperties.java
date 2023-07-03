package com.ab.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FetchSystemProperties extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// get Printwriter:
		PrintWriter printwriter = res.getWriter();
		
		// set response content type:
		res.setContentType("text/html");
		
		// Get all System properties
		Properties props = System.getProperties();
		/*Properties is the sub class of java.util.HashTable (c) allows only string as key and values*/
		
		// write output to response object
		printwriter.println(props);
		printwriter.println("<br><br><a href='http://localhost:8080/SysPropsApp-Html/page.html'></a>");
		
		printwriter.close();
	}
	
	

}
