<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Scriptlet jsp</title>
</head>
<body>
	<h3>Hello World of Java!</h3>
	<%
	for(int i = 1; i <= 5; i++)
	{
		out.println("<br/> Java is good programming language: " + i);
	}
	%>
</body>
</html>