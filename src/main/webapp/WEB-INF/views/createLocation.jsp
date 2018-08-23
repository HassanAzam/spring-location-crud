<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create Location</title>
</head>
<body>
<form action="saveLocation" method="post">
ID : 	<input type="text" name="id"/> <br>
Code : 	<input type="text" name="code"/> <br>
Name : 	<input type="text" name="name"/> <br>
Type : 	Urban <input type="radio" name="type" value="urban"/>
		Rural <input type="radio" name="type" value="rural"/><br>
		<input type="submit" value="save" />
</form>
${msg}

<a href="displayLocations">Display Locations</a>
</body>
</html>