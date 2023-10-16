<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>this is home page</title>
</head>
	<body>
	
		<h1>welcome to home page</h1>
		<%
			String name=(String)request.getAttribute("name");
			Integer id=(Integer) request.getAttribute("id");
			List<String>friends=(List<String>)request.getAttribute("f");
		%>
		
		<h1>Name is <%= name %> </h1>
		<h1>Id is <%= id %></h1>
		
		<%
			for(String s:friends)
			{
		%>
				<h1><%=s %></h1>
		<% 		
			}
		%>
	
	</body>
</html>