<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import= "java.time.LocalDateTime" %>
<%@ page isELIgnored="false" %>
<%@ taglib uri="jakarta.tags.core" prefix="c" %>

<html>
<head>
<meta charset="ISO-8859-1">
<title> Help page</title>
</head>
<body>
	<h1>This is help page</h1>
	<%
// 		String name=(String)request.getAttribute("name");
// 		Integer id=(Integer)request.getAttribute("id");
// 		LocalDateTime time=(LocalDateTime)request.getAttribute("time");
	%>
	<h1>Hello My name is:
			${name }
	</h1>
	
	<h1>My Lucky number is:
		${id }
	</h1>
	
	<h1>My Local Time is:
		${time }
	</h1>

	<c:forEach var="item" items="${numbers }" >
		<h1>${item}</h1>
	
	</c:forEach>
	
	
	
</body>
</html>