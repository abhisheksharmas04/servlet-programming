package com.ab.filter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ab.wrapper.MyRequest;
import com.ab.wrapper.MyResponse;

@WebFilter("/loginurl")
public class LoginFilter extends HttpFilter implements Filter {

	public void doFilter(HttpServletRequest request, HttpServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		// create custome request object
		MyRequest myRequest = new MyRequest(request);
		
		// create cutome response object
		MyResponse myResponse = new MyResponse(response);
		
		chain.doFilter(myRequest, myResponse);
		
		System.out.println(myResponse.toString());
		String output = myResponse.toString();
		
		// Modify the output
		output = output+"<br>" + "<b>from Abhishek</b>";
		
		// get printwriter object pointing to original printwriter object
		PrintWriter writer = response.getWriter();
		writer.print(output);
		
	}

}
