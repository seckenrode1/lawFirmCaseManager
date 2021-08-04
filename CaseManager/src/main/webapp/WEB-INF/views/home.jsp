<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel = "stylesheet" type = "text/css" href = "css/caseManager.css">
<title>Home Page</title>
</head>
<body>
	<h1>Home Page</h1>
 	<a href = "${pageContext.request.contextPath}/">Login</a><br>
 	 <a href = "${pageContext.request.contextPath}/index">Index</a><br>
 	 	<p>
	Name:<span> ${client.fName} ${client.lName}</span>
	</p>
 	   
</body>
</html>