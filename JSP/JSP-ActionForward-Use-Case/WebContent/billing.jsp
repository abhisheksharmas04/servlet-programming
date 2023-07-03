<%@ page language="java" contentType="text/html; charset=ISO-8859-1"pageEncoding="ISO-8859-1" isELIgnored="false"%>

<!-- read form data -->
<%
	String name = request.getParameter("iname");
	float qty = Float.parseFloat(request.getParameter("iqty"));
	float price = Float.parseFloat(request.getParameter("iprice"));
	
	// calclulate bill amounth	
	float billAmount = qty * price;
	
	if(billAmount >= 50000){
%>
	<jsp:forward page="discount.jsp">
		<jsp:param value="<%= billAmount %>"  name="billAmount"/>
	</jsp:forward>
	
<%} else{%>
	<h1 style="color: blue; text-align: center">Bill Details are</h1>
	<h2 style="color: blue; text-align: center">Item Name::<%= name %> </h2>
	<h2 style="color: blue; text-align: center">Item Price::<%= price %> </h2>
	<h2 style="color: blue; text-align: center">Item Qty::<%= qty %> </h2>
	<h2 style="color: blue; text-align: center">Bill Amount<%= billAmount %> </h2>
	
<%}%>

<br> <a href="input.html">HOME</a>