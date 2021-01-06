<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@page import= "com.test.model.User" %>
	<% User user = (User) request.getAttribute("user"); %>    
	
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Saved page</title>
</head>
<body>
	<p>User id ${user.getId()} has been updated to name ${user.getName()} </p>
</body>
</html>