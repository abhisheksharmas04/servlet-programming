package com.ab.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class VoterServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter pw = resp.getWriter();
		resp.setContentType("text/html");

		// Read form Date:
		String name = req.getParameter("pname");
		float age = Float.valueOf(req.getParameter("page"));
		String address = req.getParameter("paddress");
		
		// form validation logic server side
		List<String>errorList = new ArrayList<String>();
		//-- on person name
		if(name == null || name.length() == 0 || name.equals("")) {
			errorList.add("Person Name is required");
		}else if(name.length() <10) {
			errorList.add("Person name should be 10 character long");
		}
		// -- for age
		int age1=0;
		try {
			age = Integer.parseInt(req.getParameter("page"));
			if(age<1 || age<125) {
				errorList.add("Person age must be there 1 through 125");
			}
		} catch (NumberFormatException e) {
			errorList.add("Age must be numeric");
		}
		
		// -- on person address
		if (address == null || address.length() == 0 || address.equals("")) {
			errorList.add("Person address is required");
		}
		
		// Display form valaidation errors:
		if(errorList.isEmpty()) {
			pw.println("<ul style='color:red'>");
				for(String errorMsg:errorList) {
					pw.println("<li>" + errorMsg + "</li>");
				}
			pw.println("</ul>");
			return;
		}

		// business logic
		if (age <= 18) {
			pw.println("<h1 style='color:red text-align:center'>Mr/Miss/Mrs " + name
					+ "you are not eligible for voting. </h1>");
		} else {
			pw.println("<h1 style='color:Green text-align:center'>Mr/Miss/Mrs " + name
					+ " you are eligible for voting. </h1>");
		}

		pw.println("<a href='form.html'></a>");
		pw.close();
	}

}
