package com.abhi.mime;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class ExcelServlet extends javax.servlet.http.HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		PrintWriter pw = res.getWriter();
		res.setContentType("text/html");
		
		pw.print("<table align='center' row='5' cols='2'>");
		pw.print("<tr><th>Politician Name </th> <th> Political Party </th> </tr>");
		pw.print("<tr><td>Modi</td> <td> BJP </td> </tr>");
		pw.print("<tr><td>Rahul</td> <td> INC </td> </tr>");
		pw.print("<tr><td>Mamta</td> <td> TMC </td> </tr>");
		pw.print("<tr><td>KCR</td> <td> TRS </td> </tr>");
		pw.print("</table>");
		
		pw.close();
		
	}
	

}
