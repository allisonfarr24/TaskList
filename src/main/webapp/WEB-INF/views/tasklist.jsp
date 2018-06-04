<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Task List</title>
</head>
<body>

	<h1>This is the Task List page</h1>


	<form action="taskform">
	
		<input type="submit" value="Add New Task">

	</form> 
	
	
	<table border="1">
		<thead>
			<tr>
				<th>IdEmail</th>
				<th>Description</th>
				<th>DueDate</th>
				<th>Complete</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="task" items="${task }">
				<tr>
					<td>${task.idemail }</td>
					<td>${task.description }</td>
					<td>${task.duedate }</td>
					<td>${task.complete }</td>
				</tr>

			</c:forEach>
			
			<c:forEach var="task" items="${task1 }">
				<tr>
					<td>${task.idemail }</td>
					<td>${task.description }</td>
					<td>${task.duedate }</td>
					<td>${task.complete }</td>
				</tr>

			</c:forEach>
		</tbody>
	</table>






</body>
</html>