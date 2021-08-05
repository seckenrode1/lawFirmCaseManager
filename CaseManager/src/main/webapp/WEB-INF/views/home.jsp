<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel = "stylesheet" type = "text/css" href = "css/caseManager.css">
<title>Home Page</title>
</head>
<body>
	<h1>Home Page</h1>
		<form:form action="createContact" method="post" modelAttribute="contact">
		<div>
			<form:label path="contactFirstName">First Name:</form:label>
			<form:input path="contactFirstName" />
			<form:errors path = "contactFirstName"/>
		</div>
		<div>
			<form:label path="contactLastName">Last Name:</form:label>
			<form:input path="contactLastName" />
			<form:errors path = "contactLastName"/>
		</div>
		<div>
			<form:label path="contactEmail">Email:</form:label>
			<form:input path="contactEmail" />
			<form:errors path = "contactEmail"/>
		</div>
		<div>
			<form:label path="contactAddress">Street Address:</form:label>
			<form:input path="contactAddress" />
			<form:errors path = "contactAddress"/>
		</div>
				<div>
			<form:label path="contactCity">City:</form:label>
			<form:input path="contactCity" />
			<form:errors path = "contactCity"/>
		</div>
		<div>
			<input type="submit" value="Create New Contact" />
		</div>
	</form:form> 
	
 	<a href = "${pageContext.request.contextPath}/">Login</a><br>
 	 	<p>
	Name:<span> ${contact.contactFirstName} ${contact.contactLastName}</span>
	</p>
 	   
</body>
</html>