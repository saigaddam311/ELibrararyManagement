<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript">
function librarianLoginButton() {
	document.forms[0].action="${pageContext.request.contextPath}/librarianLoginButton";
	document.forms[0].submit();
}
function librarianForgotPasswordButton() {
	document.forms[0].action="${pageContext.request.contextPath}/librarianForgotPasswordButton";
	document.forms[0].submit();
}
</script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div align = "center">
<form action="">
<font color = "blue"><h1>Library Management</h1></font>
<font color = "blue"><h3>Librarian Login Page</h3></font>
<font color = "red">${message}</font>
<table>
<tr><td>UserName : </td> <td> <input type="text" name = "librarianEmail" /></td></tr>
<tr><td>Password : </td> <td> <input type="text" name = "librarianPassword" /></td></tr>
<tr><td><input type = "button" onclick="librarianLoginButton()" value = "Login"/></td>
<td><input type = "button" onclick="librarianForgotPasswordButton()" value = "Forgot Password"/></td></tr>
</table>
</form>
</div>
</body>
</html>