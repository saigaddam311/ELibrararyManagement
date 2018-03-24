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
<div class="container">
<header><h3>All The Details are Mentioned In Librarian</h3></header>
<nav><ul>
<li><a href="${pageContext.request.contextPath}/jsps/addbook.jsp">Addbook</a></li></br>
<li><a href="<core:url value="viewbooks"/>" >ViewBook</a></li>
<%-- <li><a href="${pageContext.request.contextPath}/jsps/viewbook.jsp">ViewBook</a></li></br> --%>
<li><a href="${pageContext.request.contextPath}/jsps/issuebook.jsp">IssueBook</a></li></br>
<li><a href="${pageContext.request.contextPath}/jsps/viewissuebook.jsp">ViewIssuedBooks</a></li></br>
<li><a href="${pageContext.request.contextPath}/jsps/returnbook.jsp">ReturnBooks</a></li></br>
</ul></nav></div>
</body>
</html>