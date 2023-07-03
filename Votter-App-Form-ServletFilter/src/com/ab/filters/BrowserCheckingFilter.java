package com.ab.filters;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BrowserCheckingFilter extends HttpFilter {

	private static final long serialVersionUID = 1L;
	
	public BrowserCheckingFilter() {
		System.out.println("BrowserCheckingFilter.0-Param Constructor");
	}
	
	static {
		System.out.println("BrowserCheckingFilter.enclosing_method() static block");
	}
	
	@Override
	public void init() throws ServletException {
		System.out.println("BrowserCheckingFilter.init()");
	}
	
	@Override
	protected void doFilter(HttpServletRequest req, HttpServletResponse res, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("BrowserCheckingFilter.doFilter()");
		String browser = req.getHeader("user-agent");
		if(!browser.contains("Chrome")) {
			PrintWriter pw = res.getWriter();
			pw.println("<br>Request Must be from Chrom browser</br>");
			 return;
		}else {
			chain.doFilter(req, res);
		}
	}
	
	@Override
	public void destroy() {
		System.out.println("BrowserCheckingFilter.destroy()");
	}

}
