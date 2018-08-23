<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create Location</title>
</head>
<body>
<form action="updateLocation" method="post">
ID : 	<input type="text" name="id" value="${location.id}" readonly/> <br>
Code : 	<input type="text" name="code" value="${location.code}"/> <br>
Name : 	<input type="text" name="name" value="${location.name}"/> <br>
Type : 	Urban <input type="radio" name="type" value="urban" ${location.type=="urban"?'checked':''}/>
		Rural <input type="radio" name="type" value="rural" ${location.type=="rural"?'checked':''}/><br>
		<input type="submit" value="save" />
</form>

</body>
</html>