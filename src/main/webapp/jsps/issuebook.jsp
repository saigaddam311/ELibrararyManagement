<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table>
<form action="${pageContext.request.contextPath}/issuebook">
<tr><td>StudentID:</td><td><input type="text" name="stdid"/></td></tr></br>
<tr><td>StdName:</td><td><input type="text" name="stdname"/></td></tr></br>
<tr><td>StdMobile:</td><td><input type="text" name="stdmobile"/></td></tr></br>
<tr><td><input type="submit" value="IssueBook"/> <a href="librarian.jsp">Back</a> </td></tr></br>
</form>
</table>
</body>
</html>