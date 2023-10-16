<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>First JSP Page</title>
</head>
<body>
	<h1>Hello World!</h1>	
	<%!
		int a=50;
		int b=60;
		String name="Techsoft India";
	
		public int dosum()
		{
			return a+b;
		}
		
		public String reverse()
		{
			StringBuffer br= new StringBuffer(name);
			return br.reverse().toString();
			
		}
	
	%> 
	
	<% 
// 	out.println(a);
// 	out.println("<br>");
// 	out.println(b);
// 	out.println("<br>");
// 	out.println("Sum is:"+dosum());
	
// 	out.println("reverse is:"+reverse());
	
	%>
	
	<h1>Sum is :<%=dosum() %></h1>
</body>
</html>