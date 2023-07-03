package com.ab.filter;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebFilter("/*")
public class DoublePostingPreventingFileter extends HttpFilter {

	private static final long serialVersionUID = 1L;
	
	@Override
	public void doFilter(HttpServletRequest req, HttpServletResponse res, FilterChain chain)
			throws IOException, ServletException {
		// create Local Session object 
		HttpSession session = req.getSession();
		
		if(req.getMethod().equalsIgnoreCase("GET")) {
			// create server side token as session attribute.
			session.setAttribute("sToken",new Random().nextInt(10000));
			chain.doFilter(req, res);
		}else {
			int cToken = Integer.parseInt(req.getParameter("ctoke"));
			// read stoken value from session object:
			int serverToken = (int) session.getAttribute("sToken");
			
			if(cToken == serverToken) {
				// change server token value
				session.setAttribute("sToken",new Random().nextInt(10000));
				chain.doFilter(req, res);
			}else {
				PrintWriter pw = res.getWriter();
				res.setContentType("text/html");
				pw.println("<h1 style:'color:red;text-align:center'>Double Posting is not allowed</h1>");
				pw.println("<br> <a href='input.jsp'></a>");
			}
		}
		
	}

}
