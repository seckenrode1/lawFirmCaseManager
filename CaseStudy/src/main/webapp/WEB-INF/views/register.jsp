<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html lang = "en">
<head>
<meta charset="UTF-8">
<title>Register Page</title>
</head>
<body>
 	<h1>Registration Page</h1>
		<form:form action="registerNewStaff" method="post" modelAttribute="newStaff">
		<div>
			<label>Staff Email:</label>
			<form:input type="text" path="staffEmail" name="staffEmail"/>
			<form:errors path="staffEmail" cssClass="error" />
		</div>
		<div>
			<label>Password:</label>
			<form:input type="text" path="staffPassword" name="staffPassword" />
			<form:errors path="staffPassword" cssClass="error" />
		</div>
		<div>
			<input type="submit" value="Submit" />
		</div>
	</form:form>
	<a href="/">Cancel</a>
</body>
</html>