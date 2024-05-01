<!DOCTYPE html>
<html>
	<head>	
		<meta charset="ISO-8859-1">
		<title>Insert title here</title>
	</head>
	<body>
		<h2>Welcome</h2>
		<%
		java.time.LocalDateTime currentDateTime = java.time.LocalDateTime.now();
		
		String userName = request.getParameter("username");
		
		out.println("<p>Hello," + userName + "!Welcome to Login Appllication </p>");
		out.println("<p>You have successfully  loged in at " + currentDateTime + ". </p>");
		%>
	</body>
</html>