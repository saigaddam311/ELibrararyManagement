<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
${message}
<body>
<table>
<form action="${pageContext.request.contextPath}/savebook">
<tr><td>BookNo:</td><td><input type="text" name="bookno"/></td></tr></br>
<tr><td>Name:</td><td><input type="text" name="name"/></td></tr></br>
<tr><td>Author:</td><td><input type="text" name="author"/></td></tr></br>
<tr><td>Publisher:</td><td><input type="text" name="publisher"/></td></tr></br>
<tr><td><input type="submit" value="SaveBook"/> <a href="${pageContext.request.contextPath}/librarian.jsp">Back</a> </td></tr></br>
</form>
</table>
</body>
</html>