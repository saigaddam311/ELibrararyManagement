<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript">
function adminLoginButton() {
	document.forms[0].action="${pageContext.request.contextPath}/adminLoginButton";
	document.forms[0].submit();
}
function adminNewRegistrationButton() {
	document.forms[0].action="${pageContext.request.contextPath}/adminNewRegistrationButton";
	document.forms[0].submit();
}
function adminForgotPasswordButton() {
	document.forms[0].action="${pageContext.request.contextPath}/adminForgotPasswordButton";
	document.forms[0].submit();
}
</script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<div align = "center">
<form action="adminLoginButton">
<font color = "blue"><h1>Library Management</h1></font>
<font color = "blue"><h3>Admin Login Page</h3></font>
<font color = "red">${message}</font>
<table>
<tr><td>UserName : </td> <td> <input type="text" name = "username" /></td></tr>
<tr><td>Password : </td> <td> <input type="text" name = "password" /></td></tr>
<tr><td><input type = "button" onclick="adminLoginButton()" value = "Login"/></td>
<td><input type = "button" onclick="adminNewRegistrationButton()" value = "New Registration"/></td>
<td><input type = "button" onclick="adminForgotPasswordButton()" value = "Forgot Password"/></td></tr>
</table>
</form>
</div>
</body>
</html>