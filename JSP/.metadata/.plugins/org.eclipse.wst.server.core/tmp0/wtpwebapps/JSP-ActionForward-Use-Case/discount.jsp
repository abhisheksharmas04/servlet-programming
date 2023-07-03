<%@ page language="java" contentType="text/html; charset=ISO-8859-1" isELIgnored="false" pageEncoding="ISO-8859-1"%>

<!-- read additional request parameters given by  billing.jsp page -->
<%
	float billAmount = Float.parseFloat(request.getParameter("billAmount"));
	
	// provide discount based on bill Amount
	float discount = 0.0f;
	if(billAmount >=100000)
		discount = billAmount * 0.3f; // 30%
	else if( billAmount >= 80000)
		discount = billAmount * 0.2f; //20%
		
	else
		discount = billAmount * 0.1f; //20%
%>

	<h1 style="color: blue; text-align: center">Bill Details are</h1>
	<h2 style="color: blue; text-align: center">Item Name::<%= request.getParameter("iname") %> </h2>
	<h2 style="color: blue; text-align: center">Item Price::<%= request.getParameter("iprice") %> </h2>
	<h2 style="color: blue; text-align: center">Item Qty::<%= request.getParameter("iqty") %> </h2>
	<h2 style="color: blue; text-align: center">Bill Amount<%= billAmount %> </h2>
	<h2 style="color: blue; text-align: center">Discount Amount<%= discount %> </h2>
	<h2 style="color: blue; text-align: center">Final Bill Amounth<%= (billAmount-discount)%> </h2>
	
	<br> <a href="input.html">HOME</a>
