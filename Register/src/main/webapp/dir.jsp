
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
 <%@page import="java.util.Random,java.util.ArrayList,java.io.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Jsp page</title>

<style >
	*{
	
		margin:0px;
		padding:opx;
		
	
	}

</style>
</head>
<body>
	
	<%@include file="header.jsp" %>
	
	<h1>Random number : 
		<%
		Random r=new Random();
		int n=r.nextInt(6);
		
		%>
		<%=n %>
	
	
	</h1>

</body>
</html>