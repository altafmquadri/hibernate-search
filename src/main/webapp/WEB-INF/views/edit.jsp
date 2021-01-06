<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    %>
<%@page import= "com.test.model.User" %>

<% User user = (User) request.getAttribute("user"); %>    

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit User</title>
</head>
<body>
	<form method="post" action="/edit">
		Id: <input type="text" name="id" value=${user.getId()}>
		Name: <input type="text" name="name" placeholder=${user.getName()}>
		<button type="submit">Edit</button> 
	</form>
</body>
</html>