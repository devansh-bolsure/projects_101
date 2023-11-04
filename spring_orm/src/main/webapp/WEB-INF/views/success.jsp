<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1 align="center">${Header1}</h1>
	<hr>
	<h1>Welcome: ${user.username}</h1>
	<h1>Your Email is: ${user.useremail}</h1>
	<h1>Your Password is: ${user.userpassword} keep it safe</h1>
</body>
</html>