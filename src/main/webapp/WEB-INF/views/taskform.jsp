<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Task Form</title>
</head>
<body>
	<h3>Create a New Task Here:</h3>


	<form action="/add" method="post">
		<br><br>Email: <input type="text" name="idemail">
		<br><br>Description: <input type="text" name="description"> 
		<br><br>Due Date: <input type="text" name="duedate"> 
		<br><br>Complete <input type="checkbox" name="complete">
		<input type="submit" value="Submit"> 
	</form> 


</body>
</html>