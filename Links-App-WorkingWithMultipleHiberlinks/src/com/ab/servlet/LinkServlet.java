package com.ab.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Locale;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LinkServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		super.init(config);
	}

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter pw = resp.getWriter();
		resp.setContentType("text/html");
		
		// read additional request value
		String pval = req.getParameter("s1");
		
		//get all the avaialbe local of this world
		Locale local[] = Locale.getAvailableLocales();
		
		// differentiate logics for hyperlinks
		if(pval.equalsIgnoreCase("link1")) {
			pw.println("<h2 style='color:red; text-align: center'> All Languages are </h2>");
			pw.println("<ol>");
			for(Locale l : local) {
				pw.println("<li> <b>" + l.getDisplayLanguage() + "</b></li>");
			}
			pw.println("</ol>");
		}else if(pval.equalsIgnoreCase("link2")) {
			pw.println("<h2 style='color:red; text-align: center'> All Countries are </h2>");
			pw.println("<ol>");
			for(Locale l : local) {
				pw.println("<li> <b>" + l.getDisplayCountry() + "</b></li>");
			}
			pw.println("</ol>");
		}else {
			pw.println("<h2 style='color:red; text-align: center'> All System Properties </h2>");
			pw.println(System.getProperties());
		}
		
		// add hyperlink
		pw.println("<br> <a href ='links.html'>Home Page</a>");
	}

	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}

}
