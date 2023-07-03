package com.ab.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/searchurl")
public class SearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		response.setContentType("text/html");
		
		String searchString = request.getParameter("ss");
		
		// Generate dynamic web page having hyperlink pointing to google search component
		pw.println("<br><br>");
		pw.println("<h3 style='color:blue;text-align:center'><a href='https://www.google.com/search?q=hibernate'>Go to Google </a> </h3>");
		
		pw.close();
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

/*
 -> Every response sends response status code to browser indiciating the received output
 is suces/error/info/ and etc.. Based on the status code and response headers the
 browser becomes to perform next acitivity displaying web page or making content as 
 downloadable file or displaying error code etc.
 
 100-199 (1xxx) : Information (Suggestion to enduser)
 200-299 (2xx): Success (Web page will be displayed having output)
 300-399 (3xx): Redirection (The request given to one website will be redirect to another websit)
 400-499 (4xx): Incomplete URL
 500-599 (5xx): Server Error
 */
