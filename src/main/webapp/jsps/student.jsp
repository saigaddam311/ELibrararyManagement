<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/register">
RollNo:<input type="text" name="rollno"></br>
StudentName<input type="text" name="stdname"></br>
StudentMobile<input type="text" name="stdmobile"></br>
<input type="submit" value="register">
</form>
</body>
</html>