<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Welcome to login
<form method="post">

<font color="red">${errorMessage}</font>
<br/>
Name:<input type="text" name="uname"/>
<br/>
Password:<input type="password" name="pass"/>

<button type="submit">login</button>
</form>
</body>
</html>