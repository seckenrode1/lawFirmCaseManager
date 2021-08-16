<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
<link href="css/custom.css" rel="stylesheet" type="text/css">
</head>
<body>
	<div>
	<h1>Login Page</h1></div>
	<fieldset>
		<legend>Login Page</legend>
		<form action="./login" method="POST">
			<div>
				<label>Email:</label>
				<input type="text" name="staffEmail" />
			</div>
			<div>
				<label>Password:</label>
				<input type="text" name="staffPassword" />
			</div>
			<div>
				<input type="submit" value="login" />
			</div>
		</form>
	</fieldset>
		<a href="/register">Register Here</a>
</body>
</html>