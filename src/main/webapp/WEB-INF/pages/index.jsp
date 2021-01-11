<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List of Feedbacks</title>
</head>
<body>

<a href="feedback">Add Feedback</a>
<br/>

<h1 style="color:blue">List of Feedback</h1>
	<ul>
		<c:forEach items="${list}" var="l">
			<li>${l.feedback}</li>
		</c:forEach>
		<% %>
	</ul>
</body>
</html>