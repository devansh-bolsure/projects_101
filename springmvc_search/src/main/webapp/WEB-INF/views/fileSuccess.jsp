<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false" %>
<%@ taglib uri="jakarta.tags.core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>File uploaded result</title>
</head>
<body>
	<h1>${msg}</h1>
	<h1>images are not showing otherwise program is runnig smoothly</h1>
	<img alt="image profile" src="<c:url value="/resources/images/${filename}" />"/>
</body>
</html>