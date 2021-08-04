<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang = "en">
<head>
<meta charset="ISO-8859-1">
<link rel = "stylesheet" type = "text/css" href = "css/caseManager.css">
<title>Index Page</title>
</head>
<body>
	<h1>Index Page</h1>
		<a href = "home"> Home</a><br>
 		<a href = "${pageContext.request.contextPath}/">Login</a><br>
	<form action="./search" method="POST">
		<div>
			<label>Search</label>
			<input type="text" name="ClientNum">
			<input type="submit" value="Search">
		</div>
	</form> 
</body>
	
</html>