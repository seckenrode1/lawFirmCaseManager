<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang = "en">
<head>
<meta charset="ISO-8859-1">
<link rel = "stylesheet" type = "text/css" href = "css/caseManager.css">
<link rel = "javascript" type = "text/javascript" href = "js/caseManager.js">
<title>Login</title>
</head>
<body>
     <div id = "header">
        <h1>WSWC Case Manager</h1><br>
    </div>
	<form action="./index" id = "flex-container" id = "form">
		<div>
			<label>Login Here!</label><br>
			<input type="email" name="empEmail" placeholder = "Email"> <br>
			<input type="password" name="Password" placeholder= "Password"><br>
			<input type="submit" value="Login"><br>
		</div>
	</form>
        <div id = "footer">
            <a href="aboutUs">About Us</a>
        </div>
</body>
	
</html>