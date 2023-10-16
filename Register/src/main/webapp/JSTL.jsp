<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page errorPage="Error_page.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title> jstl page</title>
</head>
<body>
	<h1>Taglib Directive Tutorial: </h1>
	<hr>
	<%!
	int a=20;
	int b=0;
	%>
	
	<%
	int division=a/b;
	%>
	
	<h1>Division:<%=division %></h1>
<%-- 	<c:set var="name" value="apple Store"></c:set> --%>
<%-- 	<c:out value="${name }"></c:out> --%>
<%-- 	<c:if test="${3<2 }"> --%>
<!-- 		<h1>this is true block: 3>2</h1> -->
<%-- 	</c:if> --%>


</body>
</html>