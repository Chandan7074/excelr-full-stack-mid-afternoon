<html>
	<head>
	<title>Student Confirmation</title>
	</head>
	<body>
	The student is confirmed: ${param.firstName} ${param.lastName }
	<br><br>
	The Student's country: ${param.country}
	<br><br>
	The Student's favorite programming language: ${param.favoriteLanguage}
	<br><br>
	The Student's favorite Web browsers: ${param.favoriteBrowsers}
	<br><br>
	The Students's favorite web Browsers:
	<ul>
	<li><p><b>Favorite?
	<%= request.getParameter("chrome") %></p></li>
	<li><p><b>Favorite?
	<%= request.getParameter("safari") %></p></li>
	<li><p><b>Favorite?
	<%= request.getParameter("edge") %></p></li>
	<li><p><b>Favorite?
	<%= request.getParameter("brave") %></p></li>
	<li><p><b>Favorite?
	<%= request.getParameter("firefox") %></p></li>
	</ul>
	
	<br><br>
	
	<br><br>
	<p>The Students's favorite IDEs:</p>
	<% String s[] =  request.getParameterValues("fav");
	if (s != null && s.length != 0){
		for(String fav: s){%>
		<ul><li></li><%out.println(fav); %></ul>
	<% }%>
	<% }%>
		</body>
</html>