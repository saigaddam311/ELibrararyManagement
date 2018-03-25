<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="">
		<table border="1">
		<tr>
			<th>BookNo</th>
			<th>Name</th>
			<th>Author</th>
			<th>Publisher</th>
			</tr>
			<core:forEach var="ver" items="${message}">
			<tr>
			<td>${ver.bookno}</td>
			<td>${ver.name}</td>
			<td>${ver.author}</td>
			<td>${ver.publisher}</td>
			</tr>
			</core:forEach>
		</table>
	</form>
</body>
</html>