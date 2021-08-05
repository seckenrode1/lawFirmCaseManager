<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
</head>
<body>
	<h1>Register Here</h1>
	<form:form action="createStaff" method="post" modelAttribute="staff">
		<div>
			<form:label path="staffFirstName">First Name:</form:label>
			<form:input path="staffFirstName" />
			<form:errors path = "staffFirstName"/>
		</div>
		<div>
			<form:label path="staffLastName">Last Name:</form:label>
			<form:input path="staffLastName" />
			<form:errors path = "staffFirstName"/>
		</div>
		<div>
			<form:label path="staffEmail">Email:</form:label>
			<form:input path="staffEmail" />
			<form:errors path = "staffEmail"/>
		</div>
		<div>
			<form:label path="staffPassword">Password:</form:label>
			<form:input path="staffPassword" />
			<form:errors path = "staffPassword"/>
		</div>
		<div>
			<input type="submit" value="Create User" />
		</div>
	</form:form> 
	        <div id = "footer">
            <a href="${pageContext.request.contextPath}/">Login Here</a>
        </div>
</body>
</html>